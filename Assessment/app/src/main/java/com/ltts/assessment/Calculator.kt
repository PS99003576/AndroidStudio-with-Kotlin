package com.ltts.assessment

class Calculator{
    fun addition(num1:Int,num2:Int){
        println(num1+num2)
    }
    fun multiplication(num1: Int,num2: Int){
        println(num1*num2)
    }
    fun division(num1: Int,num2: Int){
        println(num1/num2)
    }

    fun subtrct(num1: Int, num2: Int) {
        println(num1-num2)
    }
}

fun main() {
    while (true) {
        println("enter the first number")
        var num1 :Int = Integer.valueOf(readLine())
        println("enter the second number")
        var num2 :Int = Integer.valueOf(readLine())
        println("choose the operation to perform")
        println("1.addition")
        println("2.subtarction")
        println("3.multiplication")
        println("4.division")
        println("5. Exit")
        var operation :Int = Integer.valueOf(readLine())
        var output = Calculator()

        when (operation) {
            1 -> {
                output.addition(num1, num2)
            }
            2 -> {
                output.subtrct(num1, num2)
            }
            3 -> {
                output.multiplication(num1, num2)
            }
            4 -> {
                output.division(num1, num2)
            }
            5 -> System.exit(0)
        }
    }
}