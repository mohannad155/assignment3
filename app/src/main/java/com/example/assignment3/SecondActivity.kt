package com.example.assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)
        val text: TextView = findViewById(R.id.result)
        val Bundle: Bundle? = intent.extras
        Bundle?.let{
            val msg = Bundle.getString("key")
            text.text = msg.toString()
        }
    }
}