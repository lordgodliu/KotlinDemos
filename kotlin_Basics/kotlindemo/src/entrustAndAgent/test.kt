package entrustAndAgent

fun main(args: Array<String>) {
    val son1 = BigHeadSon
    val son2 = BigHeadSon
    println(son1==son2)

    println("-------------------------------")
    val smallHeadFather = SmallHeadFather()
    smallHeadFather.washing()
}