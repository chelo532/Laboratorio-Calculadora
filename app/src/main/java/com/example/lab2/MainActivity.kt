//Marcelo Calderon
//Perdona la demora, encontré el problema
//de la interfaz y está lista.

package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpen: Button = findViewById(R.id.btnOpen)

        btnOpen.setOnClickListener{
            Log.e("LOG", "OnClick")

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("valueA", "Valor desde actividad")

            startActivity(intent)

        }
    }
}