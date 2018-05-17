package br.com.yuukwn.pizzafeliz

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalhe_pedido.*

class DetalhePedidoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_pedido)
        //Recebendo o pedido enviado pela tela anterior
        val pedido = intent.getParcelableExtra<Pedido>("pedido")
        nome.text = pedido.nomeCliente
        for(aux in pedido.sabores) {
            sabor.setText("${sabor.text}${aux}")
        }
        tamanho.text = pedido.tamanho
        tipo.text = pedido.tipoPagamento
        //sabor.text = pedido.sabores.toString()

    }
}


