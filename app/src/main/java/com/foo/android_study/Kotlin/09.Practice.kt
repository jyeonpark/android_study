package com.foo.android_study.Kotlin

fun main(args: Array<String>) {

    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null) {
        println("a is null")
    } else {
        println("a is not null")
    }

    if (b + c == 110) {
        println("b plus c is 110")
    } else {
        println("b plus c is not 110")
    }

    // 엘비스 연산자
    val number: Int? = 100
    val number2 = number ?: 10 // number 가 null 이면 10 이 들어감
    println()
    println(number2)

    val num1: Int = 10
    val num2: Int = 20

    val max = if (num1 > num2) {
        num1 //5
    } else if (num1 == num2) {
        num2 //10
    } else { // else 가 없으면 반드시 return 을 하는 것은 아니므로 max 에 값이 들어가지 않을 수도 있음 -> error
        100
    }


}