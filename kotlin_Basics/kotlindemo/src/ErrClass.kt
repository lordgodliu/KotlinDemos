import java.lang.Exception

fun main(args: Array<String>) {
    while (true){
        jisuan()
    }

}


fun jisuan(){
    println("请输入：")
    val num1str = readLine()
    println("请输入：")
    val num2str = readLine()

    try{
        var num1:Int = num1str!!.toInt()
        var num2:Int = num2str!!.toInt()
        println(" ${num1} + ${num2} = ${num1+num2}")
    }catch (e:Exception){
        println("请输入数字！")
    }
}