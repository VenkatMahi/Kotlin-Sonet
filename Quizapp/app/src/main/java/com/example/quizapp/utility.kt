package com.example.quizapp

class utility {
    fun get_question():ArrayList<quiz_question>{
        var list = ArrayList<quiz_question>()

        var que1 = quiz_question(1,"what is kotlin?","Scripting Language","Programming language","Modern Language","Assembly Language")
        var que2 = quiz_question(1,"what is Java?","Scripting Language","Programming language","Modern Language","Assembly Language")
        var que3 = quiz_question(1,"what is Python?","Scripting Language","Programming language","Modern Language","Assembly Language")
        var que4 = quiz_question(1,"what is C++?","Scripting Language","Programming language","Modern Language","Assembly Language")
        var que5 = quiz_question(1,"what is JavaScript?","Scripting Language","Programming language","Modern Language","Assembly Language")
        list.add(que1);
        list.add(que2);
        list.add(que3);
        list.add(que4);
        list.add(que5);

        return list;
    }

}