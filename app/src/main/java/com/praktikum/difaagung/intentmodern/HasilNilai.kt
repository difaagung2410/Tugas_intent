package com.praktikum.difaagung.intentmodern

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_hasil.*

class HasilNilai : AppCompatActivity() {
    private lateinit var Nim1 : TextView
    private lateinit var Nama1 : TextView
    private lateinit var Nilai1 : TextView
    private lateinit var Ket : TextView
    private lateinit var Hasil : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val bundle:Bundle? = intent.extras
        val nimku = bundle?.get("data1")
        val namaku = bundle?.get("data2")
        val nilaiku = bundle?.get("data3")

        Nim1 = findViewById(R.id.nim_hasil)
        Nama1 = findViewById(R.id.nama_hasil)
        Nilai1 = findViewById(R.id.nilai_hasil)
        Ket = findViewById(R.id.keterangan)
        Hasil = findViewById(R.id.hasil)

        var nilaikuy = nilaiku.toString()
        var nilainya = nilaikuy.toInt()

        Nim1.setText("NIM                 : "+nimku)
        Nama1.setText("Nama              : "+namaku)
        Nilai1.setText("Nilai                 : "+nilaiku)


        if (nilainya >= 80) {
            Ket.setText("Keterangan     : A")
            Hasil.setText("LULUS")
        }else if(nilainya >= 60){
            Ket.setText("Keterangan     : B")
            Hasil.setText("LULUS")
        }else if(nilainya >= 40){
            Ket.setText("Keterangan     : C")
            Hasil.setText("TIDAK LULUS")
        }else if(nilainya >= 20){
            Ket.setText("Keterangan     : D")
            Hasil.setText("TIDAK LULUS")
        }else{
            Ket.setText("Keterangan     : E")
            Hasil.setText("TIDAK LULUS")
        }
    }
}
