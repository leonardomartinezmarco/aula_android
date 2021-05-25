package br.leonardo.listadeexercicios01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exerc02.*

class Exerc02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exerc02)

        cbTelefone.setOnCheckedChangeListener { buttonView, isChecked ->
            cbTelefone.isEnabled = cbTelefone.isChecked
        }

        cbEmail.setOnCheckedChangeListener { _, _ ->
            cbEmail.isEnabled = cbEmail.isChecked
        }

        cbApp.setOnCheckedChangeListener { _, _ ->
            cbApp.isEnabled = cbApp.isChecked
        }

        btnEnviar.setOnClickListener {

            var ExibirMsg = true

            var telefone = ""

            if (etTel.text.isEmpty() && cbTelefone.isChecked ) {
                alert("Erro", "Telefone não foi preenchido!", this)
                ExibirMsg = false
            } else {
                if (cbTelefone.isChecked) {
                    telefone = "\n" + "Telefone: " + etTel.text.toString()
                }
            }

            var email = ""

            if (editMail.text.isEmpty() && cbEmail.isChecked) {
                alert("Erro", "E-mail não foi preenchido!", this)
                ExibirMsg = false
            } else {
                if (cbEmail.isChecked) {
                    email = "\nE-mail: ${editMail.text}"
                }
            }

            var app = ""

            if (editAPp.text.isEmpty() && cbApp.isChecked) {
                alert("Erro", "Aplicativo não foi preenchido!", this)
                ExibirMsg = false
            } else {
                if (cbApp.isChecked) {
                    app = "\nFacebook: ${editAPp.text}"
                }
            }

            var texto = telefone + email + app

            if (ExibirMsg) {
                if (texto.trim().isNotEmpty()) {
                    alert("Seus dados", texto, this)
                }

                if ( texto.trim().isEmpty()) {
                    alert("Erro", "Sem dados para exibir", this)
                }
            }
        }
    }
}