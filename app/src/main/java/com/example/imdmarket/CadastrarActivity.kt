package com.example.imdmarket

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CadastrarActivity : AppCompatActivity() {

    lateinit var codigoProduto: EditText;
    lateinit var nomeProduto: EditText;
    lateinit var descProduto: EditText;
    lateinit var estoqueProduto: EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cadastrar)

        var btnSalvar = findViewById<Button>(R.id.btnSaveAlteracao);

        btnSalvar.setOnClickListener({
            if(isAllCamposValidos()) {
                irParaTelaDeMenu();
            }
            else{
                showInvalidFieldsToast();
            }
        })
    }

    private fun isAllCamposValidos(): Boolean{
        var codigoProdutoValido = isFieldValido(R.id.create_cod_produto_field);
        var nomeProdutoValido = isFieldValido(R.id.create_nome_prod_field);
        var descProdutoValido = isFieldValido(R.id.create_desc_prod_field);
        var estoqueProdutoValido = isFieldValido(R.id.create_estq_field);

        return  codigoProdutoValido && nomeProdutoValido
            &&  descProdutoValido && estoqueProdutoValido;
    }

    private fun showInvalidFieldsToast(){
        Toast.makeText(this, "Preencha os campos obrigatórios.", Toast.LENGTH_LONG).show();
    }

    private fun isFieldValido(idField: Int): Boolean{
        var field = findViewById<EditText>(idField);

        if(field.text.toString().isNotEmpty()){
            return true;
        }

        field.setError("Campo obrigatório")
        return false;
    }

    private fun irParaTelaDeMenu(){
        val telaMenu = Intent(this, MenuActivity::class.java);
        startActivity(telaMenu);
    }
}