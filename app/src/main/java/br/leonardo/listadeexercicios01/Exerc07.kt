package br.leonardo.listadeexercicios01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exerc07.*

class Exerc07 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exerc07)

        btnAbrirActivity.setOnClickListener {
            if (etvalue1.text.isNotEmpty()) {
                val intentDetalhe = Intent( this, Exerc07_detalhe::class.java)
                intentDetalhe.putExtra( "msg", etvalue1.text.toString())
                startActivity( intentDetalhe )
            } else {
                alert("Erro", "Preencha os campos!", this)
            }
        }
    }
}