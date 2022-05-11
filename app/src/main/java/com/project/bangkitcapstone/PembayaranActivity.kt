package com.project.bangkitcapstone

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class PembayaranActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran)

        val btnLihatSemua = findViewById<TextView>(R.id.btn_lihat_semua);
        val btnClosePilihan = findViewById<ImageView>(R.id.btn_close_pilihan);
        val pilihMetodeWrap = findViewById<LinearLayout>(R.id.pilih_metode_wrap);

        btnLihatSemua.setOnClickListener {
            pilihMetodeWrap.visibility = View.VISIBLE
        }
        btnClosePilihan.setOnClickListener {
            pilihMetodeWrap.visibility = View.INVISIBLE
        }

    }
}