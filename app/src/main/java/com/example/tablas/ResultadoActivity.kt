package com.example.tablas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.airbnb.lottie.LottieAnimationView

class ResultadoActivity : AppCompatActivity() {
    lateinit var animationView: LottieAnimationView
    lateinit var btnRegresar:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        animationView = findViewById(R.id.animation_view)
        var extras = intent.extras
        val respuesta = extras?.getBoolean("respuesta")
        if(respuesta == true){
            animationView.setAnimation(R.raw.correct_notif)
        }else{
            animationView.setAnimation(R.raw.wrong_notif)
        }

        btnRegresar = findViewById(R.id.btnRegresar)
        btnRegresar.setOnClickListener {
            val viewPrac = Intent(this, PracticaActivity::class.java)
            startActivity(viewPrac)
        }
    }
}