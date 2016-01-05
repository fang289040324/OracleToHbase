package com.navinfo.util

import java.io.{File, FileInputStream, InputStream}
import java.util.Properties

import scala.collection.mutable.ArrayBuffer

/**
  * Title. <br>
  * Description.
  * <p>
  * Copyright: Copyright (c) 2015-12-28 9:48
  * <p>
  * Company: 北京四维图新科技股份有限公司
  * <p>
  * Author: fangshaowei
  * <p>
  * Version: 1.0
  * <p>
  */
class PropertiesUtil {}

object PropertiesUtil {
  def loadProData(s: String): Prop = {
    val propt = new Properties()
    val dbFile = new File(s)
    val inputStream: InputStream = if(dbFile.exists()) new FileInputStream(dbFile) else PropertiesUtil.getClass.getClassLoader.getResourceAsStream("db.properties")
    propt.load(inputStream)
    val mtables: Array[String] = propt.getProperty("db.modify.table").trim.split(",")
//    val buffer: ArrayBuffer[String] = ArrayBuffer[String]()
    var map: Map[String, String] = Map[String, String]()
    mtables.foreach(table => {
      map += (table -> propt.getProperty("db." + table + ".modify.sql").trim)
    })
    val prop = Prop(propt.getProperty("db.username").trim, propt.getProperty("db.url").trim, propt.getProperty("db.table.type").trim,
      propt.getProperty("db.poi.sql").trim, propt.getProperty("db.link.sql").trim, propt.getProperty("db.modify.time").trim, mtables, map)
    inputStream.close()
    prop
  }

  def loadProData(): Prop = loadProData("")

  def main(args: Array[String]): Unit = {
    loadProData().modifySql.foreach(println)
  }
}
case class Prop(usernames: String, url: String, tableType: String, poiSql: String, linkSql: String, modifyTime: String, modifyTable: Array[String], modifySql: Map[String, String])