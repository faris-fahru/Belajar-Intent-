package com.example.helloword

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    private lateinit var btnMove: Button
    private lateinit var btnMoveWithData: Button
    private lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMove = findViewById(R.id.btn_move)
        btnMoveWithData = findViewById(R.id.btn_move_with_data)
        btnSend = findViewById(R.id.btn_send)

        btnMove.setOnClickListener {
            val intent = Intent(this, DestinationActivity::class.java)
            startActivity(intent)
        }

        btnMoveWithData.setOnClickListener {
            val intent = Intent(this, DestionWithDataActivity::class.java)
            intent.putExtra(DestionWithDataActivity.EXTRA_DATA, getString(R.string.name))
            startActivity(intent)
        }

        btnSend.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "085777777", null))
            startActivity(intent)
        }

    }
}