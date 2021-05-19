package com.example.kotlintestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.kotlintestapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text_view)
        textView.setOnClickListener {
            textView.setText("Text changed!")
        }

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            textView.setText("Text changed with button!")
        }


    }
}