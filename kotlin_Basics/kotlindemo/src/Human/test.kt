package Human

fun main(args: Array<String>) {
    println("--------------------继承如下：")
    var per1 = Man("亚当")
    per1.eat()
    var per2 = Woman("夏娃")
    per2.eat()
    println("--------------------多态如下：")
    var per3 = Man("伏羲")
    var per4 = Woman("女娲")
    var per5 = Man("盘古")
    var per6 = Man("鸿钧")
    var per7 = Woman("嫦曦")
    var per8 = Man("元始")
    var per9 = Woman("后土")
    var houseList = listOf<Human>(per3,per4,per5,per6,per7,per8,per9)
    for (h in houseList){
        h.pee()
    }


}