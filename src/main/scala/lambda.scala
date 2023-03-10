package com.spark.main

object lambda {
  // Main method
  def main(args: Array[String]): Unit = {
    // list of numbers
    val l = List(1, 1, 2, 3, 5, 8)
    // squaring each element of the list
    val res = l.map((x: Int) => x * x)
    println(res)

    // with multiple parameters
    val ex2 = (x: Int, y: Int) => x * y
    println(ex2(2, 3))

    val func = (x: Int) => x / x
    // squaring each element of the lists
    val res1 = l.map(func)
    println(res1)

  }
}
