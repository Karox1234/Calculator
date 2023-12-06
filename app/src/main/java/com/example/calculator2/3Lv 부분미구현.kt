package com.example.calculator2


fun main() {
    val num1 = readLine()!!.toDouble()
    var oper = readLine()!!.toString()
    //사칙연산이 아닐시 오류경고와 함께 재입력을 시키게 만든다.
    val num2 = readLine()!!.toDouble()
    val calc = Calculator()
    val rel = calc.operate(num1, oper, num2)

    println("계산결과 ${rel} 입니다")

}

class Calculator {
    fun operate(num1: Double, oper: String, num2: Double): Double {
        var result: Double = when (oper) {
            "+" -> (AddOperation().operate(num1, num2))
            "-" -> (SubstractOperation().operate(num1, num2))
            "*" -> (MultiplyOperation().operate(num1, num2))
            "/" -> (DivideOperation().operate(num1, num2))
            "%" -> (num1 % num2)
            else -> {
                0.0
            }
        }
        return result
    }
}

class AddOperation {
    fun operate(num1: Double, num2: Double): Double {
        var result = (num1 + num2)
        return result
    }
}

class SubstractOperation {
    fun operate(num1: Double, num2: Double): Double {
        var result = (num1 - num2)
        return result
    }
}

class MultiplyOperation {
    fun operate(num1: Double, num2: Double): Double {
        var result = (num1 * num2)
        return result
    }
}

class DivideOperation {
    fun operate(num1: Double, num2: Double): Double {
        var result = (num1 / num2)
        return result
    }
}