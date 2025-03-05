package Section01

fun main() {
    // compare to
    val money1 = Money(10000L)
    val money2 = Money(20000L)

    if (money1 < money2) {
        println("money1 < money2")
    }
    val money3 = Money(10000L)
    val money4 = Money(10000L)
    // 동등성(equality)
    println(money3 == money4)
    // 동일성(identity): 주소가 같은지?
    println(money3 === money4)


    val money5 = Money(10000)
    val money6 = Money(30000)
    val money7 = money5 + money6

}