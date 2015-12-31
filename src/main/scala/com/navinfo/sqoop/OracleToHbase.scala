package com.navinfo.sqoop

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
    val dBInfos: Array[DBInfo] = OracleUtil.takeAllTablesInfo(PropertiesUtil.loadProData("/db.properties"))
    val hbaseTables: Array[String] = HBaseUtil.getTableNames

    val buffer: ArrayBuffer[DBInfo] = ArrayBuffer()
    dBInfos.foreach(info => {
      buffer += DBInfo(info.username, info.password, info.tablesName.filter(!hbaseTables.contains(_)), info.url)
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
        val result = Sqoop.runTool(setSqoopCommand(info.url, info.username, info.password, name, OracleToHbase.SPLITCOL,
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

  def setSqoopCommand(url: String, username: String, password: String, tableName: String, splitCol: String,
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
    options += "\"select * from " + tableName + " where $CONDITIONS\""
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
    options.toArray
  }
}

object OracleToHbase {

  val HBASE_FAMILY = "B"
  val ROWKEY = "POINUM"
  val SPLITCOL = "poikind"
  val QUARTZ_TIME = "0 0 0 * * ?"
  val JOB_NAME = "OracleToHbase"

  val log = Logger.getLogger(classOf[OracleToHbase])

  def main(args: Array[String]): Unit = {
    val job = new OracleToHbase
    //    QuartzUtil.addJob(JOB_NAME, job, QUARTZ_TIME)
    job.inputDataToHbase(job.takeHbaseNotExistTables())

    //    val a = Array(DBInfo("aaa", "aaa", Array("111", "222", "333"), "aaa"), DBInfo("bbb", "bbb", Array("444", "555", "666"), "bbb"), DBInfo("ccc", "ccc", Array("777", "888", "999"), "ccc"))
    //    a.foreach(db => db.tablesName.foreach(name => println(name + " " + db.username)))
  }
}
