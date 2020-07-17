fun main(args: Array<String>) {
    println("请输入：")
    val num1str = readLine()
    println("请输入：")
    val num2str = readLine()
    var num1:Int = num1str!!.toInt()
    var num2:Int = num2str!!.toInt()
    println(" ${num1} + ${num2} = ${num1+num2}")

}