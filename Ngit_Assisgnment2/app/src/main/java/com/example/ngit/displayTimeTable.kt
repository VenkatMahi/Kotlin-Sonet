package com.example.ngit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Spinner
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DisplayTimeTable : AppCompatActivity() {

    private var layoutManager:RecyclerView.LayoutManager?= null
    private lateinit var day:String
    private var adapter : RecyclerView.Adapter<addS.ViewHolder>? = null

    private val monday = arrayOf("CO 10:00-11:00","DAA 11:00-1:00","DBMS 2:00-3:40")
    private val tuesday = arrayOf("F&A 9:00-9:50","SS 10:00-10:50","JAVA 11:00-1:00","M3 2:00-2:50","CO 2:50-3:40")
    private val wednesday = arrayOf("ETC 10:00-10:50","DAA 11:00-1:00","DBMS 2:00-3:40")
    private val thurs = arrayOf("M3 10:00-10:50","JAVA 11:00-1:00","F&A 2:00-2:50","SS 2:50-3:40")
    private val friday = arrayOf("DBMS 9:00-10:50","DAA 11:00-1:00","M3 2:00-2:50","ETC 2:50-3:40")
    private val saturaday = arrayOf("CO 10:00-10:50","JAVA 11:00-1:00","SS 2:00-2:50","F&A 2:50-3:40")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_time_table)
        lateinit var pos:Array<String>


        val spinner = findViewById<Spinner>(R.id.spinner)
        val btn1 = findViewById<Button>(R.id.button)

        btn1.setOnClickListener(View.OnClickListener {
            day = spinner.selectedItem.toString()
            pos = getDayPosition(day)
            layoutManager = LinearLayoutManager(this)
            val recyclerView = findViewById<RecyclerView>(R.id.recycleView)

            recyclerView.layoutManager = layoutManager


            adapter = addS(pos)
            recyclerView.adapter = adapter

        })





    }

    private fun getDayPosition(day: String): Array<String> {
        if(day=="Monday") return monday
        if(day=="Tuesday") return tuesday
        if(day=="Wednesday") return wednesday
        if(day=="Thursday") return thurs
        if(day=="Friday") return friday
        if(day=="Saturday") return saturaday
        return monday

    }

}