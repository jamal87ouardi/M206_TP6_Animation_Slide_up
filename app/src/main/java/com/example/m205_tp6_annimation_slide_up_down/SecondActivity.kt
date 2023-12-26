package com.example.m205_tp6_annimation_slide_up_down

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val backBtn = findViewById<Button>(R.id.button2)

        backBtn.setOnClickListener {


            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)

            overridePendingTransition(R.anim.slide_down, R.anim.slide_up)
        }
    }
}