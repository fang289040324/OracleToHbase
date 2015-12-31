package com.navinfo.util

import java.io.{File, FileInputStream, InputStream}
import java.util.Properties

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
    val prop = Prop(propt.getProperty("db.username"), propt.getProperty("db.url"), propt.getProperty("db.table.type"))
    inputStream.close()
    prop
  }

  def loadProData(): Prop = loadProData("")

  def main(args: Array[String]): Unit = {
    println(loadProData().usernames)
  }
}
case class Prop(usernames: String, url: String, tableType: String)