package com.example.evaluacion_iot

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Nuevo_user : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuevo_user)

        val registerButton = findViewById<Button>(R.id.button3)

        registerButton.setOnClickListener {
            // Aquí iría la lógica para guardar el nuevo usuario en una base de datos
            Toast.makeText(this, "¡Usuario registrado con éxito!", Toast.LENGTH_SHORT).show()
        }
    }
}