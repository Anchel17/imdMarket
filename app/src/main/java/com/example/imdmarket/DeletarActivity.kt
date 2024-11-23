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

class DeletarActivity : AppCompatActivity() {
    lateinit var codigoProduto: EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deletar)

        var btnDeletar = findViewById<Button>(R.id.btnDeletarSave);

        btnDeletar.setOnClickListener({
            if(isCodigoProdutoValido()) {
                irParaTelaDeMenu();
            }
            else{
                showInvalidFieldsToast();
            }
        })
    }

    private fun isCodigoProdutoValido(): Boolean{
        var field = findViewById<EditText>(R.id.delete_cod_produto_field);

        if(field.text.toString().isNotEmpty()){
            return true;
        }

        field.setError("Campo obrigatório")
        return false;
    }

    private fun showInvalidFieldsToast(){
        Toast.makeText(this, "Preencha os campos obrigatórios.", Toast.LENGTH_LONG).show();
    }

    private fun irParaTelaDeMenu(){
        val telaMenu = Intent(this, MenuActivity::class.java);
        startActivity(telaMenu);
    }
}