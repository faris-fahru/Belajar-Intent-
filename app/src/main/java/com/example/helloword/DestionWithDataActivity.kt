package com.example.helloword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DestionWithDataActivity : AppCompatActivity() {

    private lateinit var tvWithData: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destion_with_data)

        tvWithData = findViewById(R.id.tv_with_data)

        val name = intent?.extras?.getString(EXTRA_DATA)

        tvWithData.text = getString(R.string.this_is_destination_activity_with_data_s, name)
    }

    companion object{
        const val EXTRA_DATA = "extra_data"
    }
}