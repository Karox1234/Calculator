package com.example.calculator2.Lv4

fun main() {
    println("첫번째 수를 입력하세요")
    val num1 = readLine()!!.toDouble()
    val oper:String
    while (true) {
        println("원하시는 사칙연산 기호를 입력하세요")
        val opertest = readLine()!!.toString()
        when (opertest) {
            "+", "-","*","/" -> {
                oper = opertest
                break
            }
            else -> {
                println("잘못된 기호입니다")
                continue
            }
        }

    }
    println("두번째 수를 입력하세요")
    val num2 = readLine()!!.toDouble()
    val calc = Calculator()
    var rel = calc.cac(num1, oper, num2)


    println("계산결과 ${rel} 입니다")
}
class Calculator{
    fun cac(num1: Double,oper:String,num2: Double): Double {
        var result: AbstractOperation = when (oper) {
            "+" -> (AddOperation())
            "-" -> (SubstractOperation())
            "*" -> (MultiplyOperation())
            "/" -> (DivideOperation())
            else -> (ellse())
        }
        return result.operate(num1, num2)
    }
}

open abstract class AbstractOperation{
    open abstract fun operate(num1: Double, num2: Double): Double

}
class AddOperation:AbstractOperation(){
   override fun operate(num1: Double, num2: Double): Double {
        return (num1+num2)
    }
}

class SubstractOperation:AbstractOperation() {
    override fun operate(num1: Double, num2: Double): Double {
         return (num1 - num2)
    }
}

class MultiplyOperation:AbstractOperation() {
   override fun operate(num1: Double, num2: Double): Double {
         return (num1 * num2)

    }
}

class DivideOperation:AbstractOperation() {
   override fun operate(num1: Double, num2: Double): Double {
        return  (num1 / num2)

    }
}

class ellse:AbstractOperation() {
    override fun operate(num1: Double, num2: Double): Double {
        return 0.0
    }
}