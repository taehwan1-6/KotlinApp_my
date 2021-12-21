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

// 클래스의 기본과 보조 생성자
//   생성자 constructor : 클래스 인스턴스를 생성할 때 초기화 작업을 해야 하는 경우

// 보조생성자 secondary constructor :
//   class BankAccount { constrouctor(…) : this(…) { //초기화 코드 }
//    서로 다른 구성 값으로 인스턴스를 초기화, 클래스 내부에 선언,
//    여러 개의 클래스 보조 생성자를 가질 수 있다
//            보조생성자에 선언된 변수는 클래스 내부 속성으로 추가해야 한다
//            보조생성자에서 기본생성자 속성을 초기화하기 위해 this 키워드를 사용해 기본생성자를 호출한다

// 기본생성자 primary constructor :
//   class BankAccount (val accountNumber: Int, var accountBalance: Double){ }
//   기본적인 초기화 작업을 수행, 클래스의 헤더에 선언, 클래스의 기본생성자는 하나만 가질 수 있다
//   기본생성자에 선언된 변수는 자동으로 클래스 속성이 된다

// 초기화 블록 initializer block
//   기본생성자는 실행 코드를 포함할 수 없으므로
//   기본생성자 다음에 자동 실행
//   (단, 기본 생성자가 없고 보조 생성자만 있을 때는 실행되지 않는다)

// 클래스 커스텀 접근자
//   속성 기본 접근자 accessor : 속성값을 가져오거나 설정하는 기본 제공 접근자
//   속성 커스텀 접근자 : 속성이 반환되거나 설정되기 전에 원하는 로직을 실행
//     각 속성에 게터 getter 나 세터 setter 를 작성하여 구현
//     연산속성 computed property : 클래스의 다른 속성값을 사용하여 자신의 값을 산출하는 속성
//     세터를 선언하면 속성값을 변경한다는 것이므로 해당 속성을 val 이 아닌 var 로 선언한다



class BankAccount {

    var accountBalance: Double = 0.0  // 잔액
    var accountNumber: Int = 0      // 은행계좌번호
    var name: String = ""       // 고객이름

    constructor(number: Int, balance: Double) {
        this.accountNumber = number
        accountBalance = balance
    }

    constructor(number: Int, balance: Double, name: String) {
        this.accountNumber = number
        this.accountBalance = balance
        this.name = name
    }

    // 계좌 잔액을 출력하는 함수
    fun displayBlance() {
        println("Number $accountNumber")
        println("Name is $name")
        println("Currnet blance is $accountBalance")
    }
}

// 클래스 기본 생성자
class BankAccount2 (val accountNumber: Int, var accountBalance: Double) {
    var name: String = ""       // 고객이름

    constructor(number: Int, balance: Double, name: String) : this(number, balance) {
        this.name = name
    }

    fun displayBlance() {
        println("Number $accountNumber")
        println("Name is $name")
        println("Currnet blance is $accountBalance")
    }
}

// 초기화 블록 클래
class BankAccount3 (val accountNumber: Int, var accountBalance: Double) {
    init {
        // 초기화하는 코드
        accountBalance = 0.0
    }

    var name: String = ""       // 고객이름

    constructor(number: Int, balance: Double, name: String) : this(number, balance) {
        this.name = name
    }

    // 계좌 잔액을 출력하는 함수
    fun displayBlance() {
        println("Number $accountNumber")
        println("Name is $name")
        println("Currnet blance is $accountBalance")
    }
}

// 클래스 커스텀 접근자
class BankAccount4 (val accountNumber: Int, var accountBalance: Double) {
    init {
        // 초기화하는 코드
        accountBalance = 0.0
    }

    var name: String = ""       // 고객이름
    val fees: Double = 25.00    // 은행 수수료 공제금액

    var balanceLessFees: Double
        get() { return accountBalance - fees}
        set(value) { accountBalance = value - fees}

    // 파라미터로 안들어와도 되는 부분, 하지만 저 위에는 파라미터로 꼭 들어와야하는 부분 맞나?
    constructor(number: Int, balance: Double, name: String) : this(number, balance) {
        this.name = name
    }

    // 계좌 잔액을 출력하는 함수
    fun displayBlance() {
        println("Number $accountNumber")
        println("Name is $name")
        println("Currnet blance is $accountBalance")
    }
}


// 클래스 인스턴스 생성하고 초기화
//   클래스로 뭔가를 하려면 인스턴스를 생성, 생성되는 인스턴스의 참조를 저장할 변수를 선언
//   val account1: BankAccount = BankAccount()
//   val account1 = BankAccount()  // 변수의 타입을 코틀린 컴파일러가 추론, 생략 가능
//   클래스의 인스턴스가 생성되어 변수를 사용(참조)할 수 있다

// 클래스 함수 호출과 속성 사용
//   클래스인스턴스.속성명
//   클래스인스턴스.함수명()
//   클래스 인스턴스 참조(변수 등)에 점(.)을 붙이고 그 다음에 함수나 속성을 지정

fun main(args: Array<String>) {

    val account1: BankAccount = BankAccount(12345, 100.0)
    val account2 = BankAccount(12346, 100.0)  // 변수의 타입을 코틀린 컴파일러가 추론, 생략 가
    val account3 = BankAccount(12347, 100.0, "park")
    account2.displayBlance()
    account3.displayBlance()

    println("=========================")

    val account4 = BankAccount2(12348, 100.0,"kang")
    account4.displayBlance()

    println("=========================")

    val account5 = BankAccount3(12349, 1.0, "kang")
    account5.displayBlance()

    println("=========================")

    account1.accountBalance = 1000.0
    val balance1 = account1.accountBalance
    account1.displayBlance()

    println("=========================")

    val account6 = BankAccount4(12349, 300.0)
    account6.displayBlance()

    account6.balanceLessFees = 200.0
    account6.displayBlance()


}
