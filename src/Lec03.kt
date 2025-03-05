fun main() {
    val num1: Int = 10
    val num2: Long = num1.toLong() // 명시적으로 해줘야한다.
    println(num1 + num2)

    val num3: Int? = 3
    val num4: Long = num3?.toLong() ?:0L // null이면 0

    printAgeIfPerson2(null)

    val person = Person("두두")
    val log = "사람의 이름은 ${person.name} "

    val str = """
        ABC
        DFG
    """.trimIndent()
    println(str)

    val str2 = "ABC"
    println(str2[0])

}

fun printAgeIfPerson1(obj: Any) {
    if (obj is Person) { // instanceOf
        val person = obj // as Person 생략 가능
        println(person.name) // 스마트 캐스트
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person // null이 들어오면 null
    println(person?.name) // null이면 null
}

// Any : Object 역할
// Unit : void 역할
// Nothing 함수가 정상적으로 끝나지 않았다.