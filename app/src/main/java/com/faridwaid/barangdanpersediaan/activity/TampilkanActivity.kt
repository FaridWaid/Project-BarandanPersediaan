package com.faridwaid.barangdanpersediaan.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.faridwaid.barangdanpersediaan.R

class TampilkanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilkan)

        supportActionBar?.hide()

        val icVerified: ImageView = findViewById(R.id.icVerified)
        val icUnverified: ImageView = findViewById(R.id.icUnverified)
        val icVerifiedGaya2: ImageView = findViewById(R.id.icVerifiedGaya2)
        val icUnverifiedGaya2: ImageView = findViewById(R.id.icUnverifiedGaya2)
        val icVerifiedGaya3: ImageView = findViewById(R.id.icVerifiedGaya3)
        val icUnverifiedGaya3: ImageView = findViewById(R.id.icUnverifiedGaya3)

        icUnverified.visibility = View.VISIBLE
        icUnverifiedGaya2.visibility = View.VISIBLE
        icUnverifiedGaya3.visibility = View.VISIBLE

        icUnverified.setOnClickListener {
            icVerified.visibility = View.VISIBLE
            icUnverified.visibility = View.INVISIBLE
        }

        icVerified.setOnClickListener {
            icVerified.visibility = View.INVISIBLE
            icUnverified.visibility = View.VISIBLE
        }

        icUnverifiedGaya2.setOnClickListener {
            icVerifiedGaya2.visibility = View.VISIBLE
            icUnverifiedGaya2.visibility = View.INVISIBLE
        }

        icVerifiedGaya2.setOnClickListener {
            icVerifiedGaya2.visibility = View.INVISIBLE
            icUnverifiedGaya2.visibility = View.VISIBLE
        }

        icUnverifiedGaya3.setOnClickListener {
            icVerifiedGaya3.visibility = View.VISIBLE
            icUnverifiedGaya3.visibility = View.INVISIBLE
        }

        icVerifiedGaya3.setOnClickListener {
            icVerifiedGaya3.visibility = View.INVISIBLE
            icUnverifiedGaya3.visibility = View.VISIBLE
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