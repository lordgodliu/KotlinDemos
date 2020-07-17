package sealed

/**
 * 印章类
 */
sealed class Sealed {
    fun say(){
        println("大家好！")
    }

    class sson():Sealed()
    class seon():Sealed()

}