package com.navinfo.util

import java.sql.{Date, ResultSet, PreparedStatement, DriverManager, Connection}

/**
  * Title. <br>
  * Description.
  * <p>
  * Copyright: Copyright (c) 2016-1-25 9:35
  * <p>
  * Company: 北京四维图新科技股份有限公司
  * <p>
  * Author: fangshaowei
  * <p>
  * Version: 1.0
  * <p>
  */
class MysqlUtil {}

object MysqlUtil{

//  private val username = "cocktail"
//  private val password = "*XData@)!%%!@28*"
  private val username = "xdata"
  private val password = "*xdata_@)!^)@_!(@*"
  private var connection: Connection = null
  private val tableName: String = "query_datasource"
  private val insertSql = "INSERT INTO " + tableName + " (year, version, type, collection_name, data_day, year_display, version_display, `release`, status, hbase_records) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"
  private val updateSql = "update " + tableName + " set hbase_records = ? where collection_name = ?;"
  private val selectCountSql = "select count(1) from " + tableName + " where collection_name = ?"
  private val url: String = "jdbc:mysql://192.168.4.192:3306/xdata?useUnicode=true&amp;characterEncoding=utf-8" // 生产库
//  private val url: String = "jdbc:mysql://192.168.4.196:3306/cocktail?useUnicode=true&amp;characterEncoding=utf-8" //测试库

  def main(args: Array[String]) {
//    getConn()
//    print(selectCountSql(_.setString(1, "g_15sum_poi")))
//    close()

//    val prop: Prop = PropertiesUtil.loadProData()
//    val infos: Array[DBInfo] = OracleUtil.takeAllTablesInfo(prop)
//    infos.foreach(info => {
//      info.tablesName.filter(name => name.contains("POI")).foreach(name => {
//        println(name)
//        updateHbaseRecordsCount(name, OracleUtil.takeTableRecordsCount(name, info.username, info.username, info.url), prop)
//      })
//    })
  }

  def updateHbaseRecordsCount(tableName: String, recordsCount: Int, prop: Prop): Boolean = {
    getConn(prop.mysqlUsername, prop.mysqlPassword, prop.mysqlUrl)
    val count: Int = selectCountSql(_.setString(1,tableName))
    val result: Boolean = if (count == 1) {
      updateSql(x => {
        x.setInt(1, recordsCount)
        x.setString(2, tableName)
      })
    } else {
      insertSql(x => {
        val split: Array[String] = tableName.split("_")
        val year: String = "20" + split(1).substring(0, 2)
        val season: String = split(1).substring(2, split(1).length)
        var seasonc: String = null
        var month: String = null
        val status = 0
        val historyRelease: Int = 0
        season match {
          case "SPR" => {
            seasonc = "春版"
            month = "04"
          }
          case "SUM" => {
            seasonc = "夏版"
            month = "07"
          }
          case "AUT" => {
            seasonc = "秋版"
            month = "10"
          }
          case "WIN" => {
            seasonc = "冬版"
            month = "01"
          }
          case _ => {
            seasonc = "无版本"
            month = "00"
          }
        }
        x.setString(1, year)
        x.setString(2, season.toLowerCase())
        x.setString(3, split(split.length - 1).toLowerCase())
        x.setString(4, tableName.toLowerCase())
        x.setDate(5, Date.valueOf(year + "-" + month + "-01"))
        x.setString(6, year + "年")
        x.setString(7, seasonc)
        x.setInt(8, historyRelease)
        x.setInt(9, status)
        x.setInt(10, recordsCount)
      })
    }
    close()
    result
  }

  def getConn(username: String = username, password: String = password, url: String = url): Unit = {
    Class.forName("com.mysql.jdbc.Driver")
    connection = DriverManager.getConnection(url, username, password)
  }

  def close(): Unit = {
    connection.close
  }

  def selectCountSql(setPara: (PreparedStatement) => Unit, sql: String = selectCountSql): Int = {
    val statement: PreparedStatement = connection.prepareStatement(sql)
    setPara(statement)
    val rs: ResultSet = statement.executeQuery()
    rs.next()
    rs.getInt(1)
  }

  def insertSql(setPara: (PreparedStatement) => Unit, sql: String = insertSql): Boolean = updateSql(setPara, sql)

  def updateSql(setPara: (PreparedStatement) => Unit, sql: String = updateSql): Boolean = {
    val preStat: PreparedStatement = connection.prepareStatement(sql)
    setPara(preStat)
    try {
      preStat.executeUpdate()
      true
    } catch {
      case e: Exception => false
    }
  }

}
