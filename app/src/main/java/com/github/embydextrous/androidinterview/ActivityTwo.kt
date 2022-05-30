package com.github.embydextrous.androidinterview

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi

class ActivityTwo : AppCompatActivity() {
    private lateinit var numActivitiesTv: TextView
    private lateinit var topActivityTv: TextView

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
        findViewById<Button>(R.id.btn1).setOnClickListener {
            startActivity(Intent(this, ActivityOne::class.java))
        }
        findViewById<Button>(R.id.btn2).setOnClickListener {
            startActivity(Intent(this, ActivityTwo::class.java))
        }
        findViewById<Button>(R.id.btn3).setOnClickListener {
            startActivity(Intent(this, ActivityThree::class.java))
        }
        findViewById<Button>(R.id.btn4).setOnClickListener {
            startActivity(Intent(this, ActivityFour::class.java))
        }
        numActivitiesTv = findViewById(R.id.tv1)
        topActivityTv = findViewById(R.id.tv2)
        activityInfo()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(applicationContext, "New Intent called", Toast.LENGTH_SHORT).show()
        activityInfo()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun activityInfo() {
        val mgr = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val tasks = mgr.appTasks
        if (tasks != null && tasks.isNotEmpty()) {
            val numActivities = tasks[0].taskInfo.numActivities
            val topActivityName = tasks[0].taskInfo.topActivity!!.className
            numActivitiesTv.text = "Num Activities : $numActivities"
            topActivityTv.text = "Top Activity : $topActivityName"
        }
    }
}