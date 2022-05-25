package com.example.tablas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class PracticaActivity : AppCompatActivity() {
    lateinit var tvFactor1:TextView
    lateinit var tvFactor2:TextView
    lateinit var et_Respuesta1:EditText
    lateinit var btnComprobar1:Button
    var factor1:Int = 0
    var factor2:Int = 0
    var producto:Int = 0
    var respuestaCorrecta = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practica)
        initUi()

        btnComprobar1.setOnClickListener{
            val strRespuesta = et_Respuesta1.text.toString()
            if(strRespuesta.equals("")){
                Toast.makeText(this,"Dejaste el campo vacio",Toast.LENGTH_LONG).show()
            }else if(strRespuesta.toInt()>10){
                Toast.makeText(this,"Dejaste el campo vacio",Toast.LENGTH_LONG).show()
            }
            else{
                respuestaCorrecta = producto ==strRespuesta.toInt()
                //generaMultiplicacion()
                val mostrarResultado = Intent(this,ResultadoActivity::class.java)
                mostrarResultado.putExtra("respuesta",respuestaCorrecta)
                startActivity(mostrarResultado)
            }
            }
        }
    }

    fun initUi(){
        tvFactor1 = findViewById(R.id.tvFactor1)
        tvFactor2 = findViewById(R.id.tvFactor2)
        et_Respuesta1 = findViewById(R.id.et_Respuesta1)
        btnComprobar1 = findViewById(R.id.btnComprobar1)
        generaMultiplicacion()

    }
    fun generaMultiplicacion(){
        factor1 = Random.nextInt(0,10)
        factor2 = Random.nextInt(0,10)
        producto = factor1 * factor2
        tvFactor1.text = "$factor1"
        tvFactor2.text = "$factor2"
        et_Respuesta1.text.clear()
    }
}