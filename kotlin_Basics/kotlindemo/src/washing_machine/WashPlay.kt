package washing_machine

fun main(args: Array<String>) {
    var washMachine = WashMachine("美的",7)
    washMachine.open()
    washMachine.start()
    washMachine.close()
}