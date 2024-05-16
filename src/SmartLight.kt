class SmartLight(deviceName:String, category: String):SmartDevice(deviceName = deviceName, category = category) {

    override val deviceType = "Smart Light"

    private var brightnessLevel by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)

    fun increaseBrightness(){
        brightnessLevel++
        println("The brightness level has been increased to $brightnessLevel")
    }

    fun decreaseBrightness(){
        brightnessLevel--
        println("The brightness level decreased to $brightnessLevel")
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

    override fun printDeviceInfo() {
        super.printDeviceInfo()
        println("Device Name: $deviceName")
        println("Category: $category")
        println("Type: $deviceType")
    }

}