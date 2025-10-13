package com.example.evaluacion_iot

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.logg)
        val registerButton = findViewById<Button>(R.id.button2)

        loginButton.setOnClickListener {
            Toast.makeText(this, "Redirigiendo a la pantalla de login...", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        registerButton.setOnClickListener {
            Toast.makeText(this, "Abriendo la pantalla de registro...", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Nuevo_user::class.java)
            startActivity(intent)
        }
    }
}