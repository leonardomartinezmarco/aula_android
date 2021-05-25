package br.leonardo.listadeexercicios01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class Exerc04 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exerc04)

        val spTipoEx4 = findViewById<Spinner>(R.id.spTipoEx4)
        val spSubTipoEx4 = findViewById<Spinner>(R.id.spSubTipoEx4)

        val tipo = arrayOf("Selecione", "Filme", "Música", "Livro", "Jogo")
        val adapter_tipo = ArrayAdapter(this, android.R.layout.simple_spinner_item, tipo)
        adapter_tipo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spTipoEx4.adapter = adapter_tipo

        val subTipoFilmes = arrayOf("Selecione", "Matrix", "The Mask", "Spider-Man")
        val adapter_subTipoFilmes = ArrayAdapter(this, android.R.layout.simple_spinner_item, subTipoFilmes)
        adapter_subTipoFilmes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        val subTipoMusicas = arrayOf("Selecione", "Canon Ball", "Fly to the moon", "Patience")
        val adapter_subTipoMusicas = ArrayAdapter(this, android.R.layout.simple_spinner_item, subTipoMusicas)
        adapter_subTipoMusicas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        val subTipoLivros = arrayOf("Selecione", "Metro 2033", "Admiravel mundo novo", "Invisible Man")
        val adapter_subTipoLivros = ArrayAdapter(this, android.R.layout.simple_spinner_item, subTipoLivros)
        adapter_subTipoLivros.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        val subTipoJogos = arrayOf("Selecione", "Sonic 3", "Crash Bandicoot", "MegaMan X4")
        val adapter_subTipoJogos = ArrayAdapter(this, android.R.layout.simple_spinner_item, subTipoJogos)
        adapter_subTipoJogos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spTipoEx4.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                if (spTipoEx4.selectedItemPosition == 0) {

                }

                if (spTipoEx4.selectedItemPosition == 1) {
                    spSubTipoEx4.adapter = adapter_subTipoFilmes
                }

                if (spTipoEx4.selectedItemPosition == 2) {
                    spSubTipoEx4.adapter = adapter_subTipoMusicas
                }

                if (spTipoEx4.selectedItemPosition == 3) {
                    spSubTipoEx4.adapter = adapter_subTipoLivros
                }

                if (spTipoEx4.selectedItemPosition == 4) {
                    spSubTipoEx4.adapter = adapter_subTipoJogos
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }
}