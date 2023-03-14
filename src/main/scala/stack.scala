package com.spark.main

import scala.collection.mutable.Stack

object stackSample {
  def main(args: Array[String]) : Unit = {
    var stack = Stack[Int](5,4,3,2,1)
    while(!stack.isEmpty){
        println(s"Complete stack : ${stack}");
        println(s"Stack top to be removed : ${stack.top}");
        stack.pop();
    }
  }// def main closure
}// object main closure