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

        Toast.makeText(this,"onCreate", Toast.LENGTH_SHORT).show()

        val btnOpen: Button = findViewById(R.id.btnOpen)

        btnOpen.setOnClickListener{
            Log.e("LOG", "OnClick")

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("valueA", "Valor desde actividad1")

            startActivity(intent)

        }
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this,"onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume(){
        super.onResume()

        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(this,"onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(this,"onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this,"onDestroy", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()

        Toast.makeText(this,"onRestart", Toast.LENGTH_SHORT).show()
    }
}