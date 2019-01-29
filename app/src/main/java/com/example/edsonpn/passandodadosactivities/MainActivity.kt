package com.example.edsonpn.passandodadosactivities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button_passar_dados.setOnClickListener{

            val intent = Intent (applicationContext, SegundaActivity::class.java)
            intent.putExtra("nome", "Edson")
            intent.putExtra("idade", 25)
            startActivity(intent)
        }

    }
}
