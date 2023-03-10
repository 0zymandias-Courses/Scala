package com.spark.main

trait BMW{

    // trait valiables
    val make: String = "BMW"
    val model: String = "X7"
    val fuel: Int = 40

    // trait method: NON-ABSTRACT
    def DisplayBMW() : Unit = {
        println("Make of the Car : " + make);
        println("Model of the Car : " + model);
        println("Fuel capacity of the Car : " + fuel);
    }
}


class Car extends BMW{
    // class valiables
    val make1: String = "Mercedes Benz"
    val model1: String = "S350D"
    val fuel1: Int = 50

    // Class method
    def Merc_Specs() : Unit ={
        println("Make of the Car : " + make1);
        println("Model of the Car : " + model1);
        println("Fuel capacity of the Car : " + fuel1);
    }
}

object Trait   
{

    // Main method
    def main(args: Array[String]) : Unit = {
        // Class object
        val obj = new Car();
        println("Calling the Class Method")
        obj.Merc_Specs();
        println("Calling the Trait Method")
        obj.DisplayBMW();
    }
}