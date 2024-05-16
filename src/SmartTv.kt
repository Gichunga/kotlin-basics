class SmartTv(deviceName: String, category: String) : SmartDevice(deviceName = deviceName, category = category) {

    override val deviceType = "Smart Tv"

    private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)

    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume")
    }

    fun decreaseSpeakerVolume(){
        speakerVolume--
        println("Speaker volume decreased to $speakerVolume")
    }

    fun nextChannel(){
        channelNumber++
        println("Channel number increased to $channelNumber")
    }

    fun previousChannel(){
        channelNumber--
        println("Channel number reverted to $channelNumber")
    }

    override fun turnOn() {
        super.turnOn()
        println("$deviceName is turned on. Speaker volume is set to $speakerVolume and channel set to $channelNumber")
    }

    override fun turnOff() {
        super.turnOff()
        println("$deviceName is turned off. Speaker volume is set to $speakerVolume")
    }

    override fun printDeviceInfo() {
        println("Device Name: $deviceName")
        println("Category: $category")
        println("Type: $deviceType")
    }

}