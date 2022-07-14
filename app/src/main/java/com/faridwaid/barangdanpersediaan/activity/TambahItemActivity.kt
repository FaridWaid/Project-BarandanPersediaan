package com.faridwaid.barangdanpersediaan.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import com.faridwaid.barangdanpersediaan.R

class TambahItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_item)

        supportActionBar?.hide()

        val plus: ImageView = findViewById(R.id.plus)
        val minus: ImageView = findViewById(R.id.minus)
        val subtitute: ImageView = findViewById(R.id.subtitute)
        plus.setOnClickListener {
            alertDialog()
        }
        minus.setOnClickListener {
            alertDialog()
        }
        subtitute.setOnClickListener {
            startActivity(Intent(this, TokoTujuanActivity::class.java))
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

        // Ketika "checkButton" di klik
        // overridePendingTransition digunakan untuk animasi dari intent
        val checkButton: ImageView = findViewById(R.id.checkButton)
        checkButton.setOnClickListener {
            startActivity(Intent(this, BarangActivity::class.java))
            overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
            finish()
        }

    }

    private fun alertDialog() {
        val view = View.inflate(this@TambahItemActivity, R.layout.alert_dialog, null)

        val builder = AlertDialog.Builder(this@TambahItemActivity)
        builder.setView(view)

        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        dialog.setCancelable(false)

        view.findViewById<Button>(R.id.buttonOk).setOnClickListener {
            dialog.dismiss()
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