package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras

        if (bundle != null){
            val valueA: String = bundle.getString("valueA", "")

            Toast.makeText(this, valueA, Toast.LENGTH_SHORT).show()

            val txtValue: TextView = findViewById(R.id.txtValue)
            txtValue.text = valueA
        }
    }
}