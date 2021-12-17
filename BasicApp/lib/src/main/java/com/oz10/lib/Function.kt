package com.oz10.lib

// 코틀린의 함수 function 와 람다 lambda :
//   잘 조직되고 효율적인 코드를 작성하는 데 필요한 필수 요소이며
//   중복을 피하면서 프로그램을 구성하는 방법을 제공

fun main(args: Array<String>) {
    println("Function & Lambda")
    println()

    println("Function..")
    example01()
    println()

    sayHello()
}

// 함수란?: 특정 작업을 수행하기 위해 호출될 수 있는 이름이 있는 코드 블록
// 함수는 작업 수행에 필요한 데이터를 받으며 자신을 호출한 코드로 결과를 반환할 수 있다.
// 함수 구성: 이름, 매개변수, 반환 타입, 몸체(실행 코드)
// 함수 선언
// fun <함수명> (<매개변수명>: <매개변수 타입>, …): <반환 타입> {
//    // <몸체>함수 코드
// }
fun sayHello() {
    println("hello")
}

fun buildMessageFor(name: String, count: Int): String {
    return ("$name, you are customer number $count")
}

// 함수 호출
// <함수명> (<인자1>, <인자2>, …)
private fun example01() {
    sayHello()
    val msg = buildMessageFor("park", 5)
    println(msg)
}
