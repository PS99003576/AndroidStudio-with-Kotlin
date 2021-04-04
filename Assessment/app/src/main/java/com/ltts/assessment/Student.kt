package com.ltts.assessment


open class Student{
   fun totalMarks(marks:List<Int>):Double{
       var sum = 0.0
       var averageMarks  = 0
       for(i in 0..marks.size-1) {
           sum += marks[i]
       }

       return sum
   }

}
class Percentage : Student(){
    fun tPercentage(marks: List<Int>, sum:Double): Double {
        var total = marks.size*100
        return (sum/total)*100
    }
}

fun main(args:Array<String>) {
    var marks  = mutableListOf<Int>()
    println("enter the total number of subjects")
    var n : Int = Integer.valueOf(readLine())
    for (i in 1..n){
        println("enter the marks of subject $i out of 100")
        marks.add(Integer.valueOf(readLine()))
    }
    var student = Percentage()
    var total:Double = student.totalMarks(marks)
    var percentage = student.tPercentage(marks,total)
    println("Total marks scored : ${total}/${marks.size*100}")
    println("Equivalent percentage : ${percentage}")
}