package com.praktikum.difaagung.intentmodern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Nim: EditText = findViewById(R.id.nim1)
        var Nama : EditText = findViewById(R.id.nama1)
        var Nilai : EditText = findViewById(R.id.nilai1)


        btn_proses.setOnClickListener() {
            val intent = Intent(this, HasilNilai::class.java)
            intent.putExtra("data1", Nim.getText())
            intent.putExtra("data2", Nama.getText())
            intent.putExtra("data3", Nilai.getText())
            if (Nilai.text.isEmpty()){
                Nilai.setError("Nilai Harus Diisi!!")
            }else {
                startActivity(intent)
            }
        }
    }
}
