package com.faridwaid.barangdanpersediaan.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.faridwaid.barangdanpersediaan.R

class KuantitasMinimumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kuantitas_minimum2)

        supportActionBar?.hide()

        val icVerified: ImageView = findViewById(R.id.icVerified)
        val icUnverified: ImageView = findViewById(R.id.icUnverified)
        val icVerified2: ImageView = findViewById(R.id.icVerified2)
        val icUnverified2: ImageView = findViewById(R.id.icUnverified2)
        val icVerified3: ImageView = findViewById(R.id.icVerified3)
        val icUnverified3: ImageView = findViewById(R.id.icUnverified3)

        icUnverified.visibility = View.VISIBLE
        icUnverified2.visibility = View.VISIBLE
        icUnverified3.visibility = View.VISIBLE

        icUnverified.setOnClickListener {
            icVerified.visibility = View.VISIBLE
            icUnverified.visibility = View.INVISIBLE
        }

        icVerified.setOnClickListener {
            icVerified.visibility = View.INVISIBLE
            icUnverified.visibility = View.VISIBLE
        }

        icUnverified2.setOnClickListener {
            icVerified2.visibility = View.VISIBLE
            icUnverified2.visibility = View.INVISIBLE
        }

        icVerified2.setOnClickListener {
            icVerified2.visibility = View.INVISIBLE
            icUnverified2.visibility = View.VISIBLE
        }

        icUnverified3.setOnClickListener {
            icVerified3.visibility = View.VISIBLE
            icUnverified3.visibility = View.INVISIBLE
        }

        icVerified3.setOnClickListener {
            icVerified3.visibility = View.INVISIBLE
            icUnverified3.visibility = View.VISIBLE
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