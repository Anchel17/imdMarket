package com.example.imdmarket

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AlterarActivity : AppCompatActivity() {

    lateinit var codigoProduto: EditText;
    lateinit var nomeProduto: EditText;
    lateinit var descProduto: EditText;
    lateinit var estoqueProduto: EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alterar)

        var btnSaveAlterar = findViewById<Button>(R.id.btnSaveAlteracao);

        btnSaveAlterar.setOnClickListener({
            if(isAllCamposValidos()) {
                irParaTelaDeMenu();
            }
            else{
                showInvalidFieldsToast();
            }
        })
    }

    private fun isAllCamposValidos(): Boolean{
        var codigoProdutoValido = isFieldValido(R.id.update_cod_produto_field);

        return codigoProdutoValido;
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