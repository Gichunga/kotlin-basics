import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class RangeRegulator(initialValue: Int, private val minValue: Int, private val maxValue: Int) :
    ReadWriteProperty<Any?, Int> {
    var fieldData = initialValue
    override operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) {
            fieldData = value
        }
    }
}