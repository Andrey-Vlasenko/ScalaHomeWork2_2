package org.example

/**
 * @author ${user.name}
 */
object App {
  def main(args : Array[String]) {
    //val str1 = "Hello Scala!"
    var str2 = "Hello Scala!"
    println( str2 )
    println( str2.reverse )
    println( str2.toLowerCase )
    //println( str2.init )
    println( str2.replace("!"," ") )
    println( str2.replace("!"," ") + "and goodbye python!")
  }
}
