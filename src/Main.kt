fun main() {
//    val x:Any = 20
//
//    when (x){
//        2,3,5,7 -> println("x is a prime number between 1 and 10.")
//        in 1..10 -> println("x is a number between 1 and 10 but not a prime number.")
//        is Int -> println("x is an integer number but not between 1 and 10")
//        else -> println("x isn't an integer number.")
//    }


//    val trafficLightColor = "Amber"
//    when (trafficLightColor){
//        "Red" -> println("Stop")
//        "Yellow","Amber" -> println("Slow")
//        "Green" -> println("Go")
//        else -> println("Invalid traffic-light color")
//    }

//    val trafficLightColor = "Green"
////    using an if expression instead of an if condition to reduce repetition of the println function
//    val message =
//        if (trafficLightColor == "Red") "Stop"
//        else if (trafficLightColor == "Yellow" || trafficLightColor == "Amber") "Slow"
//        else if (trafficLightColor == "Green") "Go"
//        else "Invalid traffic-light color"
//
//    println(message)


//        val trafficLightColor = "Amber"
//    val message = when (trafficLightColor){
//        "Red" -> "Stop"
//        "Yellow","Amber" -> "Slow"
//        "Green" -> "Go"
//        else -> "Invalid traffic-light color"
//    }
//    println(message)

//    var favoriteActor:String? = "Steve"
//    favoriteActor = null
//    println(favoriteActor?.length)

    var favoriteActor: String? = "Steve"
    favoriteActor = null
    val lengthOfName = favoriteActor?.length ?: 1
    println("The  number of characters in your favorite actor's name is $lengthOfName .")

}