package com.navinfo.util

import java.sql.{Connection, DriverManager}

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

  def main(args: Array[String]) {
    takeAllTablesInfo(PropertiesUtil.loadProData()).foreach(info => info.tablesName.foreach(println))
  }

  def takeAllTablesInfo(prop: Prop): Array[DBInfo] = {
    val users: Array[String] = prop.usernames.split(",")
    for (user <- users) yield {
      DBInfo(user, user, takeTablesName(user, user, prop.url, prop.tableType), prop.url)
    }
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
      val tableTypes = tableType.split(",")
      val stmt = conn.createStatement()
      val res = stmt.executeQuery("select table_name from user_tables")
      val arr = new ArrayBuffer[String]()
      while (res.next())
        arr append res.getString("TABLE_NAME")
      conn.close()
      log.info("用户 " + username + " 数据库链接关闭")
      arr.filter(name => {
        var flag = false
        for (ttype <- tableTypes) {
          flag = (flag || name.contains(ttype)) && name.contains("G_")
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

case class DBInfo(username: String, password: String, tablesName: Array[String], url: String)
