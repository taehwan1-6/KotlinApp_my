package com.oz10.lib

// 코클린 객체지향: 클래스 정의(속성과 함수)

// 객체 object
//   객체는 클래스의 인스턴스라고도 하며 독립적인 기능을 갖는 모듈
//   자신의 데이터를 갖는 속성과 특정 작업을 수행하는 메서드(함수)로 구성
// 클래스 class
//   클래스는 생성되는 객체가 어떤 모습인지, 속성과 메서드를 정의
//   class 클래스명: 부모 클래스명 { // 속성 // 함수 }
// 클래스에 속성 추가
//   데이터 캡슐화 encapsulation : 클래스에 캡슐화된 데이터를 속성 또는 인스턴스 변수라고 한다
// 클래스에 함수 정의
//   코틀린의 표준 함수 선언 문법을 사용해서 클래스의 열고 닫는 중괄호({}) 내부에 선언
class BankAccount {

    var acountBlance: Double = 0.0  // 잔액
    var accountNumber: Int = 0      // 은행계좌번호

    // 계좌 잔액을 출력하는 함수
    fun displayBlance() {
        println("Number $accountNumber")
        println("Currnet blance is $acountBlance")
    }
}

// 클래스 인스턴스 생성하고 초기화
//   클래스로 뭔가를 하려면 인스턴스를 생성, 생성되는 인스턴스의 참조를 저장할 변수를 선언
//   val account1: BankAccount = BankAccount()
//   val account1 = BankAccount()  // 변수의 타입을 코틀린 컴파일러가 추론, 생략 가능
//   클래스의 인스턴스가 생성되어 변수를 사용(참조)할 수 있다
fun main(args: Array<String>) {
    val account1: BankAccount = BankAccount()
    val account2 = BankAccount()  // 변수의 타입을 코틀린 컴파일러가 추론, 생략 가
}
