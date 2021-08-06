package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var input1 = findViewById<TextView>(R.id.textview)
        var input2 = findViewById<TextView>(R.id.textview2)

        var spiiner = findViewById<Spinner>(R.id.spinner)
        var btn = findViewById<Button>(R.id.button)
        var sym = spiiner.selectedItem.toString()
        var result = findViewById<TextView>(R.id.result)

        btn.setOnClickListener(View.OnClickListener {
            var a = input1.text.toString().toInt()
            var b = input2.text.toString().toInt()
            var res = ""
            when(sym){
                "+" -> res="${a+b}"
                "-" -> res="${a-b}"
                "*" -> res="${a*b}"
                "/" -> res="${a/b}"
            }
            result.text = res

        })


    }
}