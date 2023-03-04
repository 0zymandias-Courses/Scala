trait bmw{
    val make: String = "BMW"
    val model: String = "X7"
    val fuel: Int = 40
}

trait merc{
    val make1: String = "Mercedes Benz"
    val model1: String = "S350D"
    val fuel1: Int = 50
}



class luxuryCar extends bmw with merc{

    def BMW_Specs() : Unit = {
        println("Make of the Car : " + make);
        println("Model of the Car : " + model);
        println("Fuel capacity of the Car : " + fuel);
    }


    def Merc_Specs() : Unit = {
        println("Make of the Car : " + make1);
        println("Model of the Car : " + model1);
        println("Fuel capacity of the Car : " + fuel1);
    }

}


object Trait2
{
    // Main method
    def main(args: Array[String]): Unit = {
        // Class object
        val obj = new luxuryCar();
        println("Calling the BMW Trait")
        obj.BMW_Specs();
        println();
        println("Calling the Merc Trait")
        obj.Merc_Specs();
    }
}