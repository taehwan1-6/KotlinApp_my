package com.oz10.lionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.net.Uri


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend.setOnClickListener {
            tvHello.text = etMsg.text.toString()
            etMsg.setText("")
        }

        btnCall.setOnClickListener {
            val intent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1111-2222"))
            startActivity(intent)
        }

        btnHome.setOnClickListener {
            val intent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kakaocorp.com"))
            startActivity(intent)
        }


    }
}