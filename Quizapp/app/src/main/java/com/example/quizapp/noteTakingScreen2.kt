package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class noteTakingScreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_taking_screen2)

        var dm = dataManager()
        var adaptCourse = ArrayAdapter<courseInfo>(this,android.R.layout.simple_spinner_item,dm.courses.values.toList())
        adaptCourse.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        var spinner = findViewById<Spinner>(R.id.spinner_courses)
        spinner.adapter = adaptCourse
    }
}