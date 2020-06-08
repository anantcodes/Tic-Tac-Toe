package com.anant.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnSingle:Button
    lateinit var btnMulti:Button
    lateinit var btnExit:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSingle=findViewById(R.id.btnSingle)
        btnMulti=findViewById(R.id.btnMulti)
        btnExit=findViewById(R.id.btnExit)

        btnMulti.setOnClickListener {
            startActivity(Intent(this, MultiActivity::class.java))
        }
        btnSingle.setOnClickListener {
            startActivity(Intent(this, SingleActivity::class.java))
        }
            btnExit.setOnClickListener {
                finish()
            }

        }
    }


