 package com.example.edsonpn.passandodadosactivities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda.*

 class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val dados : Bundle = intent.extras
        val nome = dados.getString("nome")
        val idade = dados.getInt("idade")

        text_nome.text= nome
        text_idade.text=idade.toString()

    }
}
