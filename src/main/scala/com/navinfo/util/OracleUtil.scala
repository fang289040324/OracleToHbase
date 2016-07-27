package com.navinfo.util

import java.sql.{ResultSet, PreparedStatement, Connection, DriverManager}

import org.apache.log4j.Logger

import scala.collection.mutable.ArrayBuffer

/**
  * Title. <br>
  * Description.
  * <p>
  * Copyright: Copyright (c) 2015-12-25 17:52
  * <p>
  * Company: 北京四维图新科技股份有限公司
  * <p>
  * Author: fangshaowei
  * <p>
  * Version: 1.0
  * <p>
  */
class OracleUtil {}

object OracleUtil {

  val log = Logger.getLogger(classOf[OracleUtil])

  val WILDCARD = "*"
  val POINT = "\\."
  val TABLE_PREFIX = "G_"
  val COMMA = ","
  val USER_TABLES_SQL = "select table_name from user_tables"
  val TABLE_NAME_COL = "TABLE_NAME"
  private val selectSql = "select count(1) from "

  def main(args: Array[String]) {
//    takeAllTablesInfo(PropertiesUtil.loadProData()).foreach(info => info.tablesName.foreach(println))
//    takeAllModifyTablesInfo(PropertiesUtil.loadProData()).foreach(info => {
//      info.tablesName.foreach(x => print(x + " "))
//      println(info)
//    })
//    print(takeTableRecordsCount("g_02aut_poi", "gdb_2002", "gdb_2002", "jdbc:oracle:thin:@192.168.4.113:1521:orcl"))
  }

  def takeTableRecordsCount(tableName: String, username: String, password: String, url: String): Int ={
    selectCountSql(tableName, getConn(username, password, url))
  }

  def selectCountSql(table: String, connection: Connection, sql: String = selectSql): Int = {
    val statement: PreparedStatement = connection.prepareStatement(sql + table)
    val rs: ResultSet = statement.executeQuery()
    rs.next()
    rs.getInt(1)
  }

  def takeAllTablesInfo(prop: Prop): Array[DBInfo] = {
    log.info("加载需要导入的表")
    val users: Array[String] = prop.oracleUsernames.split(",")
    for (user <- users) yield {
      DBInfo(user, user, takeTablesName(user, user, prop.oracleUrl, prop.tableType), prop.oracleUrl, prop.poiSql, prop.linkSql, null)
    }
  }

  def takeAllModifyTablesInfo(prop: Prop): Array[DBInfo] = {
    log.info("加载需要修改的表")
    val infoes: Array[DBInfo] = for (table <- prop.modifyTable) yield {
      val username = table.split(POINT)(0)
      val mTable = table.split(POINT)(1)
      val tablesName: Array[String] = takeTablesName(username, username, prop.oracleUrl, prop.tableType)
      if (mTable.contains(WILDCARD)) {
        if(mTable.equals(WILDCARD)) DBInfo(username, username, tablesName, prop.oracleUrl, null, null, prop.modifySql(table))
        else{
          val t = mTable.replace(WILDCARD, "")
          if(tablesName.count(x => x.contains(t.toUpperCase) || x.contains(t.toLowerCase)) > 0)
            DBInfo(username, username, tablesName.filter(x => x.contains(t.toUpperCase) || x.contains(t.toLowerCase)), prop.oracleUrl, null, null, prop.modifySql(table))
          else null
        }
      } else {
        if (tablesName.count(x => x.equalsIgnoreCase(mTable)) == 1) DBInfo(username, username, Array(mTable), prop.oracleUrl, null, null, prop.modifySql(table)) else null
      }
    }
    infoes.filter(_ != null)
  }

  def takeTablesName(username: String, password: String, url: String, tableType: String): Array[String] = {
    val conn = try {
      getConn(username, password, url)
    } catch {
      case e: Exception =>
        log.info("用户 " + username + " 数据库链接创建失败")
        null
    }
    if (conn != null) {
      log.info("用户 " + username + " 数据库链接创建成功")
      val tableTypes = tableType.split(COMMA)
      val stmt = conn.createStatement()
      val res = stmt.executeQuery(USER_TABLES_SQL)
      val arr = new ArrayBuffer[String]()
      while (res.next())
        arr append res.getString(TABLE_NAME_COL)
      conn.close()
      log.info("用户 " + username + " 数据库链接关闭")
      arr.filter(name => {
        var flag = false
        for (ttype <- tableTypes) {
          flag = (flag || name.contains(ttype)) && name.contains(TABLE_PREFIX)
        }
        flag
      }).toArray
    } else
      Array()
  }

  def getConn(username: String, password: String, url: String = "jdbc:oracle:thin:@192.168.4.113:1521:orcl"): Connection = {
    Class.forName("oracle.jdbc.driver.OracleDriver")
    DriverManager.getConnection(url, username, password)
  }
}

case class DBInfo(username: String, password: String, tablesName: Array[String], url: String, poiSql: String, linkSql: String, modifySql: String)