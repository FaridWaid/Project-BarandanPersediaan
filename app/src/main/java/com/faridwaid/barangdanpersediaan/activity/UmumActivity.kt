package com.faridwaid.barangdanpersediaan.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.faridwaid.barangdanpersediaan.R

class UmumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_umum)

        supportActionBar?.hide()

        val icVerified: ImageView = findViewById(R.id.icVerified)
        val icUnverified: ImageView = findViewById(R.id.icUnverified)
        val icVerifiedKeamanan1: ImageView = findViewById(R.id.icVerifiedKeamanan1)
        val icUnverifiedKeamanan1: ImageView = findViewById(R.id.icUnverifiedKeamanan1)
        val icVerifiedKeamanan2: ImageView = findViewById(R.id.icVerifiedKeamanan2)
        val icUnverifiedKeamanan2: ImageView = findViewById(R.id.icUnverifiedKeamanan2)
        val icVerifiedTambahan: ImageView = findViewById(R.id.icVerifiedTambahan)
        val icUnverifiedTambahan: ImageView = findViewById(R.id.icUnverifiedTambahan)

        icUnverified.visibility = View.VISIBLE
        icUnverifiedKeamanan1.visibility = View.VISIBLE
        icUnverifiedKeamanan2.visibility = View.VISIBLE
        icUnverifiedTambahan.visibility = View.VISIBLE

        icUnverified.setOnClickListener {
            icVerified.visibility = View.VISIBLE
            icUnverified.visibility = View.INVISIBLE
        }

        icVerified.setOnClickListener {
            icVerified.visibility = View.INVISIBLE
            icUnverified.visibility = View.VISIBLE
        }

        icUnverifiedKeamanan1.setOnClickListener {
            icVerifiedKeamanan1.visibility = View.VISIBLE
            icUnverifiedKeamanan1.visibility = View.INVISIBLE
        }

        icVerifiedKeamanan1.setOnClickListener {
            icVerifiedKeamanan1.visibility = View.INVISIBLE
            icUnverifiedKeamanan1.visibility = View.VISIBLE
        }

        icUnverifiedKeamanan2.setOnClickListener {
            icVerifiedKeamanan2.visibility = View.VISIBLE
            icUnverifiedKeamanan2.visibility = View.INVISIBLE
        }

        icVerifiedKeamanan2.setOnClickListener {
            icVerifiedKeamanan2.visibility = View.INVISIBLE
            icUnverifiedKeamanan2.visibility = View.VISIBLE
        }

        icUnverifiedTambahan.setOnClickListener {
            icVerifiedTambahan.visibility = View.VISIBLE
            icUnverifiedTambahan.visibility = View.INVISIBLE
        }

        icVerifiedTambahan.setOnClickListener {
            icVerifiedTambahan.visibility = View.INVISIBLE
            icUnverifiedTambahan.visibility = View.VISIBLE
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