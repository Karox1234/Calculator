package com.example.calculator2.Lv2

fun main() {
    val num1 = readLine()!!.toInt()
    var oper = readLine()!!.toString()
    val num2 = readLine()!!.toInt()

    class Calculator

    if(oper == "+") {
        val plusResult = num1 + num2
        println("덧셈 결과 ${plusResult} 입니다")

    } else if(oper == "-") {
        val minusResult = num1 - num2
        println("뺄셈 결과 ${minusResult} 입니다")

    } else if(oper == "*") {
        val multipleResult = num1 * num2
        println("곱셈 결과 ${multipleResult} 입니다")

    } else if(oper == "/") {
        val divideResult = num1 / num2
        println("나눗셈 결과 ${divideResult} 입니다")

    } else if(oper == "%") {
        val modResult = num1 % num2
        println("나머지 값은 ${modResult} 입니다")

    } else {
        println("오류")
    }

//    when (oper) {
//        "+" -> {
//            val plusResult = num1 + num2
//            println("덧셈 결과 ${plusResult} 입니다")
//        }
//
//        "-" -> {
//            val minusResult = num1 - num2
//            println("뺄셈 결과 ${minusResult} 입니다")
//        }
//
//        "*" -> {
//            val multipleResult = num1 * num2
//            println("곱셈 결과 ${multipleResult} 입니다")
//        }
//
//        "/" -> {
//            val divideResult = num1 / num2
//            println("나눗셈 결과 ${divideResult} 입니다")
//
//        }
//
//        "%" -> {
//            val modResult = num1 % num2
//            println("나머지 값은 ${modResult} 입니다")
//        }
//
//
//        else -> {
//            println("오류")
//        }
//
//    }
//    class AddOperation
//    class SubstractOperation
//    class MultiplyOperation
//    class DivideOperation

}