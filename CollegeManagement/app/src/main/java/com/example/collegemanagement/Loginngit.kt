package com.example.collegemanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Loginngit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginngit)

        var name = findViewById<EditText>(R.id.name).text.toString()
        var login = findViewById<Button>(R.id.login)

        login.setOnClickListener(View.OnClickListener {
            if(name.isEmpty()){
                Toast.makeText(this@Loginngit, "Enter Roll no", Toast.LENGTH_LONG).show()
            }
            else {
                var next = Intent(this, MainActivity()::class.java)
                startActivity(next)
            }
        })
    }
}