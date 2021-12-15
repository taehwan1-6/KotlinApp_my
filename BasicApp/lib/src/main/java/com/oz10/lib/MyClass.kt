package com.oz10.lib

//class MainClass
public class MainClass {
    public fun printTest() {
        println("test")
    }
}

// ㅁ 코틀린 개요
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

// ㅁ Kotlin REPL 과 Scratch File - 복잡한 코틀린 코드 테스트
// 코틀린 REPL : 작은 코드를 테스트해 보고 싶을 때 사용
// Tools > Kotlin > Kotlin REPL
// 실행 : Ctrl + Enter / Command + Return

// REPL은 한 줄 단위로 코드를 실행할 때는 편리하긴 하지만, 복잡한 코드를 다룰 때는 사용하기 불편하다.
// REPL 대신 스크래치 파일을 사용하면 복잡한 코틀린 코드도 쉽게 테스트 해볼 수 있다.
// 프로젝트를 열고 File -> New -> Scratch File을 클릭
// New Scratch File 선택창에서 Kotlin을 선택
// 에디터 창에서 scratch.kts 파일이 열리고,
// 좌측에 코틀린 코드를 작성하면 우측에 자동으로 결과가 표시
//    val a : Int = 1
//    println(a)
//
//    class ABC {
//        var a = 1
//    }
//    var abc = ABC()
//    println(abc.a)
//
//    fun abc() {
//        println("hello")
//    }
//    abc()

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
