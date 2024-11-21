package com.example.imdmarket

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DeletarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deletar)

        var btnDeletar = findViewById<Button>(R.id.btnDeletarSave);

        btnDeletar.setOnClickListener({
            irParaTelaDeMenu();
        })
    }

    private fun irParaTelaDeMenu(){
        val telaMenu = Intent(this, MenuActivity::class.java);
        startActivity(telaMenu);
    }
}