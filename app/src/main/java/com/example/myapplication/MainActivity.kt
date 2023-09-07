package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chamarTela=findViewById<Button>(R.id.btEntrar)

        chamarTela.setOnClickListener(){
            irParaTela()
        }
    }

    private fun irParaTela() {
        val chamarTela=Intent (this,MainActivity2::class.java)
        startActivity(chamarTela)
    }
}