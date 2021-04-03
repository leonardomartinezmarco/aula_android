package br.leonardo.listadeexercicios01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_exerc03.*

class Exerc03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exerc03)

        val itens = arrayListOf("Selecione", "Pessoal", "Profissional", "Outro")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, itens)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerPessoal.adapter = adapter

        val itens2 = arrayListOf("Selecione", "WhatsApp", "Telegram", "Signal", "Discord", "Skype")
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, itens2)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerProfissional.adapter = adapter2

        buttonSalvar.setOnClickListener {
            if (editNome.text.isNotEmpty() && editEmail.text.isNotEmpty() && editApp.text.isNotEmpty() && spinnerPessoal.selectedItemPosition != 0 && spinnerProfissional.selectedItemPosition != 0) {
                val msg = """Nome: ${editNome.text}
                    |E-mail: ${editEmail.text}
                    |App de mensagens: ${editApp.text}
                    |
                    |Tipo de E-mail: ${spinnerPessoal.selectedItem}
                    |Aplicativos de mensagens: ${spinnerProfissional.selectedItem}
                    
                    """.trimMargin()

                alert("Registro Concluído", msg, this)
            } else {
                alert("Registro Incompleto", "Há campos vazios", this)
            }
        }
    }
}