package com.github.embydextrous.androidinterview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn1).setOnClickListener {
            startActivity(Intent(this, ActivityOne::class.java))
        }

        findViewById<Button>(R.id.btn2).setOnClickListener {
            startActivity(Intent(this, JankActivity::class.java))
        }
    }
}
