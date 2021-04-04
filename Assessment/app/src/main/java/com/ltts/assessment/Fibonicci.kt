package com.ltts.assessment

class Fibonicci {
    fun fibo(number: Int): Unit{
        var first = 0
        var second = 1
        var third: Int
        for (i in 0..number-1) {
            if (number == 0 || number == 1)
                println(0)
            else {
                print("${first} ")
                third = first + second
                first = second
                second = third
            }
        }
    }
}

fun main(args:Array<String>){
    println("Enter the Number")
    Fibonicci().fibo(Integer.valueOf(readLine()))
}