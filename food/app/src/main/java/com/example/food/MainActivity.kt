package com.example.food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var temp = findViewById<EditText>(R.id.temp)
        var dsr = findViewById<EditText>(R.id.dsr)
        var food = findViewById<TextView>(R.id.fishfood)
        var clean = findViewById<TextView>(R.id.clean)
        var btn = findViewById<Button>(R.id.button)
        var day : String = randomday()
        var fishfood :String= ""


        fun clearornot():Boolean{
            var a = dsr.text.toString().toInt()
            var b = temp.text.toString().toInt()
            if(a>30 || b>30 || day == "Sunday"){
                return true
            }
            else{
                return false
            }
        }

        fun findfood(){
            when(day){
                "Monday"-> food.text =  "today is monday,fish food is falkes"
                "Tuesday"-> food.text = "today is tuesday,fish food is pellets"
                "Wednesday"-> food.text ="today is wednesday,fish food is redworms"
                "thursday"-> food.text ="today is thursday,fish food is granules"
                "Friday"-> food.text ="today is friday,fish food is mosquitos"
                "Saturaday"->food.text ="today is saturaday,fish food is lettuce"
                "Sunday"-> food.text ="today is sunday,fish food is plantkon"
            }
        }



        btn.setOnClickListener(View.OnClickListener {
             if(clearornot()){
               clean.text = "Need to change water"
             }
            else{
                clean.text = "no need to change water"
             }
            findfood()


        })
    }
}
fun randomday():String{
    var n:Int = Random.nextInt(7)

    return arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturaday","Sunday")[n]
}



