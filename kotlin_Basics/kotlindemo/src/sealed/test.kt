package sealed

fun main(args: Array<String>) {

    val s1: Sealed = Sealed.seon()
    val s2: Sealed = Sealed.sson()
    val s3: Sealed = Sealed.sson()
    val s4: Sealed = Sealed.seon()
    val s5: Sealed = Sealed.sson()
    val s6: Sealed = Sealed.seon()

    var list = listOf<Sealed>(s1,s2,s3,s4,s5,s6)
    for (v in list) {
        if (v is Sealed.seon) {
            v.say()
        }
    }

}