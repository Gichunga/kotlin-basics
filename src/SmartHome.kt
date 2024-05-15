class SmartHome(
    val smartTv: SmartTv,
    val smartLight: SmartLight
    ) {
    fun turnOnTv() {
        smartTv.turnOn()
    }

    fun turnOffTv() {
        smartTv.turnOff()
    }

    fun increaseTvVolume() {
        smartTv.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTv.nextChannel()
    }

    fun turnOnLight(){
        smartLight.turnOn()
    }

    fun turnOffLight(){
        smartLight.turnOff()
    }

    fun turnOffAllDevices(){
        smartTv.turnOff()
        smartLight.turnOff()
    }

    fun increaseLightBrightness(){
        smartLight.increaseBrightness()
    }


}