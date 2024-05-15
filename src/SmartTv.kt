class SmartTv(deviceName: String, category: String) : SmartDevice(deviceName = deviceName, category = category) {
    private var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    private var channelNumber = 1
        // set channel number if provided value is within range of 0 to 200
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume")
    }

    fun nextChannel(){
        channelNumber++
        println("Channel number increased to $channelNumber")
    }

    override fun turnOn() {
        super.turnOn()
        println("$deviceName is turned on. Speaker volume is set to $speakerVolume and channel set to $channelNumber")
    }

    override fun turnOff() {
        super.turnOff()
        println("$deviceName is turned off. Speaker volume is set to $speakerVolume")
    }
}