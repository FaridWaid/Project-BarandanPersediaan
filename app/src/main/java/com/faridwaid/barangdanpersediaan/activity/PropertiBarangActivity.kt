package com.faridwaid.barangdanpersediaan.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.faridwaid.barangdanpersediaan.R

class PropertiBarangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_properti_barang)

        supportActionBar?.hide()

        val icVerified: ImageView = findViewById(R.id.icVerified)
        val icUnverified: ImageView = findViewById(R.id.icUnverified)
        val icVerified2: ImageView = findViewById(R.id.icVerified2)
        val icUnverified2: ImageView = findViewById(R.id.icUnverified2)
        val icVerified3: ImageView = findViewById(R.id.icVerified3)
        val icUnverified3: ImageView = findViewById(R.id.icUnverified3)
        val icVerified4: ImageView = findViewById(R.id.icVerified4)
        val icUnverified4: ImageView = findViewById(R.id.icUnverified4)
        val icVerified5: ImageView = findViewById(R.id.icVerified5)
        val icUnverified5: ImageView = findViewById(R.id.icUnverified5)
        val icVerified6: ImageView = findViewById(R.id.icVerified6)
        val icUnverified6: ImageView = findViewById(R.id.icUnverified6)
        val icVerified7: ImageView = findViewById(R.id.icVerified7)
        val icUnverified7: ImageView = findViewById(R.id.icUnverified7)
        val icVerified8: ImageView = findViewById(R.id.icVerified8)
        val icUnverified8: ImageView = findViewById(R.id.icUnverified8)

        icUnverified.visibility = View.VISIBLE
        icUnverified2.visibility = View.VISIBLE
        icUnverified3.visibility = View.VISIBLE
        icUnverified4.visibility = View.VISIBLE
        icUnverified5.visibility = View.VISIBLE
        icUnverified6.visibility = View.VISIBLE
        icUnverified7.visibility = View.VISIBLE
        icUnverified8.visibility = View.VISIBLE

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

        icUnverified4.setOnClickListener {
            icVerified4.visibility = View.VISIBLE
            icUnverified4.visibility = View.INVISIBLE
        }

        icVerified4.setOnClickListener {
            icVerified4.visibility = View.INVISIBLE
            icUnverified4.visibility = View.VISIBLE
        }

        icUnverified5.setOnClickListener {
            icVerified5.visibility = View.VISIBLE
            icUnverified5.visibility = View.INVISIBLE
        }

        icVerified5.setOnClickListener {
            icVerified5.visibility = View.INVISIBLE
            icUnverified5.visibility = View.VISIBLE
        }

        icUnverified6.setOnClickListener {
            icVerified6.visibility = View.VISIBLE
            icUnverified6.visibility = View.INVISIBLE
        }

        icVerified6.setOnClickListener {
            icVerified6.visibility = View.INVISIBLE
            icUnverified6.visibility = View.VISIBLE
        }

        icUnverified7.setOnClickListener {
            icVerified7.visibility = View.VISIBLE
            icUnverified7.visibility = View.INVISIBLE
        }

        icVerified7.setOnClickListener {
            icVerified7.visibility = View.INVISIBLE
            icUnverified7.visibility = View.VISIBLE
        }

        icUnverified8.setOnClickListener {
            icVerified8.visibility = View.VISIBLE
            icUnverified8.visibility = View.INVISIBLE
        }

        icVerified8.setOnClickListener {
            icVerified8.visibility = View.INVISIBLE
            icUnverified8.visibility = View.VISIBLE
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