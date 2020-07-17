package demo

//面向对象
class Girl (var chactor:String,var voice:String){
    fun smaile(){
        println("妹纸已死,请勿烧香！")
    }
    fun cry(){
        println("诈尸！")
    }
}

fun main(args: Array<String>) {
    var girl01 = Girl("可爱", "温柔")
    println("${girl01.chactor}--${girl01.voice}")
    girl01.smaile()
    girl01.cry()
}