package com.oz10.lib

class MyClass {
}

// JVM : 코틀린 소스코드 -> 바이트코드 변환 -> JVM 이 바이트코드 실행 -> 콘솔 출력
// 데이터타입 : 자바는 (기본데이터타입 8개 + 참조데이터타입), 코틀린은 모두 참조데이터타입
//    코틀린 내장(built-in) 타입 : String, Char, Boolean, Int, Double 과 컬렉션 타입 List, Set, Map
// 연산자(우선순위),
// 제어문(조건문, 반복문)
// 메소드(함수)
// -----------------------------
// 객체지향(추상화, 캡슐화, 상속, 다형성) -> 리팩토링 + 디자인패턴
// 쓰레드, IO, 네트워크
// swing, JavaFX(Win), Spring(Web), Android(mobile)


fun main(args: Array<String>) {

    println("Welcome to Kotlin")
    for (i in 1..8) {
        println("i = $i")
    }

    example00()
}

private fun example00() {
    println(1 + 2)
    println(1 + 2)
    println(1 + 2)
}
