package com.faridwaid.barangdanpersediaan.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.faridwaid.barangdanpersediaan.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BarangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barang)

        supportActionBar?.hide()

        val cardToko: CardView = findViewById(R.id.cardToko)
        cardToko.setOnClickListener {
            startActivity(Intent(this, TambahItemActivity::class.java))
            overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
            finish()
        }

        val buttonFolder: FloatingActionButton = findViewById(R.id.buttonFolder)
        buttonFolder.setOnClickListener {
            // Jika berhasil maka akan pindah ke TambahGrupActivity
            startActivity(Intent(this, TambahGrupActivity::class.java))
            overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
            finish()
        }

        val buttonAdd: FloatingActionButton = findViewById(R.id.buttonBox)
        buttonAdd.setOnClickListener {
            // Jika berhasil maka akan pindah ke TambahItemActivity
            startActivity(Intent(this, TambahItemActivity::class.java))
            overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
            finish()
        }

        // Ketika "backButton" di klik
        // overridePendingTransition digunakan untuk animasi dari intent
        val backButton: ImageView = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            // Jika berhasil maka akan pindah ke activity sebelumnya
            onBackPressed()
            overridePendingTransition(R.anim.slide_from_top, R.anim.slide_to_bottom)
        }

    }

    //back button
    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_top, R.anim.slide_to_bottom)
        finish()
    }

}