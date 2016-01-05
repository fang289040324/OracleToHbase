package com.navinfo.sqoop

import java.text.SimpleDateFormat
import java.util.Date

import com.navinfo.util._
import org.apache.log4j.Logger
import org.apache.sqoop.Sqoop
import org.quartz.{Job, JobExecutionContext}

import scala.collection.mutable.ArrayBuffer

/**
  * Title. <br>
  * Description.
  * <p>
  * Copyright: Copyright (c) 2015-12-24 13:16
  * <p>
  * Company: 北京四维图新科技股份有限公司
  * <p>
  * Author: fangshaowei
  * <p>
  * Version: 1.0
  * <p>
  */
class OracleToHbase extends Job {
  override def execute(jobExecutionContext: JobExecutionContext): Unit = {
    inputDataToHbase(takeHbaseNotExistTables())
  }

  def takeHbaseNotExistTables(): Array[DBInfo] = {
    takeTables(OracleUtil.takeAllTablesInfo(OracleToHbase.prop), (x, y) => x.tablesName.filter(!y.contains(_)))
  }

  private def takeTables(dBInfos: Array[DBInfo], f: (DBInfo, Array[String]) => Array[String]): Array[DBInfo] = {
    val hbaseTables: Array[String] = HBaseUtil.getTableNames

    val buffer: ArrayBuffer[DBInfo] = ArrayBuffer()
    dBInfos.foreach(info => {
      buffer += DBInfo(info.username, info.password, f(info, hbaseTables), info.url, info.poiSql, info.linkSql, info.modifySql)
    })
    buffer.toArray
  }

  def inputDataToHbase(tables: Array[DBInfo]): Unit = {

    val array: Array[String] = tables.flatMap(_.tablesName).filter(s => s != null && s.length > 0)
    OracleToHbase.log.info(if (array.length > 0) "未导入hbase表：" + array.reduce(_ + "," + _) else "表已经全部导入")

    tables.foreach(info => {
      info.tablesName.foreach(name => {
        HBaseUtil.createTable(name.toUpperCase, Array(OracleToHbase.HBASE_FAMILY), isReplace = true)
        OracleToHbase.log.info("表 " + name + " 开始导入")
        val result = Sqoop.runTool(setSqoopCommand(info.url, info.username, info.password, info.poiSql, info.linkSql, info.modifySql, name, OracleToHbase.SPLITCOL,
          name.toUpperCase, OracleToHbase.HBASE_FAMILY, OracleToHbase.ROWKEY), HBaseUtil.conf)
        if (result == 1) {
          OracleToHbase.log.info(name + " 表导入hbase结果为：失败")
          HBaseUtil.deleteTable(name.toUpperCase())
        } else {
          OracleToHbase.log.info(name + " 表导入hbase结果为：成功")
        }
      })
    })
  }

  def setSqoopCommand(url: String, username: String, password: String, poiSql: String, linkSql: String, modifySql: String, tableName: String, splitCol: String,
                      hbaseTable: String, hbaseFamily: String, rowkey: String): Array[String] = {
    val options = ArrayBuffer[String]()
    options += "import"
    options += "--connect"
    options += url
    options += "--username"
    options += username
    options += "--password"
    options += password
    options += "--query"
    options += (
      if (modifySql != null && modifySql.length > 0)
        modifySql.replace(OracleToHbase.TABLE_NAME_FLAG, tableName)
      else if (tableName.contains(OracleToHbase.POI_TABLE_FLAG) && poiSql != null && poiSql.length > 0)
        poiSql.replace(OracleToHbase.TABLE_NAME_FLAG, tableName)
      else if (tableName.contains(OracleToHbase.LINK_TABLE_FLAG) && linkSql != null && linkSql.length > 0)
        linkSql.replace(OracleToHbase.TABLE_NAME_FLAG, tableName)
      else
        null
      )
    options += "--split-by"
    options += splitCol
    options += "--num-mappers"
    options += "16"
    options += "--hbase-table"
    options += hbaseTable
    options += "--column-family"
    options += hbaseFamily
    options += "--hbase-row-key"
    options += rowkey
    if (tableName.contains(OracleToHbase.LINK_TABLE_FLAG)) {
      options += "--append"
      options += "--hbase-bulkload"
    }
    options.toArray
  }

  def takeModifyTables(): Array[DBInfo] = {
    takeTables(OracleUtil.takeAllModifyTablesInfo(OracleToHbase.prop), (x, y) => x.tablesName.filter(y.contains(_)))
  }

  def modifyDataToHbase(tables: Array[DBInfo], prop: Prop): Unit = {
    val format: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd")
    val modifyTime: Long = format.parse(prop.modifyTime).getTime
    val currentTime: Long = format.parse(format.format(new Date())).getTime
    if (currentTime == modifyTime) {
      val array: Array[String] = tables.flatMap(_.tablesName).filter(s => s != null && s.length > 0)
      OracleToHbase.log.info(if (array.length > 0) "需要修改的hbase表：" + array.reduce(_ + "," + _) else "无修改表")

      tables.foreach(info => {
        info.tablesName.foreach(name => {
          OracleToHbase.log.info("表 " + name + " 开始修改")
          val result = Sqoop.runTool(setSqoopCommand(info.url, info.username, info.password, info.poiSql, info.linkSql, info.modifySql, name, OracleToHbase.SPLITCOL,
            name.toUpperCase, OracleToHbase.HBASE_FAMILY, OracleToHbase.ROWKEY), HBaseUtil.conf)
          if (result == 1) {
            OracleToHbase.log.info(name + " 表修改hbase结果为：失败")
          } else {
            OracleToHbase.log.info(name + " 表修改hbase结果为：成功")
          }
        })
      })
    } else {
      OracleToHbase.log.info("无修改表")
    }
  }
}

object OracleToHbase {
  val TABLE_NAME_FLAG = "$tableName"
  val HBASE_FAMILY = "B"
  val ROWKEY = "POINUM"
  val SPLITCOL = "poikind"
  val QUARTZ_TIME = "0 0 0 * * ?"
  val JOB_NAME = "OracleToHbase"
  val POI_TABLE_FLAG = "_POI"
  val LINK_TABLE_FLAG = "_LINK"

  val prop: Prop = PropertiesUtil.loadProData("/home/hadoop/app/orclToHbase/db.properties")

  val log = Logger.getLogger(classOf[OracleToHbase])

  def main(args: Array[String]): Unit = {
    val job = new OracleToHbase
    //    QuartzUtil.addJob(JOB_NAME, job, QUARTZ_TIME)
    job.inputDataToHbase(job.takeHbaseNotExistTables())
    job.modifyDataToHbase(job.takeModifyTables(), prop)

    //    job.takeModifyTables().foreach(info => {
    //      info.tablesName.foreach(x => print(x + " "))
    //      println(info)
    //    })
    //    val a = Array(DBInfo("aaa", "aaa", Array("111", "222", "333"), "aaa"), DBInfo("bbb", "bbb", Array("444", "555", "666"), "bbb"), DBInfo("ccc", "ccc", Array("777", "888", "999"), "ccc"))
    //    a.foreach(db => db.tablesName.foreach(name => println(name + " " + db.username)))
  }
}
