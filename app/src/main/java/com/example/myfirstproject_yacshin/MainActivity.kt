package com.example.yacshin.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView_result)
        val button = findViewById<Button>(R.id.button_roll)

        button.setOnClickListener {
            val number = Random.nextInt(1, 7)
            textView.text = "$number"
        }
    }
}