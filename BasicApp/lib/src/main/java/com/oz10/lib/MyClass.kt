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

// ㅁ 변수, 상수, 타입, 사칙연산
// 변수선언하기 : 변수 정의 형식
//    var a : Int = 5
//    변수정의키워드(val,var) | 변수이름 | 타입정의 | 대입연산자 | 대입값


fun main(args: Array<String>) {

    example05()
}

private fun example05() {
    val userCount: Int = 10   // Int 타입 어노테이션 지정
    val singleStrength = 2.231 // Double 타입 추론
    val companyName = "OZ10"  // String 타입 추론

    // 타입 어노테이션을 지정하여 불변 변수를 선언할 때는 초깃값을 나중에 지정이 가능
    val bookTitle: String
    val iosBookType = false

    if (iosBookType) {
        bookTitle = "iOS App"
    } else {
        bookTitle = "Android App"
    }
    println(bookTitle)
//    bookTitle = "iOS App"
}


// 바이트 변환
private fun example04() {
    val f : Short = 200
    val b = f.toByte()
    println(b)
}

// 사칙연산
private fun example03() {
    println(5 + 5)
    println(10 - 2)
    println(3 * 2)
    println(7 / 2)
    println(7 % 2)
    println(7 / 2.0)
}

// 타입
private fun example02() {
    // 논리형
    val b1 = true
    val b2 = false
    println(b1)

    // 문자형
    val c = 'A'

    // 정수형
    val num1: Byte = 127 // 1byte
    val num2: Short = 20 // 2byte
    val num3: Int = 30   // 4byte
    val num4: Long = 40  // 8byte

    // 실수형
    val num5 = 10.3.toFloat() // 4byte
    val num6 = 10.3          // 8byte
}

private fun example01() {
    println("Welcome to Kotlin")
    for (i in 1..8) {
        println("i = $i")
    }
}

private fun example00() {
    println(1 + 2)
    println(1 + 2)
    println(1 + 2)
}
