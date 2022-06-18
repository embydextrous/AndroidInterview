package com.github.embydextrous.androidinterview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class JankActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jank)
        findViewById<Button>(R.id.btn1).setOnClickListener {
            findViewById<JankButton>(R.id.btn2).visibility = View.VISIBLE
        }
    }
}