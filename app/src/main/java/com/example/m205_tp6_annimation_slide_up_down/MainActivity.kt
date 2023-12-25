package com.example.m205_tp6_annimation_slide_up_down

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {


            val intent = Intent(this, SecondActivity::class.java)

            startActivity(intent)

            overridePendingTransition(R.anim.slide_up, R.anim.slide_up)
        }

    }
}