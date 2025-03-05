fun main() {
    var num1 = 10 // 가변
    val num2 = 20 // 불변
    var num3: Long = 10 // 명시적 타입 지정

    var num4: Long // 초기화 하지 않음

    // element에 val을 선언하더라도 값 자체는 추가할수있음
   // 왠만하면 불변하게 해놓고 풀어주는 식으로

    var num5 = 1000L // long Long? 필요할때마다 알아서 처리해준다.

    var num6 = 1000L
//    num6 = null 에러가 난다. null이 못들어가게 한다. 기본적으로

    var num7: Long? = null // null이 들어가고 싶으면 ?

//    var person = Person("최두영") new 쓸필요 ㄴㄴ
}