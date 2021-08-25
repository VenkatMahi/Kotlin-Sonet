package com.example.ngit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import kotlinx.coroutines.launch

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        this.deleteDatabase("ngit")

        var Fname = findViewById<EditText>(R.id.firstName)
        var Lname = findViewById<EditText>(R.id.lastName)
        var email = findViewById<EditText>(R.id.email)
        var id = findViewById<EditText>(R.id.ID)
        var pass = findViewById<EditText>(R.id.password1)
        var register = findViewById<Button>(R.id.resigeterButton)

        val config = Room.databaseBuilder(this,UserDatabase::class.java,"ngit")
        val db = config.build()

        var next = Intent (this,MainActivity()::class.java)

        register.setOnClickListener(View.OnClickListener {
            if(Fname.text.toString().isEmpty() or Lname.text.toString().isEmpty() or email.text.toString().isEmpty() or pass.text.toString().isEmpty()) {
                Toast.makeText(this, "Please fill the Details", Toast.LENGTH_LONG).show()
            }
            else{
                lifecycleScope.launch {
                    var check = db.userDao().getPassword(id.text.toString())
                    if(check.isEmpty()){
                        val user = User(0,Fname.text.toString(),Lname.text.toString(),id.text.toString(),pass.text.toString(),email.text.toString())
                        db.userDao().insertUser(user)
                        Toast.makeText(this@Register, "Registration Complete", Toast.LENGTH_LONG).show()
                        startActivity(next)
                    }
                    else{
                        Toast.makeText(this@Register, "User Exist", Toast.LENGTH_LONG).show()
                    }
                }


            }
        })

    }
}