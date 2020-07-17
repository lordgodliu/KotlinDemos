package demo

//面向对象
class Rect(var h:Int,var w:Int)

fun main(args: Array<String>) {
    var rect01 = Rect(20, 30)
    println("h=${rect01.h} w=${rect01.w}")
}