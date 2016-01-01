package com.navinfo.util

import org.apache.hadoop.hbase.client.ConnectionFactory
import org.apache.hadoop.hbase.{HBaseConfiguration, HColumnDescriptor, HTableDescriptor, TableName}
import org.apache.log4j.Logger

/**
  * Title. <br>
  * Description.
  * <p>
  * Copyright: Copyright (c) 2015-12-25 14:11
  * <p>
  * Company: 北京四维图新科技股份有限公司
  * <p>
  * Author: fangshaowei
  * <p>
  * Version: 1.0
  * <p>
  */
class HBaseUtil {}

object HBaseUtil {
  val log = Logger.getLogger(classOf[HBaseUtil])
  val conf = {
    val conf = HBaseConfiguration create()
    conf.set("hbase.zookeeper.quorum", "xdatanode-06,xdatanode-07,xdatanode-08")
    conf.set("hbase.zookeeper.property.clientPort", "2181")
    conf.set("zookeeper.znode.parent", "/hbase")
    conf
  }
  val connection = ConnectionFactory.createConnection(conf)
  val admin = connection getAdmin

  def deleteTable(tableName: String) = {
    val table = TableName.valueOf(tableName)

    if (admin.tableExists(table)) {
      admin.disableTable(table)
      admin.deleteTable(table)
      log.info(tableName + " 表已经被删除")
    }
  }

  def createTable(tableName: String, familys: Array[String], isReplace: Boolean): Unit = {
    val table = TableName.valueOf(tableName)
    admin.tableExists(table) match {
      case true =>  if (!isReplace) {
        log.info(tableName + " 表已存在")
      } else {
        deleteTable(tableName)
        createTable(tableName, familys, isReplace)
      }
      case false =>
        val tableDescriptor = new HTableDescriptor(table)
        familys.foreach(name => tableDescriptor.addFamily(new HColumnDescriptor(name)))
        admin.createTable(tableDescriptor)
        log.info(tableName + " 表创建成功")
    }
  }

  def getTableNames: Array[String] = {
    val tables: Array[HTableDescriptor] = admin.listTables()
    for (table <- tables ) yield {
      table.getNameAsString
    }
  }

  def close(): Unit = {
    try {
      if (admin != null)
        admin.close()
      if (connection != null)
        connection.close()
    } catch {
      case e: Exception =>
    }
  }

  def main(args: Array[String]): Unit = {
//    val array: Array[String] = Array("G_02AUT_POI", "G_07SUM_POI", "G_12AUT_POI", "G_12SPR_POI", "G_12SUM_POI", "G_12WIN_POI", "G_13AUT_POI", "G_13SPR_POI", "G_13SUM_POI", "G_13WIN_POI", "G_15AUT_POI", "G_15SPR_POI")
//    array.foreach(deleteTable(_))
//    close()
  }
}
