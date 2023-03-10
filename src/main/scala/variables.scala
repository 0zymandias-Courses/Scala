package com.spark.main

object variables {
  def main(args: Array[String]) : Unit = {
    println("Variables mutability in Scala !!!")
    val constIntVal : Int  = 2147483647;
    //shouldn't work, val variables are inmutable
    //constIntVal = 2147483646;
    var constIntVar : Int  = 2147483647;
    constIntVar = 2147483647;
  }// def main closure
}// object closure
