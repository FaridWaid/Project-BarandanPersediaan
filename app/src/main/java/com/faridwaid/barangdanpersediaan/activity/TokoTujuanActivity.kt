package com.faridwaid.barangdanpersediaan.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import com.faridwaid.barangdanpersediaan.R

class TokoTujuanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toko_tujuan)

        supportActionBar?.hide()

        val cardToko: CardView = findViewById(R.id.cardToko)
        cardToko.setOnClickListener {
            alertDialog()
        }

        // Ketika "backButton" di klik
        // overridePendingTransition digunakan untuk animasi dari intent
        val backButton: ImageView = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            // Jika berhasil maka akan pindah ke activity sebelumnya
            onBackPressed()
            overridePendingTransition(R.anim.slide_from_top, R.anim.slide_to_bottom)
        }

        // Ketika "checkButton" di klik
        // overridePendingTransition digunakan untuk animasi dari intent
        val checkButton: ImageView = findViewById(R.id.checkButton)
        checkButton.setOnClickListener {
            alertDialog()
        }

    }

    private fun alertDialog() {
        val view = View.inflate(this@TokoTujuanActivity, R.layout.alert_dialog_toko, null)

        val builder = AlertDialog.Builder(this@TokoTujuanActivity)
        builder.setView(view)

        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        dialog.setCancelable(false)

        view.findViewById<Button>(R.id.buttonOk).setOnClickListener {
            onBackPressed()
            overridePendingTransition(R.anim.slide_from_top, R.anim.slide_to_bottom)
        }

        view.findViewById<Button>(R.id.buttonBatal).setOnClickListener {
            dialog.dismiss()
        }

    }

    //back button
    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_top, R.anim.slide_to_bottom)
        finish()
    }

}