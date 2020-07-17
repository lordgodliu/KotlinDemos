//函数和函数式`表达式

fun main(args: Array<String>) {

    var i = {x:Int,y:Int -> x+y}
    var e:(Int,Int)->Int ={x,y->x+y}
    println(e(3,5))

}
fun add(x:Int,y:Int):Int = x+y

