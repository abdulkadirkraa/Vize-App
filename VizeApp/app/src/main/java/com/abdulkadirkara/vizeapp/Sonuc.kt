package com.abdulkadirkara.vizeapp

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import kotlinx.coroutines.android.awaitFrame

class Sonuc : AppCompatActivity() {
    //@SuppressLint("WrongViewCast", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonuc)
        var txtcorba=findViewById<TextView>(R.id.textcorba)
        var textswitch=findViewById<TextView>(R.id.textswitch)
        var textekstralar=findViewById<TextView>(R.id.textekstralar)
        var btnyenisiparis=findViewById<Button>(R.id.btnyenisiparis)
        var imgbtncikis=findViewById<ImageButton>(R.id.imgbtncikis)
        val alianatuzorani=intent.getStringExtra("tuzun")
        val alinanaciorani=intent.getStringExtra("acin")
        val alinancorbanick=intent.getStringExtra("corbanick")
        val alinanekstralar=intent.getStringExtra("ekstralar")
        val alinanswitchler=intent.getStringExtra("switchler")
        txtcorba.text="Bir ${alinancorbanick.toString()} Çeeek,${alianatuzorani.toString()} ve ${alinanaciorani.toString()} Olsun"
        textswitch.text=alinanswitchler.toString()
        textekstralar.text=textekstralar.text.toString()+alinanekstralar

        object :CountDownTimer(4300,1000){
            override fun onTick(p0: Long) {
                if (btnyenisiparis.isVisible)
                    btnyenisiparis.visibility=View.INVISIBLE
                else
                    btnyenisiparis.visibility=View.VISIBLE
                Handler().postDelayed({},100)
            }

            override fun onFinish() {
                btnyenisiparis.visibility=View.VISIBLE
            }

        }.start()

        btnyenisiparis.setOnClickListener {
            val corbayadonus=Intent(applicationContext,Corbaci::class.java)
            startActivity(corbayadonus)
            finish()
        }
        imgbtncikis.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                val cikisuyari=AlertDialog.Builder(this@Sonuc)
                cikisuyari.setTitle("Çıkış")
                cikisuyari.setIcon(R.drawable.redexit)
                cikisuyari.setMessage("Çıkmak İstediğinize Emin Misiniz?")
                cikisuyari.setCancelable(false)
                cikisuyari.setPositiveButton("Evet"){DialogInterface,İ->
                  System.exit(0)
                }
                cikisuyari.setNegativeButton("Hayır"){DialogInterface,i->

                }
                cikisuyari.create().show()
            }

        })

    }
}