package com.example.myfirstproject_yacshin

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import javax.annotation.processing.Generated
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val textView_zero = findViewById<TextView>(R.id.textView_zero)
    val randomInt = Random.nextInt(6) + 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

            val button: Button = findViewById(R.id.button_player)
            button.setOnClickListener ({ view -> /* do something*/ })


        }
    }
}