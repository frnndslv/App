package com.hihi.testefime

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class tela_de_genero : AppCompatActivity() {
    lateinit var genero : TextView
    lateinit var bt_romantica : Button
    lateinit var bt_pop : Button
    lateinit var bt_funk : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_de_genero)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        inicializar_elementos()

        //fazer ele ao clicar mostrar filmes(do genero clicado)em uma outra tela
        bt_funk.setOnClickListener{
            val intent = Intent(
                this,
                Funk::class.java

            )
            startActivity(intent)
        }
        bt_pop.setOnClickListener{
            val intent = Intent(
                this,
                POP::class.java

                )
            startActivity(intent)
        }
        bt_romantica.setOnClickListener{
            val intent = Intent(
                this,
                Romantica::class.java


                )
            startActivity(intent)
        }

    }
    private fun inicializar_elementos(){

        bt_romantica = findViewById(R.id.bt_romantica)
        bt_funk = findViewById(R.id.bt_funk)
        bt_pop = findViewById(R.id.bt_pop)
    }


}