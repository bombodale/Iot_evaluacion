package com.example.evaluacion_iot

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)


        val forgotpassButton = findViewById<Button>(R.id.sendRecoveryButton)

        forgotpassButton.setOnClickListener {
            Toast.makeText(this, "Se le envio un correo", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Nuevo_user::class.java)
            startActivity(intent)
        }


    }
}


