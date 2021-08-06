package com.example.perimeterofcircle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var radius = findViewById<EditText>(R.id.radius)
        var result = findViewById<TextView>(R.id.result)
        var btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener(View.OnClickListener {
            val pie:Double = 3.14
            var rad = radius.text.toString().toDouble()
            var r:Double = pie * rad * rad
            result.text = r.toString()
        })
    }
}