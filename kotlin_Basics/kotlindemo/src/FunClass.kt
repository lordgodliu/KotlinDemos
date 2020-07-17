fun main(args: Array<String>) {
    var a = 8
    var b = 2
    println(plue(a, b))
    println(sub(a, b))
    println(mutl(a, b))
    println(dev(a, b))
    println("-------------------")
    println(sayHello("帝赢"))
    println(checkAge(24))
    println(saveLog(1111))
}

fun plue(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b: Int): Int {
    return a - b
}

fun mutl(a: Int, b: Int): Int {
    return a * b
}

fun dev(a: Int, b: Int): Int {
    return a / b
}

fun sayHello(name: String): String {
    return name
}

fun checkAge(age: Int): Boolean {
    return age > 18
}

fun saveLog(logLevel: Int) {
    println(logLevel)
}