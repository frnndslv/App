package com.hihi.testefime

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var gudinhoFilmes : TextView
    lateinit var bt_verfimes : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        inicializar_elementos()

        bt_verfimes.setOnClickListener{
            val intent = Intent(
                this,
                tela_de_genero::class.java

            )
            startActivity(intent)
        }


    }
    private fun inicializar_elementos(){

        bt_verfimes = findViewById(R.id.bt_verfimes)

    }

}