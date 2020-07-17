package entrustAndAgent

/**
 * 小头爸爸
 */
class SmallHeadFather:IWashBowl by BigHeadSon{

    override fun washing() {
        println("小头爸爸让大头儿子洗碗,他赚了9块")
        BigHeadSon.washing()
        println("儿子把碗洗好，给他一块")
    }

}