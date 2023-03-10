package com.spark.main

class polyMorphism {
  // Function 1
  def func(vehicle: String, category: String): Unit = {
    println("The Vehicle is: " + vehicle);
    println("The Vehicle category is: " + category);
  }

  // Function 2
  def func(name: String, score: Int): Unit = {
    println("Student Name is: " + name);
    println("Score: " + score);
  }

  // Function 3
  def func(a: Int, b: Int): Unit = {
    var Sum = a + b;
    println("Sum is: " + Sum)
  }

}

// Creating object
object polyMorphism {
  // Main method
  def main(args: Array[String]): Unit = {
    var objInst = new polyMorphism();
    objInst.func("swift", "hatchback");
    objInst.func("honda-city", "sedan");
    objInst.func("Ashok", 95);
    objInst.func(10, 20);
  }
}
