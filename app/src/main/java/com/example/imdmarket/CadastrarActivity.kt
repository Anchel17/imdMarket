package com.example.imdmarket

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CadastrarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cadastrar)

        var btnSalvar = findViewById<Button>(R.id.btnSaveAlteracao);

        btnSalvar.setOnClickListener({
            irParaTelaDeMenu();
        })
    }

    private fun irParaTelaDeMenu(){
        val telaMenu = Intent(this, MenuActivity::class.java);
        startActivity(telaMenu);
    }
}