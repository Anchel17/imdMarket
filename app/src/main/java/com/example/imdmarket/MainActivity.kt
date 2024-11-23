package com.example.imdmarket

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {

    lateinit var loginText: EditText;
    lateinit var passwordText: EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btn_entrar);
        btn.setOnClickListener({
            if(isLoginAndPasswordValid()) {
                irParaTelaDeMenu();
            }
            else{
                showLoginInvalidoToast();
            }
        })
    }

    private fun isLoginAndPasswordValid():Boolean{
        loginText = findViewById<EditText>(R.id.login_field);
        passwordText = findViewById<EditText>(R.id.password_field);

        return loginText.text.toString() =="admin" && passwordText.text.toString() == "admin";
    }

    private fun showLoginInvalidoToast(){
        Toast.makeText(this, "Login inválido!", Toast.LENGTH_LONG).show();
    }

    private fun irParaTelaDeMenu(){
        val telaMenu = Intent(this, MenuActivity::class.java);
        startActivity(telaMenu);
    }
}