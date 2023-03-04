package com.abdulkadirkara.vizeapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class Malzeme : AppCompatActivity() {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_malzeme)
        val txtcorbaadi=findViewById<TextView>(R.id.txtcorbaadi)
        val alinancorba=intent.getStringExtra("corbaniz")
        txtcorbaadi.text=alinancorba
        var seekbartuz=findViewById<SeekBar>(R.id.seekbartuz)
        var seekbaraci=findViewById<SeekBar>(R.id.seekbaraci)
        val switchsarimsak=findViewById<Switch>(R.id.switchsarimsak)
        val switchnane=findViewById<Switch>(R.id.switchnane)
        val switchdil=findViewById<Switch>(R.id.switchdil)
        val switchterbiye=findViewById<Switch>(R.id.switchterbiye)
        val switchbeyin=findViewById<Switch>(R.id.switchbeyin)
        val switchsirke=findViewById<Switch>(R.id.switchsirke)
        val switchkrema=findViewById<Switch>(R.id.switchkrema)
        val switchyag=findViewById<Switch>(R.id.switchyag)
        val switchkasar=findViewById<Switch>(R.id.switchkasar)
        val switchkitir=findViewById<Switch>(R.id.switchkitir)
        val switchlimon=findViewById<Switch>(R.id.switchlimon)
        val switchtozbiber=findViewById<Switch>(R.id.switchtozbiber)
        var edittxtekstra=findViewById<EditText>(R.id.edittxtekstra)
        var btnsiparis=findViewById<Button>(R.id.btnsiparis)

        if (alinancorba=="Ezogelin Çorbası"){
            switchnane.visibility=View.VISIBLE
            switchyag.visibility=View.VISIBLE
            switchkitir.visibility=View.VISIBLE
            switchlimon.visibility=View.VISIBLE
            switchtozbiber.visibility=View.VISIBLE
        }
        else if (alinancorba=="Düğün Çorbası"){
            switchnane.visibility=View.VISIBLE
            switchyag.visibility=View.VISIBLE
            switchkitir.visibility=View.VISIBLE
            switchlimon.visibility=View.VISIBLE
            switchtozbiber.visibility=View.VISIBLE
        }
        else if (alinancorba=="Mercimek Çorbası"){
            switchnane.visibility=View.VISIBLE
            switchyag.visibility=View.VISIBLE
            switchkitir.visibility=View.VISIBLE
            switchlimon.visibility=View.VISIBLE
            switchtozbiber.visibility=View.VISIBLE
        }
        else if (alinancorba=="Brokoli Çorbası"){
            switchkrema.visibility=View.VISIBLE
        }
        else if (alinancorba=="Kelle-Paça Çorbası"){
            switchsarimsak.visibility=View.VISIBLE
            switchdil.visibility=View.VISIBLE
            switchbeyin.visibility=View.VISIBLE
            switchsirke.visibility=View.VISIBLE
            switchyag.visibility=View.VISIBLE
            switchlimon.visibility=View.VISIBLE
        }
        else if (alinancorba=="Yayla Çorbası"){
            switchnane.visibility=View.VISIBLE
            switchyag.visibility=View.VISIBLE
            switchkitir.visibility=View.VISIBLE
            switchtozbiber.visibility=View.VISIBLE
        }
        else if (alinancorba=="Şehriye Çorbası"){
            switchnane.visibility=View.VISIBLE
            switchyag.visibility=View.VISIBLE
            switchlimon.visibility=View.VISIBLE
            switchtozbiber.visibility=View.VISIBLE
        }
        else if (alinancorba=="Domates Çorbası"){
            switchnane.visibility=View.VISIBLE
            switchterbiye.visibility=View.VISIBLE
            switchyag.visibility=View.VISIBLE
            switchkasar.visibility=View.VISIBLE
            switchkitir.visibility=View.VISIBLE
            switchlimon.visibility=View.VISIBLE
            switchtozbiber.visibility=View.VISIBLE
        }
        else if (alinancorba=="Tarhana Çorbası"){
            switchyag.visibility=View.VISIBLE
            switchtozbiber.visibility=View.VISIBLE
        }
        else if (alinancorba=="Mantar Çorbası"){
            switchkrema.visibility=View.VISIBLE
        }
        else if (alinancorba=="İşkembe Çorbası"){
            switchsarimsak.visibility=View.VISIBLE
            switchsirke.visibility=View.VISIBLE
            switchyag.visibility=View.VISIBLE
            switchtozbiber.visibility=View.VISIBLE
            switchlimon.visibility=View.VISIBLE
        }
        else if (alinancorba=="Tavuk Çorbası"){
            switchkrema.visibility=View.VISIBLE
            switchyag.visibility=View.VISIBLE
            switchlimon.visibility=View.VISIBLE
        }
        val switchlistesi= arrayListOf<String>()
        switchsarimsak.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                switchlistesi.add(switchsarimsak.text.toString())
            }
            else
                switchlistesi.remove(switchsarimsak.text.toString())
        }
        switchnane.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                switchlistesi.add(switchnane.text.toString())
            }
            else
                switchlistesi.remove(switchnane.text.toString())
        }
        switchdil.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                switchlistesi.add(switchdil.text.toString())
            }
            else
                switchlistesi.remove(switchdil.text.toString())
        }
        switchterbiye.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                switchlistesi.add(switchterbiye.text.toString())
            }
            else
                switchlistesi.remove(switchterbiye.text.toString())
        }
        switchbeyin.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                switchlistesi.add(switchbeyin.text.toString())
            }
            else
                switchlistesi.remove(switchbeyin.text.toString())
        }
        switchsirke.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                switchlistesi.add(switchsirke.text.toString())
            }
            else
                switchlistesi.remove(switchsirke.text.toString())
        }
        switchkrema.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                switchlistesi.add(switchkrema.text.toString())
            }
            else
                switchlistesi.remove(switchkrema.text.toString())
        }
        switchyag.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                switchlistesi.add(switchyag.text.toString())
            }
            else
                switchlistesi.remove(switchyag.text.toString())
        }
        switchkasar.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                switchlistesi.add(switchkasar.text.toString())
            }
            else
                switchlistesi.remove(switchkasar.text.toString())
        }
        switchkitir.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                switchlistesi.add(switchkitir.text.toString())
            }
            else
                switchlistesi.remove(switchkitir.text.toString())
        }
        switchlimon.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                switchlistesi.add(switchlimon.text.toString())
            }
            else
                switchlistesi.remove(switchlimon.text.toString())
        }
        switchtozbiber.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                switchlistesi.add(switchtozbiber.text.toString())
            }
            else
                switchlistesi.remove(switchtozbiber.text.toString())
        }

        var aciorani="Acısız"
        seekbaraci.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                when(p1){
                    1->{
                        aciorani="Orta Acılı"
                    }
                    2->{
                        val aciuyari=AlertDialog.Builder(this@Malzeme)
                        aciuyari.setTitle("Uyarı!")
                        aciuyari.setMessage("Bu kadar acı istediğinize emin misiniz?")
                        aciuyari.setIcon(R.drawable.aci)
                        aciuyari.setCancelable(false)
                        aciuyari.setPositiveButton("Evet"){DialogInterface,i->
                            aciorani="Bol Acılı"
                            Toast.makeText(applicationContext,"Bol acılı çorba",Toast.LENGTH_SHORT).show()
                        }
                        aciuyari.setNegativeButton("Hayır"){DialogInterface, b->
                            seekbaraci.progress=1
                        }
                        aciuyari.create().show()

                    }
                    else->{
                        aciorani="Acısız"
                    }
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })
        var tuzorani="Tuzsuz"
        seekbartuz.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                when(p1){
                    1->{
                        tuzorani="Orta Tuzlu"
                    }
                    2->{
                        val tuzuyari=AlertDialog.Builder(this@Malzeme)
                        tuzuyari.setIcon(R.drawable.tuz)
                        tuzuyari.setTitle("Uyarı!")
                        tuzuyari.setMessage("Bu kadar tuz istediğinize emin misiniz?")
                        tuzuyari.setCancelable(false)
                        tuzuyari.setPositiveButton("Evet"){DialogInterface,İ->
                            Toast.makeText(applicationContext,"Bol tuzlu çorba",Toast.LENGTH_SHORT).show()
                            tuzorani="Bol Tuzlu"
                        }
                        tuzuyari.setNegativeButton("Hayır"){DialogInterface,i->
                            tuzorani="Orta Tuzlu"
                            seekbartuz.progress=1

                        }
                        tuzuyari.create().show()
                    }
                    else->{
                        tuzorani="Tuzsuz"
                    }
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })
        btnsiparis.setOnClickListener {
            var switchlistestringi=""
            if (switchlistesi.size>0){
                for (i in switchlistesi){
                    switchlistestringi="$switchlistestringi $i,"
                }
            }
            val siparisuyari=AlertDialog.Builder(this)
            siparisuyari.setIcon(R.drawable.odevlogo)
            siparisuyari.setTitle("Siparişinizin Durumu")
            siparisuyari.setMessage("Siparişiniz Hazırlanacak.Devam Etmek İstiyor Musunuz?")
            siparisuyari.setCancelable(false)
            siparisuyari.setPositiveButton("Evet"){DialogInterface,i->
                Handler().postDelayed({
                    val gecis=Intent(applicationContext,Sonuc::class.java)
                    gecis.putExtra("switchler",switchlistestringi)
                    gecis.putExtra("tuzun",tuzorani)
                    gecis.putExtra("acin",aciorani)
                    gecis.putExtra("corbanick",alinancorba)
                    gecis.putExtra("ekstralar",edittxtekstra.text.toString())
                    startActivity(gecis)
                    finish()
                },1100)
            }
            siparisuyari.setNegativeButton("Tekrar Kontrol Etmek İstiyorum"){DialogInterface,i->

            }
            siparisuyari.create().show()
        }
    }
}