package com.example.evaluacion_iot

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION") // Handler() is deprecated, but fine for this simple use case
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Cierra la Splash Screen para que el usuario no pueda volver a ella
        }, 2000) // 2000 milisegundos = 2 segundos
    }
}