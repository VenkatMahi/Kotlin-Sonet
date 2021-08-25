package com.example.ngit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var login = findViewById<Button>(R.id.login)
        var register = findViewById<TextView>(R.id.register)
        var name = findViewById<EditText>(R.id.name)
        val config = Room.databaseBuilder(this,UserDatabase::class.java,"ngit")
        val db = config.build()
        var password = findViewById<EditText>(R.id.password)
        var next = Intent(this, MainPage::class.java)

        register.setOnClickListener(View.OnClickListener {
            var nextp = Intent(this,Register()::class.java);
            startActivity(nextp)
        })


        login.setOnClickListener(View.OnClickListener {
            if(name.text.toString().isEmpty()) Toast.makeText(this@MainActivity, "Enter ID", Toast.LENGTH_LONG).show()
            else {
                lifecycleScope.launch {
                    var userData = db.userDao().getPassword(name.text.toString())
                    var userName = userData.get(0).FirstName
                    if (userData.get(0).password == password.text.toString()) {
                            Toast.makeText(this@MainActivity, "Welcome $userName", Toast.LENGTH_LONG)
                            .show()

                        startActivity(next)
                        finish()
                    } else {
                        if (userData.orEmpty().isEmpty()) {
                            Toast.makeText(this@MainActivity, "No User Exist with given Id", Toast.LENGTH_LONG).show()
                        } else {
                            Toast.makeText(this@MainActivity, "Wrong Password", Toast.LENGTH_LONG)
                                .show()
                        }
                    }
                }

            }
        })





    }



}