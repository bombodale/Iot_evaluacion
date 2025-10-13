package com.example.evaluacion_iot

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loggin)

        val loginButton = findViewById<Button>(R.id.button)
        val forgotPasswordLink = findViewById<TextView>(R.id.forgotPasswordLink)

        loginButton.setOnClickListener {
            // Aquí iría la lógica para validar el usuario y la contraseña
            Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show()
        }

        forgotPasswordLink.setOnClickListener {
            Toast.makeText(this, "Abriendo recuperación de contraseña...", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}