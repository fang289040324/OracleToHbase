package com.navinfo.util

import java.sql.{Connection, DriverManager}
import java.util
import java.util.ArrayList

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

  def getConn(username: String, password: String, url: String = "jdbc:oracle:thin:@192.168.4.113:1521:orcl"): Connection = {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver")
      DriverManager.getConnection(url, username, password)
    } catch {
      case e: Exception =>
        e.printStackTrace()
        null
    }
  }
  def takeTablesName(username: String, password: String, url: String): Array[String] = {
    val conn = getConn(username, password, url)
    log.info("用户 " + username + " 数据库链接创建成功")
    val stmt = conn.createStatement()
    val res = stmt.executeQuery("select table_name from user_tables")
    val arr = new ArrayBuffer[String]()
    while (res.next())
      arr append res.getString("TABLE_NAME")
    arr.toArray
  }
  def takeAllTablesInfo(prop: Prop): Array[DBInfo] = {
    val users: Array[String] = prop.usernames.split(",")
    for (user <- users) yield {
      DBInfo(user, user, takeTablesName(user, user, prop.url), prop.url)
    }
  }
  def main(args: Array[String]) {
    takeAllTablesInfo(PropertiesUtil.loadProData()).foreach(info => info.tablesName.foreach(println))
  }
}
case class DBInfo(username: String, password: String, tablesName: Array[String], url: String)
