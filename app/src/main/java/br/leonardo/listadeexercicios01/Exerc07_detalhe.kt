package br.leonardo.listadeexercicios01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exerc07_detalhe.*

class Exerc07_detalhe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exerc07_detalhe)

        val msg = intent.getStringExtra( "msg")

        tvDetalhe.text = "Dados da activity Exerc07: $msg"

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}