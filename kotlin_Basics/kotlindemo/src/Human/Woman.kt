package Human

class Woman(name:String):Human(name) {
    override fun eat(){
        println("${name}吃苹果")
    }

    override fun pee() {
        println("${name}是女神")
    }
}