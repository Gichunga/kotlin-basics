class SmartLight(deviceName:String, category: String):SmartDevice(deviceName = deviceName, category = category) {
    private var brightnessLevel = 0
        set(value) {
            if (value in 0..100){
                field = value
            }
        }

    fun increaseBrightness(){
        brightnessLevel++
        println("The brightness level has been increased to $brightnessLevel")
    }

    override fun turnOn(){
        super.turnOn()
        brightnessLevel = 2
        println("$deviceName turned on. The brightness level is $brightnessLevel")
    }

    override fun turnOff(){
        super.turnOff()
        brightnessLevel = 0
        println("$deviceName turned off. The brightness level is $brightnessLevel")
    }
}