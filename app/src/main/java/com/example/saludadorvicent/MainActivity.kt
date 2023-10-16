package com.example.saludadorvicent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity()
{
    private lateinit var input:com.google.android.material.textfield.TextInputEditText
    private lateinit var boton:Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
        initListeners()
    }

    private fun initComponents()
    {
        input = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.caja_texto)
        boton = findViewById<Button>(R.id.boton)
    }

    private fun initListeners()
    {
        boton.setOnClickListener()
        {
            if(input.toString().isNotEmpty())
            {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("NOMBRE", input.text.toString())
                startActivity(intent)
            }
        }
    }
}