package com.ltts.genisisrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myrv=findViewById<RecyclerView>(R.id.myrecyclerview)
        myrv.layoutManager=LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        var myDataList=ArrayList<UsersData>()
        myDataList.add(UsersData("roshan","roshan@gmail.com","987789450"))
        myDataList.add(UsersData("zameer","zam@gmail.com","9876554355"))
        myDataList.add(UsersData("shaik","sha@gmail.com","9876553545"))
        myDataList.add(UsersData("anwar","anw@gmail.com","9876522476"))
        myDataList.add(UsersData("basha","bash@gmail.com","98354745436"))
        myrv.adapter=MyAdapter(myDataList)

    }

}