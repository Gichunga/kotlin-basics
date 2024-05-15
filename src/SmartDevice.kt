open class SmartDevice (val deviceName:String, val category:String){

    var deviceStatus = "online"

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
}

fun main(){
    var smartDevice:SmartDevice = SmartTv("Android Tv", "Entertainment")
    smartDevice.turnOn()

    smartDevice = SmartLight("Oraimo SmartBulb", "Lighting")
    smartDevice.turnOn()
}