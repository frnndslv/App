package com.hihi.testefime

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var textView5: TextView
    lateinit var bt_verMusicas: Button
    lateinit var reciclevilMusicas: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.pop)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        inicializar_elementos()



        bt_verMusicas.setOnClickListener{
            val intent = Intent(
                this,
                tela_de_genero::class.java

            )
            startActivity(intent)
        }


    }
    private fun inicializar_elementos(){

        textView = findViewById(R.id.textView)
        textView5 = findViewById(R.id.textView5)

        bt_verMusicas = findViewById(R.id.bt_verMusicas)
        reciclevilMusicas = findViewById(R.id.musicaro)

    }

}