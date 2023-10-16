package com.example.saludadorvicent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity()
{
    private lateinit var resultado:TextView
    private lateinit var nombre:String

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        initComponents()
        saludar()
    }

    private fun initComponents()
    {
        nombre = intent.extras?.getString("NOMBRE").orEmpty()
        resultado = findViewById(R.id.texto_resultado)
    }

    private fun saludar()
    {
        resultado.text = "Hola $nombre"
    }
}