package enum

enum class Week{
    礼拜1,
    礼拜2,
    礼拜3,
    礼拜4,
    礼拜5,
    礼拜6,
    礼拜7,
}

fun main(args: Array<String>) {
    println(Week.礼拜1.ordinal)
}