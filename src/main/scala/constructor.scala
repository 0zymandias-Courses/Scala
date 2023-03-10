package com.spark.main
// Primary constructor
class classConstructor(name: String, role: String) {

  var apps: Int = 0;
  var salary: Double = 0.0;

  def display(): Unit = {
    println("Author name: " + name);
    println("Job: " + role);
    println("Total number of applications delivered: " + apps);
    println("Salary: " + salary);

  }

  // Auxiliary Constructor
  def this(name: String, role: String, numberParam: Int) = {
    // Invoking primary constructor
    this(name, role)
    this.apps = numberParam
  }

  def this(name: String, role: String, salaryParam: Double) = {
    // Invoking primary constructor
    this(name, role)
    this.salary = salaryParam
  }
}

object Constructor {
  def main(args: Array[String]): Unit = {
    // Creating object of GFG class
    val objInst1 = new classConstructor("Warlock", "Architech", 40000.50);
    objInst1.display();
    // Creating object of GFG class
    val objInst2 = new classConstructor("Evean", "Developer", 32);
    objInst2.display();
  }
}
