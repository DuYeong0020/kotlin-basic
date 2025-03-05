fun main() {
    val str: String? = null // null이 들어갈 수 있음
    // str.length 안됨
    println(str?.length) // Safe call,
    println(str?.length ?: 0) //  null이면 0

    val person = Person("개발자")
    startsWithA(person.name) // 플랫폼 타입(null인지 알수없는 정보)
}
fun startsWithA(str: String):Boolean {
    return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
//    if (str == null) {
//        throw IllegalArgumentException("null error")
//    }
//    return str.startsWith("A")
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null error")

}

fun startsWithA2(str: String?): Boolean? {
//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
//    if (str == null) {
//        return false
//    }
//    return str.startsWith("A")
    return str?.startsWith("A") ?: return false
}

fun startsWithA4(str: String?): Boolean {
    return str!!.startsWith("A")
}