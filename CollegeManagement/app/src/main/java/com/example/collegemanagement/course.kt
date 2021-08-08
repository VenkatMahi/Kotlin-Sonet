package com.example.collegemanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class course : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)

        var cse = findViewById<TextView>(R.id.cse)
        var it = findViewById<TextView>(R.id.it)

        cse.setOnClickListener(View.OnClickListener {
            var next = Intent(this,CSE()::class.java)
            startActivity(next)
        })

        it.setOnClickListener(View.OnClickListener {
            var next1 = Intent(this,IT()::class.java)
            startActivity(next1)
        })
    }
}