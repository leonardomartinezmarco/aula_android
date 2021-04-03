package br.leonardo.listadeexercicios01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exerc07.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn01.setOnClickListener {
            val i = Intent(this, Exerc01::class.java)
            startActivity(i)
        }
        btn02.setOnClickListener {
            val i = Intent(this, Exerc02::class.java)
            startActivity(i)
        }
        btn03.setOnClickListener {
            val i = Intent(this, Exerc03::class.java)
            startActivity(i)
        }
        btn04.setOnClickListener {
            val i = Intent(this, Exerc04::class.java)
            startActivity(i)
        }
        btn05.setOnClickListener {
            val i = Intent(this, Exerc05::class.java)
            startActivity(i)
        }
        btn07.setOnClickListener {
            val i = Intent(this, Exerc07::class.java)
            startActivity(i)
        }
        btn08.setOnClickListener {
            val i = Intent(this, Exerc08::class.java)
            startActivity(i)
        }
    }
}