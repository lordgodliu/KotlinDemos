fun main(args: Array<String>) {
    student(1)
    student(2)
    student(3)
    student(4)
    student(5)
    student(6)
    student(7)
    student(8)
    student(9)
    student(10)
}

fun student(score:Int){
    when(score){
        10-> println("${score}")
        9-> println("${score}")
        8-> println("${score}")
        7-> println("${score}")
        6-> println("${score}")
        5-> println("${score}")
        4-> println("${score}")
        3-> println("${score}")
        2-> println("${score}")
        1-> println("${score}")
        0-> println("${score}")
    }
}
