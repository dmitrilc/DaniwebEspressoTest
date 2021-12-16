package com.example.daniwebespressotest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText_plaintTextInput)
        val button = findViewById<Button>(R.id.button_submit)
        val finalText = findViewById<TextView>(R.id.textView_finalText)

        button.setOnClickListener {
            finalText.text = editText.text
        }
    }
}