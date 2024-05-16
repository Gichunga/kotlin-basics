open class SmartDevice protected constructor (val deviceName:String, val category:String){

    var deviceStatus = "online"
        private set

    open val deviceType = "unknown"

    constructor(deviceName: String, category: String, statusCode:Int):this(deviceName, category){
        deviceStatus = when(statusCode){
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    open fun turnOn(){
        deviceStatus = "online"
    }
    open fun turnOff(){
        deviceStatus = "offline"
    }

    open fun printDeviceInfo(){

    }
}

fun main(){
    var smartDevice:SmartDevice = SmartTv("Android Tv", "Entertainment")
    smartDevice.turnOn()
    smartDevice.printDeviceInfo()


    smartDevice = SmartLight("Oraimo SmartBulb", "Lighting")
    smartDevice.turnOn()
    smartDevice.decreaseBrightness()
    smartDevice.printDeviceInfo()

}