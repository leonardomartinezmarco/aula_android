package br.leonardo.listadeexercicios01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exerc01.*

class Exerc01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exerc01)

        btnEnviar.setOnClickListener {
            var texto = ""
            val msg = getString(R.string.msg)
            val nome = getString(R.string.nome)
            val telefone = getString(R.string.telefone)
            val tipo_contato = getString(R.string.tipo_contato)
            val email = getString(R.string.e_mail)
            val app = getString(R.string.app)

            texto = """ $nome: ${editName.text}
            |
            |$telefone: ${etTel.text}
            |
            |$email: ${editMail.text}
            |
            |$tipo_contato: ${editAPp.text}
            """.trimMargin("|")

            if(rbTelefone.isChecked) {
                texto += "\n $app: "  + getString(R.string.telefone)
            }

            if(rbEmail.isChecked) {
                texto += "\n $app: "  + getString(R.string.e_mail)
            }

            alert(msg, texto, this)
        }
    }
}