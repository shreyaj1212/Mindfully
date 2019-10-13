package com.example.mindfullypractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user_name = findViewById<EditText>(R.id.askFullName)
        val next_button = findViewById<Button>(R.id.nameButton)



    }
}
