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
    fun palindromeNumber(start:Long,end:Long){
        val list: MutableList<Long> = ArrayList()

        for (i in start..end) {
            if (findPalindrome(i)) {
                list.add(i)
            }
        }
        println("Palindrome Numbers from $start to $end  : $list")
    }
}
fun main(args:Array<String>){
    println("Enter Start range")
    var start = Integer.valueOf(readLine())

    println("Enter End of range")
    var end = Integer.valueOf(readLine())

    Palindrome().palindromeNumber(start.toLong(),end.toLong())
}