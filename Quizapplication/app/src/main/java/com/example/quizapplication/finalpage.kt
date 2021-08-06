package com.example.quizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class finalpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finalpage)
        var Name: String? = intent.getStringExtra("name_")
        var Score: String? = intent.getStringExtra("score")

        var name = findViewById<TextView>(R.id.name_)
        var score = findViewById<TextView>(R.id.score)
        var playagain = findViewById<Button>(R.id.playAgain)

        name.text = "Name : " + Name
        score.text = "Score : " + Score + "/5"

        playagain.setOnClickListener(View.OnClickListener {
            var playAgain:Intent = Intent(this,MainActivity()::class.java)
            startActivity(playAgain)
            finish()
        })

    }
}

