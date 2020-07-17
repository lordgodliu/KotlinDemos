fun main(args: Array<String>) {
    var nums = 1 .. 100
    var r =0
    for (num in nums){
        r = r+num

    }
    println("${r} ")


    var qq = 1 until 100
    for (q in qq step 2){

    }
    println(qq.reversed())
}