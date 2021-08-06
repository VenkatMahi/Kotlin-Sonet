package com.example.quizapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class quiz_acitivity : AppCompatActivity(),View.OnClickListener {

    private var listofquestions:ArrayList<quiz_question>? = null
    var currentPosition:Int = 0;
    lateinit var question:TextView
    lateinit var opt1:TextView
    lateinit var opt2:TextView
    lateinit var opt3:TextView
    lateinit var opt4:TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_acitivity)
        var Utility:utility = utility()

        listofquestions = Utility.get_question()

        var name: String? = intent.getStringExtra("name");

        var q_name = findViewById<TextView>(R.id.name);
        q_name.text = name;
        question =  findViewById<TextView>(R.id.Question)
        opt1 =  findViewById<TextView>(R.id.option_1)
        opt2 =  findViewById<TextView>(R.id.option_2)
        opt3 =  findViewById<TextView>(R.id.option_3)
        opt4 =  findViewById<TextView>(R.id.option_4)



        var next = findViewById<Button>(R.id.next);
        var pre = findViewById<Button>(R.id.previous);
        var submit = findViewById<Button>(R.id.submit);

        next.setOnClickListener(View.OnClickListener {
            if(currentPosition > -1 && currentPosition < 5) {
                currentPosition = currentPosition + 1;
                setQuestions(currentPosition)
            }
            else{
                Toast.makeText(this@quiz_acitivity,"No more Questions available",Toast.LENGTH_SHORT).show();
            }

        })

        opt1.setBackgroundColor(Color.parseColor("#FF0000"))

        pre.setOnClickListener(View.OnClickListener {
            if(currentPosition<5 && currentPosition>0){
                currentPosition = currentPosition - 1;
                setQuestions(currentPosition);
            }
            else{
                Toast.makeText(this@quiz_acitivity,"No more Questions available",Toast.LENGTH_SHORT).show();
            }
        })


        submit.setOnClickListener(View.OnClickListener {
            nextPage();
        })


    }

    fun nextPage(){
        /*var finish:Intent = Intent(this,finalpage()::class.java);
        startActivity(finish);
        finish();*/
    }

    fun setQuestions(pos:Int){
        var questionObject = listofquestions!!?.get(pos);
        question.text = questionObject.question
        opt1.text = questionObject.opt1
        opt2.text = questionObject.opt2
        opt3.text = questionObject.opt3
        opt4.text = questionObject.opt4

    }



}

