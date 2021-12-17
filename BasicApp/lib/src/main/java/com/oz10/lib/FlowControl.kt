package com.oz10.lib

// 코틀린 흐름 제어 flow control - 하나 이상의 조건에 기반하여 실행할 코드와 횟수를 결정

fun main(args: Array<String>) {
    println("Flow Control")

    example01()
}

// 루프 흐름 제어: 루프는 지정된 조건이 충족되는 동안 반복 실행되는 코드

// for-in 문: 컬렉션 collection 이나 숫자 범위에 포함된 항목을 반복 처리하는 데 사용
// for (변수명 in '컬렉션이나 범위') { //실행될 코드 }
//    downTo: 지정된 컬렉션을 거꾸로 반복 처리
//    until: 지정된 컬렉션을 처음부터 반복 처리
//    until step: 매 반복마다 증가될 값을 지정
private fun example01() {
    for (index in 1..5) {
        println(index)
    }

    for (index in "Hello") print("$index.. "); println()
    for (index in 100 downTo 90) print("$index.. "); println()
    for (index in 1 until 10) print("$index.. "); println()
    for (index in 0 until 100 step 10) print("$index.. "); println()
}
