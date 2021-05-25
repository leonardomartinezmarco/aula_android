package br.leonardo.listadeexercicios01

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_exerc08.*


class Exerc08 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exerc08)


        btnURL.setOnClickListener {
            etURL.setText( "https://sp.senac.br/")
        }

        btnExemploURL.setOnClickListener {
            if (etURL.text.isNotEmpty()) {
                val url = etURL.text.toString()
                val intentUrl = Intent( Intent.ACTION_VIEW, Uri.parse(url))
                startActivity( intentUrl )
            }
        }
    }
}