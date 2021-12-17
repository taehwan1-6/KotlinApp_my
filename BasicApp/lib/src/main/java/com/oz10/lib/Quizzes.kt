package com.oz10.lib

fun main(args: Array<String>) {
    print("Quizzes")

    print("윤년 맞추기..")
    checkLeapYear(1700) // 1700 X
}

fun checkLeapYear(year: Int) {
    // 윤년 맞추기
    // 1700, 2016, 2020, 1900, 2400, 2100, 2019
    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        println("$year O")
    else
        println("$year X")
}