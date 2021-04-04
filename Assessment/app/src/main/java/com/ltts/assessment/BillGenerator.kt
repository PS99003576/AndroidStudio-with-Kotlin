package com.ltts.assessment

class BillGenerator{

    fun discountOnBill(totalBill1: Float):Float{
        var discountAmount :Float= 15*totalBill1
        return (discountAmount/100)
    }
}


fun main(args:Array<String>){
    var bill = BillGenerator()
    println("Enter the product price :")
    var price = Integer.valueOf(readLine())
    println("Entyer the number of units you want to buy:")
    var quantity = Integer.valueOf(readLine())
    var totalBill :Float = (price*quantity).toFloat()

    var discountAmount1 :Float = bill.discountOnBill(totalBill)
    var finalAmount = totalBill-discountAmount1
    println("Total bill amount : ${totalBill}")
    println(" 15% discount : ${discountAmount1}")
    println("Final amount : ${finalAmount}")
}