package br.leonardo.listadeexercicios01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exerc05.*

class Exerc05 : AppCompatActivity() {
    var valor1: Double = 0.0
    var valor2: Double = 0.0
    var check: Int = 0
    var operacao: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exerc05)

        addClickBotoesNumeros()
        addClickBotoesOperacoes()

        // Apagar
        btnApagarEx6.setOnClickListener {
            etNumerosEx.setText("")
            valor1 = 0.0
            valor2 = 0.0
            check = 0
            operacao = 0
            etNumerosEx.setText("")
        }

        //Igual
        btnIgualEx6.setOnClickListener {
            var result: Double = 0.0

            //Somar
            if(operacao == 0) {
                result = valor1 + valor2
            }

            //Subtrair
            if(operacao == 1) {
                result = valor1 - valor2
            }

            //Multiplicar
            if(operacao == 2) {
                result = valor1 * valor2
            }

            // Dividir
            if(operacao == 3) {
                result = valor1 / valor2
            }
            txtResultado.setText(etNumerosEx.text.toString() + " = " + result.toString())
        }
    }

    private fun addValor( valor: String ) {
        if (check == 0) {
            valor1 = valor.toDouble()
            etNumerosEx.setText( valor.toString())
            check = 1
        } else {
            valor2 = valor.toDouble()
            check = 0
            etNumerosEx.setText( etNumerosEx.text.toString() + " " + valor.toString())
        }

    }

    private fun addOperacao(op: Int, operacaoSimbolo: String) {
        operacao = op
        etNumerosEx.setText( etNumerosEx.text.toString() + " $operacaoSimbolo")
    }

    private fun addClickBotoesNumeros() {
        btn0Ex6.setOnClickListener {
            addValor("0")
        }

        btn1Ex6.setOnClickListener {
            addValor("1")
        }

        btn2Ex6.setOnClickListener {
            addValor("2")
        }

        btn3Ex6.setOnClickListener {
            addValor("3")
        }

        btn4Ex6.setOnClickListener {
            addValor("4")
        }

        btn5Ex6.setOnClickListener {
            addValor("5")
        }

        btn6Ex6.setOnClickListener {
            addValor("6")
        }

        btn7Ex6.setOnClickListener {
            addValor("7")
        }

        btn8Ex6.setOnClickListener {
            addValor("8")
        }

        btn9Ex6.setOnClickListener {
            addValor("9")
        }
    }

    private fun addClickBotoesOperacoes() {
        btnSomarEx6.setOnClickListener {
            addOperacao( 0, "+")
        }

        btnSubtrairEx6.setOnClickListener {
            addOperacao( 1, "-")
        }

        btnMultiplicarEx6.setOnClickListener {
            addOperacao( 2, "x")
        }

        btnDividirEx6.setOnClickListener {
            addOperacao( 3, "÷")
        }
    }
}