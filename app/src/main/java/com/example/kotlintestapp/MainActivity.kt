package com.example.kotlintestapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<TextView>(R.id.edit_text)
        val textView = findViewById<TextView>(R.id.list_text)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            textView.text = "Your name is " + editText.text
        }

        val buttonObject = findViewById<Button>(R.id.button_object)
        buttonObject.setOnClickListener {
            val name: String = editText.text.toString()
            val newUser = admin.copy(name)
            textView.text = "Added new user - " + newUser.name
            Admin.addUser(newUser)
        }

        val buttonUserList = findViewById<Button>(R.id.button_userlist)
        buttonUserList.setOnClickListener {
            textView.text = Admin.getUserList().toString()
            println(Admin.getUserList())
        }



    }
}