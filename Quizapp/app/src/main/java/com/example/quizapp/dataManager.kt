package com.example.quizapp

class dataManager {
    var courses = HashMap<String,courseInfo>()
    var notes = ArrayList<noteInfo>()

    init {
        initCourse()
    }
    private fun initCourse(){
        var course = courseInfo("sonet@1","andriod_development",)
        courses.put(course.courseId,course)
    }
}