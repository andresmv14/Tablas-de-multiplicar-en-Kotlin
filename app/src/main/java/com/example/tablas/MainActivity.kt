package com.example.tablas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnPractica:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPractica = findViewById(R.id.btnPracticar)

        btnPractica.setOnClickListener{
            val intentPractica = Intent(this,PracticaActivity::class.java)
            startActivity(intentPractica)
        }
    }
}