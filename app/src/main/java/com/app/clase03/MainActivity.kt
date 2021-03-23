package com.app.clase03

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buyButton  = findViewById<Button>(R.id.buyButton)
        buyButton.setOnClickListener {
            val duration  = 20
            Toast.makeText(this,"Gracias por tu compra",Toast.LENGTH_LONG).show()
        }
    }


}