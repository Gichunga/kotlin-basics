class SmartHome(
    val smartTv: SmartTv,
    val smartLight: SmartLight,
    val smartDevice: SmartDevice
) {
    private var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        deviceTurnOnCount++
        smartTv.turnOn()
    }

    fun turnOffTv() {
        deviceTurnOnCount--
        smartTv.turnOff()
    }

    fun increaseTvVolume() {
        smartTv.increaseSpeakerVolume()
    }

    fun decreaseTvVolume() {
        smartTv.decreaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTv.nextChannel()
    }

    fun changeTvToPreviousChannel() {
        smartTv.previousChannel()
    }

    fun turnOnLight() {
        deviceTurnOnCount++
        smartLight.turnOn()
    }

    fun turnOffLight() {
        deviceTurnOnCount--
        smartLight.turnOff()
    }

    fun turnOffAllDevices() {
        smartTv.turnOff()
        smartLight.turnOff()
    }

    fun turnOnAllDevices() {
        deviceTurnOnCount++
        smartTv.turnOn()

        deviceTurnOnCount++
        smartLight.turnOn()
    }

    fun increaseLightBrightness() {
        smartLight.increaseBrightness()
    }

    fun decreaseLightBrightness() {
        smartLight.decreaseBrightness()
    }

    fun printSmartTvInfo() {
        smartTv.printDeviceInfo()
    }

    fun printSmartLightInfo() {
        smartLight.printDeviceInfo()
    }


}