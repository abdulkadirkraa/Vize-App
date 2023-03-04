package com.abdulkadirkara.vizeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import org.w3c.dom.Text

class Corbaci : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_corbaci)
        var radioezogelin=findViewById<RadioButton>(R.id.radioezogelin)
        var radiodugun=findViewById<RadioButton>(R.id.radiodugun)
        var radiomercimek=findViewById<RadioButton>(R.id.radiomercimek)
        var radiobrokoli=findViewById<RadioButton>(R.id.radiobrokoli)
        var radiokellepaca=findViewById<RadioButton>(R.id.radiokelle)
        var radioyayla=findViewById<RadioButton>(R.id.radioyayla)
        var radiosehriye=findViewById<RadioButton>(R.id.radiosehriye)
        var radiodomates=findViewById<RadioButton>(R.id.radiodomates)
        var radiomantar=findViewById<RadioButton>(R.id.radiomantar)
        var radioiskembe=findViewById<RadioButton>(R.id.radioiskembe)
        var radiotarhana=findViewById<RadioButton>(R.id.radioTarhana)
        var radiotavuk=findViewById<RadioButton>(R.id.radiotavuk)
        var checkcorba=findViewById<CheckBox>(R.id.checkcorba)
        var btndevam=findViewById<Button>(R.id.btndevam)

        checkcorba.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                radioezogelin.visibility=View.VISIBLE
                radiodugun.visibility=View.VISIBLE
                radiomercimek.visibility=View.VISIBLE
                radiobrokoli.visibility=View.VISIBLE
                radiokellepaca.visibility=View.VISIBLE
                radioyayla.visibility=View.VISIBLE
                radiosehriye.visibility=View.VISIBLE
                radiodomates.visibility=View.VISIBLE
                radiomantar.visibility=View.VISIBLE
                radioiskembe.visibility=View.VISIBLE
                radiotarhana.visibility=View.VISIBLE
                radiotavuk.visibility=View.VISIBLE
                btndevam.visibility=View.VISIBLE
            }
            if (!b){
                radioezogelin.visibility=View.INVISIBLE
                radiodugun.visibility=View.INVISIBLE
                radiomercimek.visibility=View.INVISIBLE
                radiobrokoli.visibility=View.INVISIBLE
                radiokellepaca.visibility=View.INVISIBLE
                radioyayla.visibility=View.INVISIBLE
                radiosehriye.visibility=View.INVISIBLE
                radiodomates.visibility=View.INVISIBLE
                radiomantar.visibility=View.INVISIBLE
                radioiskembe.visibility=View.INVISIBLE
                radiotarhana.visibility=View.INVISIBLE
                radiotavuk.visibility=View.INVISIBLE
                btndevam.visibility=View.INVISIBLE
            }
        }
        var gecicicorbaadi=""
        btndevam.setOnClickListener {
            var secim=true
            if (radioezogelin.isChecked)
                 gecicicorbaadi=radioezogelin.text.toString()
            else if (radiodugun.isChecked)
                gecicicorbaadi=radiodugun.text.toString()
            else if (radiomercimek.isChecked)
                gecicicorbaadi=radiomercimek.text.toString()
            else if (radiobrokoli.isChecked)
                gecicicorbaadi=radiobrokoli.text.toString()
            else if (radiokellepaca.isChecked)
                gecicicorbaadi=radiokellepaca.text.toString()
            else if (radioyayla.isChecked)
                gecicicorbaadi=radioyayla.text.toString()
            else if (radiosehriye.isChecked)
                gecicicorbaadi=radiosehriye.text.toString()
            else if (radiodomates.isChecked)
                gecicicorbaadi=radiodomates.text.toString()
            else if (radiomantar.isChecked)
                gecicicorbaadi=radiomantar.text.toString()
            else if (radioiskembe.isChecked)
                gecicicorbaadi=radioiskembe.text.toString()
            else if (radiotarhana.isChecked)
                gecicicorbaadi=radiotarhana.text.toString()
            else if (radiotavuk.isChecked)
                gecicicorbaadi=radiotavuk.text.toString()
            else{
                secim=false
                val uyari=AlertDialog.Builder(this)
                uyari.setTitle("Uyarı!")
                uyari.setMessage("Lütfen Seçiminizi Yapınız")
                uyari.setIcon(R.drawable.odevlogo)
                uyari.setCancelable(false)
                uyari.setNeutralButton("TEKRAR DENE"){DialogInterface,i->
                }
                uyari.create().show()
            }
            if (secim){
                var tasarim=layoutInflater.inflate(R.layout.olumludevam,null)
                var toasttakiyazi=tasarim.findViewById<TextView>(R.id.secimsoyleme)
                toasttakiyazi.text="$gecicicorbaadi Çorbası \n Güzel Seçim \n Lütfen Bekleyiniz"
                var toastsecim=Toast(applicationContext)
                toastsecim.view=tasarim
                toastsecim.setGravity(Gravity.BOTTOM,0,0)
                toastsecim.duration=Toast.LENGTH_SHORT
                toastsecim.show()
                Handler().postDelayed({
                    var malzemeyegecis=Intent(applicationContext,Malzeme::class.java)
                    malzemeyegecis.putExtra("corbaniz","$gecicicorbaadi Çorbası")
                    startActivity(malzemeyegecis)
                    finish()
                },2100)
            }
        }
    }
}