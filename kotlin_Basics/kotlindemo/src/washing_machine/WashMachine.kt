package washing_machine

import javax.security.auth.spi.LoginModule

/**
 * 面向对象：
 * 程序员A创建的洗衣机
 */
class WashMachine(var module: String,var size:Int) {

    fun open(){
        println("打开洗衣机")
    }


    fun start(){
        println("添加衣服，加水，到洗衣液")
        println("水够了，开始洗衣服")
        println("洗衣机工作")
        println("完成，抽干")
        println("取出，晾衣服")
    }

    fun close(){
        println("关闭洗衣机")
    }


}