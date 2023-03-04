package com.abdulkadirkara.vizeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.core.view.isVisible

class Giris : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_giris)
        var btnK=findViewById<Button>(R.id.btnK)
        var btnA=findViewById<Button>(R.id.btnA)
        var btnD=findViewById<Button>(R.id.btnD)
        var btnI=findViewById<Button>(R.id.btnI)
        var btnR=findViewById<Button>(R.id.btnR)
        var imageViewK=findViewById<ImageView>(R.id.imageViewK)
        var imageViewA=findViewById<ImageView>(R.id.imageViewA)
        var imageViewD=findViewById<ImageView>(R.id.imageViewD)
        var imageViewI=findViewById<ImageView>(R.id.imageViewI)
        var imageViewR=findViewById<ImageView>(R.id.imageViewR)
        var progressBar=findViewById<ProgressBar>(R.id.progressBar)

        btnK.setOnClickListener {
            imageViewK.visibility=View.VISIBLE
            btnA.setOnClickListener {
                imageViewA.visibility=View.VISIBLE
                btnD.setOnClickListener {
                    imageViewD.visibility=View.VISIBLE
                    btnI.setOnClickListener {
                        imageViewI.visibility=View.VISIBLE
                        btnR.setOnClickListener {
                            imageViewR.visibility=View.VISIBLE
                            progressBar.visibility=View.VISIBLE
                            Handler().postDelayed({
                                var corbaciyagecis=Intent(applicationContext,Corbaci::class.java)
                                startActivity(corbaciyagecis)
                                finish()
                            },2100)
                        }
                    }
                }
            }
        }

    }

}