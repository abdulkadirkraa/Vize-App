package com.abdulkadirkara.vizeapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.util.DisplayMetrics
import android.util.TypedValue
import android.view.Display
import android.widget.TextView
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var giris=findViewById<TextView>(R.id.giris)

        var textSize = 30f

        object :CountDownTimer(1000,10){
            override fun onTick(p0: Long) {

            giris.textSize = textSize
            textSize++

            }
            override fun onFinish() {
                var girisegecis=Intent(applicationContext,Giris::class.java)
                startActivity(girisegecis)
                finish()
            }
        }.start()
    }
}