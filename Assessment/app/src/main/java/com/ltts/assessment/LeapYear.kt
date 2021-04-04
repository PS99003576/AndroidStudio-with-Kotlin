package com.ltts.assessment

class LeapYear{
    fun checkLeapYear(year:Int): String{
        return if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {"Given year is a leap year"}
               else {"Given year is not a leap year"}
    }
}

fun main(args: Array<String>){
   var output:String = LeapYear().checkLeapYear(Integer.valueOf(readLine()))
    println(output)
}