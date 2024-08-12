package com.example.projeto2

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView

    //Arrayof determina os espaços do array começando em 0.
    val frases = arrayOf("Não limite os seus desafios. Desafie os seus limites.",
        "Se o plano não funcionar, mude o plano, não a meta.",
        "Uma meta é um sonho com um prazo.")


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        texto = findViewById(R.id.textoResultado)
    }

    fun sortear(view: View)
    {
        // espaço 0 / espaço 1 / espaço 2 -> 3 frases
        val vetor = frases.size
        val numeroAleatorio = Random.nextInt(vetor)

        texto.setText(frases[numeroAleatorio])
    }

}