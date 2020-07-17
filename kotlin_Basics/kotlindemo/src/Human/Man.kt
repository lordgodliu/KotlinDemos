package Human

class Man(name:String):Human(name) {
    override fun eat(){
        println("${name}吃肉")
    }

    override fun pee() {
        println("${name}是男神")
    }
}