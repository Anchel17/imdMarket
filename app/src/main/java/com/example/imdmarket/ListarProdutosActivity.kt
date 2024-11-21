package com.example.imdmarket

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListarProdutosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar_produtos)

        val voltarBtn = findViewById<Button>(R.id.voltarBtn);

        voltarBtn.setOnClickListener({
            irParaTelaDeMenu();
        })
    }

    private fun irParaTelaDeMenu(){
        val telaMenu = Intent(this, MenuActivity::class.java);
        startActivity(telaMenu);
    }
}