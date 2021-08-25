package com.example.ngit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Course : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)

        var cse = findViewById<Button>(R.id.CSE)
        var It = findViewById<Button>(R.id.IT)

        cse.setOnClickListener(View.OnClickListener {
            var nextp1 = Intent(this,DisplayTimeTable()::class.java)
            startActivity(nextp1)
        })
        It.setOnClickListener(View.OnClickListener {
            Toast.makeText(this@Course, "This Feature will added soon", Toast.LENGTH_LONG)
                .show()
        })
    }
}