package com.ltts.assessment

open class CheckPalindrome{
    fun findPalindrome(number:Long):Boolean{
        var isPalindromeNumber = false
        var sum : Long= 0
        var tempNum = number

        while (tempNum > 0) {
            val r = tempNum % 10
            sum = sum * 10 + r
            tempNum /= 10
        }
        if (sum == number) {
            isPalindromeNumber = true
        }
        return isPalindromeNumber
    }
}

class Palindrome:CheckPalindrome(){
    fun palindromeNumber(end:Int){
        var list = mutableListOf<Any>()
        var loop = end
        var i=1
        while (loop >= 1) {
            if (findPalindrome(i.toLong())){
                list.add(i.toLong())
                loop--
            }
            i++
        }
        println("First $end Palindrome Numbers  : $list")
    }
}
fun main(args:Array<String>){
    println("Enter the number of palindromes you want")
    Palindrome().palindromeNumber(Integer.valueOf(readLine()))
}