package com.example.notessqlite

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge

import androidx.appcompat.app.AppCompatActivity

class GetStart : AppCompatActivity() {

    private lateinit var startBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_start)
        enableEdgeToEdge()

        startBtn = findViewById(R.id.getstartButton)

        startBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
