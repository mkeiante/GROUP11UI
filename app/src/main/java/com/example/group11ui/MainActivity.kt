package com.example.group11ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button that opens DetailsActivity
        val btnDetailsBurnham = findViewById<Button>(R.id.btnDetailsBurnham)
        btnDetailsBurnham.setOnClickListener {
            val intent = Intent(this, DetailsBurnham::class.java)
            startActivity(intent)
        }

        // Button that opens MenuActivity
        val btnMenuActivity = findViewById<Button>(R.id.btnMenuActivity)
        btnMenuActivity.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}
