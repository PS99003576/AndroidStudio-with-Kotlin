package com.ltts.assessment

class Circle{
    fun radiusOfCircle(radius:Int):Double{
        return (3.14*radius*radius)

    }
    fun perimeterOfCircle(radius:Int):Double{
        return (2*3.14*radius)

    }
}

fun main(args :Array<String>){
    println("enter the radius of circle")
    var radius = Integer.valueOf(readLine())
    var calculation = Circle()
    var area: Double = calculation.radiusOfCircle(radius)
    var perimeter: Double = calculation.perimeterOfCircle(radius)
    var lengthOfSquareSide: Double = perimeter/4
    println("Area of the circle is ${area}")
    println("Perimeter of the circle is ${perimeter}")
    println("Length of the side of the square whose perimeter is the same as the circle's perimeter is ${lengthOfSquareSide}")

}