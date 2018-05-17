package br.com.yuukwn.pizzafeliz

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun logar(view: View){
        //Pegar os valores das EditText
        val login = etLogin.text.toString()
        val senha = etSenha.text.toString()


//Verificação do login e senha
        if(login =="FIAP" && senha =="123") {
            //proxtela
            val intent = Intent(this, PedidoActivity::class.java)
            //passar os valores paraa a outra activty
            intent.putExtra("usuario", login)
            //Iniciar a proxtela
            startActivity(intent)
            finish()
        }else{
            Toast.makeText(this, "Usuário ou senha inválidos",
                    Toast.LENGTH_SHORT).show()
        }
        }
    }



