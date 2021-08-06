package com.example.quizapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class quiz_activity : AppCompatActivity() {

    private var listofquestions:ArrayList<quiz_question>? = null
    var currentPosition:Int = -1;
    lateinit var question: TextView
    lateinit var opt1: TextView
    lateinit var opt2: TextView
    lateinit var opt3: TextView
    lateinit var opt4: TextView
    var select_option = 0;
    var Score = 0;
    var Name:String = "";

    var answers = arrayOf(5,3,1,2,1,2)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        var Utility:utility = utility()

        listofquestions = Utility.get_question()

        var name: String? = intent.getStringExtra("name");
        var q_name = findViewById<TextView>(R.id.name);
        Name = name.toString()
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
            checkAnswer()
            if(currentPosition < 4) {
                currentPosition = currentPosition + 1;
                setQuestions(currentPosition)
                defualtBorder()
            }
            else{
                nextPage()
            }

        })


        opt1.setOnClickListener(View.OnClickListener {
            defualtBorder()
            opt1.setBackgroundResource(R.drawable.selected_colour)
            select_option = 1

        })

        opt2.setOnClickListener(View.OnClickListener {
            defualtBorder()
            select_option = 2
            opt2.setBackgroundResource(R.drawable.selected_colour)

        })

        opt3.setOnClickListener(View.OnClickListener {
            defualtBorder()
            select_option = 3
            opt3.setBackgroundResource(R.drawable.selected_colour)

        })

        opt4.setOnClickListener(View.OnClickListener {
            defualtBorder()
            select_option = 4
            opt4.setBackgroundResource(R.drawable.selected_colour)

        })


        pre.setOnClickListener(View.OnClickListener {
            checkAnswer()
        })


        submit.setOnClickListener(View.OnClickListener {
            if(currentPosition<4){
                checkAnswer()
                nextPage()
            }
            else{
                nextPage();
            }

        })


    }

    private fun checkAnswer() {
        if(answers[currentPosition+1] == select_option){
            Score += 1
            when(select_option){
                1->opt1.setBackgroundColor(Color.parseColor("#008000"))
                2->opt2.setBackgroundColor(Color.parseColor("#008000"))
                3->opt3.setBackgroundColor(Color.parseColor("#008000"))
                4->opt4.setBackgroundColor(Color.parseColor("#008000"))
            }
        }
        else{
            when(select_option){
                1-> {
                    opt1.setBackgroundColor(Color.parseColor("#FF0000"))
                    greencolor(answers[currentPosition+1])

                }
                2->{
                    opt2.setBackgroundColor(Color.parseColor("#FF0000"))
                    greencolor(answers[currentPosition+1])
                }
                3->{
                    opt3.setBackgroundColor(Color.parseColor("#FF0000"))
                    greencolor(answers[currentPosition+1])
                }
                4->{
                    opt4.setBackgroundColor(Color.parseColor("#FF0000"))
                    greencolor(answers[currentPosition+1])
                }
            }

        }
    }

    fun defualtBorder(){
        opt1.setBackgroundResource(R.drawable.default_option_border);
        opt2.setBackgroundResource(R.drawable.default_option_border);
        opt3.setBackgroundResource(R.drawable.default_option_border);
        opt4.setBackgroundResource(R.drawable.default_option_border);

    }

    fun nextPage(){
        var finish:Intent = Intent(this,finalpage()::class.java);
        finish.putExtra("name_",Name)
        finish.putExtra("score",Score.toString())
        startActivity(finish);
        finish();
    }
    fun greencolor(pos:Int){
        when(pos){
            1->opt1.setBackgroundColor(Color.parseColor("#008000"))
            2->opt2.setBackgroundColor(Color.parseColor("#008000"))
            3->opt3.setBackgroundColor(Color.parseColor("#008000"))
            4->opt4.setBackgroundColor(Color.parseColor("#008000"))
        }
    }

    public fun setQuestions(pos:Int){
        var questionObject = listofquestions!!?.get(pos);
        question.text = questionObject.question
        opt1.text = questionObject.opt1
        opt2.text = questionObject.opt2
        opt3.text = questionObject.opt3
        opt4.text = questionObject.opt4

    }



}