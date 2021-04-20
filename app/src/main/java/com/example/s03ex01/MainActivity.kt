package com.example.s03ex01

import java.util.Random
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var alea: Int

        val random = Random()
        fun rand(from: Int, to: Int) : Int { return random.nextInt(to - from) + from }

        //aleatoirenum.text = alea.toString()
        buttoncheck.setOnClickListener {
            alea = rand(1,50)
            var tent: Int = 0
            val  imp = aleatoirenumedit.text.toString().trim()
            if (imp == ""){
                Toast.makeText(this,"entrer un nombre",Toast.LENGTH_LONG).show()
            }
            else{
                if (tent > 3){
                    Toast.makeText(this,"C'est Trop",Toast.LENGTH_LONG).show()
                }
                if ((tent < 3) and (alea == imp.toInt())){
                    aleatoirenum.text = "congrats"
                }
                if ((tent < 3) and (alea != imp.toInt())){
                    aleatoirenum.text = ":'("
                    aleatoirenum.text = tent.toString()

                }
            }
            tent++

        }

    }
}
