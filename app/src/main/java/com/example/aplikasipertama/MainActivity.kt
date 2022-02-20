package com.example.aplikasipertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.*
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: EditText
    private lateinit var sayHelloButton: Button
    private lateinit var sayHelloTextView: TextView


    private fun initComponents(){
        nameEditText = findViewById(R.id.nameEditText)
        sayHelloButton = findViewById(R.id.sayhelloButtonText)
        sayHelloTextView = findViewById(R.id.sayHelloTextView)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        initComponents()

        sayHelloTextView.text = "Hi"

        sayHelloButton.setOnClickListener {

            Log.i("PZN","sayhellogButton")

            val name = nameEditText.text.toString()
            sayHelloTextView.text = "Hi $name"
        }

    }
}