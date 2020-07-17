fun main(args: Array<String>) {
    var num = 100
    var r =0
//    println()
    fact(num,r)
}
tailrec fun fact(num:Int,r:Int):Long{
    println("第 ${num} 次运算,r = ${r}")
    if (num ==0){
        return 1
    }else{
        return fact(num-1,r+num)
    }
}