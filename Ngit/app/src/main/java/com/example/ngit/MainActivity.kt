package com.example.ngit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name = findViewById<EditText>(R.id.name)
        var login = findViewById<Button>(R.id.login)

        login.setOnClickListener(View.OnClickListener {
            if(name.text.toString().isEmpty()) Toast.makeText(this@MainActivity, "Enter Roll no", Toast.LENGTH_LONG).show()
            else {
                var next = Intent(this, MainPage()::class.java)
                startActivity(next)
                finish()
            }
        })

    }
}