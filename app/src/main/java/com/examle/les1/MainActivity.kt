package com.examle.les1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClickMe = findViewById<Button>(R.id.btn_clickme)
        val txtHello:TextView = findViewById(R.id.txt_hello)
        val buttonRight = findViewById<Button>(R.id.btn_second)
        txtHello.text = getString(R.string.Test)

        buttonClickMe.setOnClickListener{
            txtHello.text = getString(R.string.you_clicked_me)
        }
        buttonRight.setOnClickListener{
            txtHello.text = "Hey, i am Taysir"

        }
    }


}