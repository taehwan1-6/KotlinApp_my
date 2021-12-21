package com.oz10.lib

// 코틀린 클래스 상속과 서브 클래스
// 상속과 서브 클래스 개요
//   코틀린의 모든 클래스는 기본적으로 Any 라는 클래스의 파생(상속) 클래스가 된다
//   Any 클래스는 모든 클래스의 기반이 되는 속성과 함수를 제공한다
//   파생(상속) 클래스를 생성하면 클래스 간의 계층 구조가 형성
//     베이스 base  / 루트 root 클래스 : 계층 구조의 제일 최상위 클래스
//     서브 sub    / 자식 child 클래스 : 파생(상속)된 클래스
//     부모 parent / 슈퍼 super 클래스 : 서브 클래스의 바로 위 계층 클래스
//   코틀린은 다중 상속 multiple inheritance 를 지원하지 않는다
//     바로 위 계층의 부모 클래스는 하나만 될 수 있다

// 서브 클래스 생성
//   open class ParentClass { … }
//   class SubClass : ParentClass() { … }
//   클래스 상속 관련 코드의 오류나 착오 방지를 위해 부모 클래스에 open 키워드 사용
// 기본 생성자를 갖는 클래스의 경우 서브 클래스에 부모 클래스의 기본 생성자를 참조하도록 서브 클래스를 선언
//   open class ParentClass(var x: Int) { … }
//   class SubClass(x: Int) : ParentClass(x) { … }
open class ParentClass {
    var x: Int = 0
}
class SubClass : ParentClass() {
}

fun main(args: Array<String>) {
    val sc = SubClass()
    println( sc.x )
    sc.x = 1
    println( sc.x )
}
