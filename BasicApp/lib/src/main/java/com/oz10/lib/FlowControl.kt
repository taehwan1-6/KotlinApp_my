package com.oz10.lib

// 코틀린 흐름 제어 flow control - 하나 이상의 조건에 기반하여 실행할 코드와 횟수를 결정

fun main(args: Array<String>) {
    println("Flow Control")

    example04()
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

// while 문: 반복 처리 횟수는 모르고 특정 조건을 충족할 때까지 반복 처리
// while (조건식) { //실행 코드 }
private fun example02() {
    var cnt = 0
    while (cnt < 10) {
        print("$cnt.. ")
        cnt++;
    }
    println()

    cnt = 0
    while (cnt < 10) print("${cnt++}.. "); println()
}

// do … while 문: 루프 내부의 코드를 먼저 실행한 후 조건을 검사(최소1회)
// do { //실행 코드 } while (조건식)
private fun example03() {
    var cnt = 10
    do {
        print("$cnt.. ")
        cnt--;
    } while (cnt > 0)
    println()

    cnt = 10
    do print("${cnt--}.. ") while (cnt > 0); println()
}

// 루프 벗어나기
//   break 현재 루프를 벗어나서 루프 바로 다음에 있는 코드를 실행
//   continue 루프 내부의 나머지 코드는 실행하지 않고 루프의 처음으로 돌아가서 다음 반복을 계속 실행
//   라벨명@ 를 사용해서 표현식 앞에 라벨을 붙이고 break와 continue 문에서 참조
//     break@라벨명
private fun example04() {
    var cnt = 10
    for (i in 0..20) {
        cnt++
        if (cnt > 20)
            break
        print("$cnt.. ")
    }
    println("1번끝")

    cnt = 1
    while (cnt < 20) {
        cnt++
        if (cnt % 2 != 0) // 홀수이면 continue
            continue
        print("$cnt.. ")
    }
    println()

    outerloop@
    for (i in 1..100) {
        println("i -> $i")
        for (j in 1..100) {
            print("$j.. ")
            if (j == 10) break@outerloop
        }
    }
    println()

}
