package com.example.ngit

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        var online_classes = findViewById<ImageView>(R.id.onlcl)
        var placements = findViewById<ImageView>(R.id.placeme)
        var loacte = findViewById<ImageView>(R.id.location)
        var about_us = findViewById<ImageView>(R.id.cllg)
        var oc = findViewById<TextView>(R.id.oc)
        var p = findViewById<TextView>(R.id.p)
        var l = findViewById<TextView>(R.id.lu)
        var au = findViewById<TextView>(R.id.abc)

        online_classes.setOnClickListener(View.OnClickListener {
            var next = Intent(this,Course()::class.java)
            startActivity(next)
        })
        oc.setOnClickListener(View.OnClickListener {
            var next = Intent(this,Course()::class.java)
            startActivity(next)
        })
        placements.setOnClickListener(View.OnClickListener {
            var uri = Uri.parse("http://www.ngit.ac.in/placementsrecord.php")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)

        })
        p.setOnClickListener(View.OnClickListener {
            var uri = Uri.parse("http://www.ngit.ac.in/placementsrecord.php")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        })
        about_us.setOnClickListener(View.OnClickListener {
            var uri = Uri.parse("http://www.ngit.ac.in/index.php")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        })
        au.setOnClickListener(View.OnClickListener {
            var uri = Uri.parse("http://www.ngit.ac.in/index.php")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        })
        loacte.setOnClickListener(View.OnClickListener {
            var uri = Uri.parse("https://www.google.com/maps/place/Neil+Gogte+Institute+of+Technology/@17.3955293,78.6219629,15z/data=!4m5!3m4!1s0x0:0x805544efd4bd55f!8m2!3d17.3955293!4d78.6219629")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        })
        l.setOnClickListener(View.OnClickListener {
            var uri = Uri.parse("https://www.google.com/maps/place/Neil+Gogte+Institute+of+Technology/@17.3955293,78.6219629,15z/data=!4m5!3m4!1s0x0:0x805544efd4bd55f!8m2!3d17.3955293!4d78.6219629")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        })


    }
}