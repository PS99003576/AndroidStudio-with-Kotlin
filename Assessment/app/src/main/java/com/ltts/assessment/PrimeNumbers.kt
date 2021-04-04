package com.ltts.assessment

open class PrimeNumbers {
    fun checkPrimeNumber(num: Int): Boolean {
        var flag = true
        for (i in 2..num / 2) {
            if (num % i == 0) {
                flag = false
                break
            }
        }
        return flag
    }
}

class Check:PrimeNumbers(){
    fun primeNumbersView(number: Int) {
        var low = 2
        val high = number
        while (low < high) {
            if (checkPrimeNumber(low))
                print(low.toString() + " ")
            ++low
        }
    }

}

fun main(args:Array<String>){
      Check().primeNumbersView(Integer.valueOf(readLine()))
}