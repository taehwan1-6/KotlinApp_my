package com.oz10.lib

// ㅁ 코틀린 컬렉션 collection
// List, Set, Map

// List
//  각 요소값이 순차적으로 저장되며, 중복값을 허용
//  listOf 함수를 사용, 읽기 전용 List 를 반환
//  mutableListOf 함수 사용, 변경 가능 List를 반환
//      변경자 함수 mutator function : 변경 가능 List 요소를 변경하는 함수들

fun listCollection() {
    val list: List<String> = listOf("one", "two", "three") // 읽기 전용 List
    println(list)
    println(list[0])    // List 요소 사용하기
    println(list.first())
    println(list.last())
    println(list.getOrElse(2) { "Unknown" })  // 안전한 인덱스 사용 함수
    println(list.getOrElse(3) { "Unknown" })
    println(list.getOrNull(3) ?: "Unknown")
    println(list.contains("one"))   // 요소가 있는지 검사
    println(list.containsAll(listOf("one", "four")))   // 여러 요소가 있는지 검사
    println("===========")

    val mlist = mutableListOf("one", "two", "three")    // 변경 가능 List
    println(mlist.remove("one")); println(mlist)
    mlist.add("four"); println(mlist)
    mlist.add(0, "one"); println(mlist)
    mlist[0] = "1"; println(mlist)  // 인덱스 연산자를 사용해서 요소 변경

    mlist.addAll(listOf("Eli", "Alex")); println(mlist)
    mlist -= listOf("Eli", "Alex"); println(mlist)
    mlist += listOf("Eli", "Alex"); println(mlist)

    // 람다에 지정된 조건식을 기반으로 List 요소들을 삭제
    mlist.removeIf { it.contains("o") }; println(mlist)
    val readOnlyList = mlist.toList()   // 읽기 전용으로 변경
    mlist.clear(); println(mlist)

    // 반복 처리
    for (p in list) print("$p.. "); println()
    list.forEach { p -> print("$p.. ") }; println()
    list.forEachIndexed { index, p -> print("$index=$p.. ") }; println()

    // 요소 섞기
    print("shuffled : ")
    println(list.shuffled().first())

    // 해체 destructure
    val (a, b, c) = list    // 요소들을 분리
    println("$a, $b, $c")
    val (d, _, e) = list    // 해체를 원하지 않는 요소에 밑줄 기호를 사용
    println("$d, $e")


}

fun main(args: Array<String>) {
    listCollection()
}