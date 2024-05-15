class TrafficLight {
    fun trafficLight(){
        val trafficLightColor = "Amber"
        when (trafficLightColor){
            "Red" -> println("Stop")
            "Yellow","Amber" -> println("Slow")
            "Green" -> println("Go")
            else -> println("Invalid traffic-light color")
        }
    }
}
