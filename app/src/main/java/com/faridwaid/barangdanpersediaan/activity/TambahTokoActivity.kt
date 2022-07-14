package com.faridwaid.barangdanpersediaan.activity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import com.faridwaid.barangdanpersediaan.R
import kotlin.properties.Delegates

class TambahTokoActivity : AppCompatActivity() {

    private var returnIs by Delegates.notNull<Boolean>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_toko)

        returnIs = false

        supportActionBar?.hide()

        val icVerified: ImageView = findViewById(R.id.icVerified)
        val icUnverified: ImageView = findViewById(R.id.icUnverified)

        icUnverified.visibility = View.VISIBLE

        icUnverified.setOnClickListener {
            icVerified.visibility = View.VISIBLE
            icUnverified.visibility = View.INVISIBLE
        }

        icVerified.setOnClickListener {
            icVerified.visibility = View.INVISIBLE
            icUnverified.visibility = View.VISIBLE
        }

        // Ketika "backButton" di klik
        // overridePendingTransition digunakan untuk animasi dari intent
        val backButton: ImageView = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            // Jika berhasil maka akan pindah ke activity sebelumnya
            alertDialog()
        }

        // Ketika "checkButton" di klik
        // overridePendingTransition digunakan untuk animasi dari intent
        val checkButton: ImageView = findViewById(R.id.checkButton)
        checkButton.setOnClickListener {
            // Jika berhasil maka akan pindah ke activity sebelumnya
            returnIs = true
            onBackPressed()
            overridePendingTransition(R.anim.slide_from_top, R.anim.slide_to_bottom)
        }

    }

    private fun alertDialog() {
        val alertDialog = AlertDialog.Builder(this)
        alertDialog.apply {
            // Menambahkan title dan pesan ke dalam alert dialog
            setTitle("PERHATIAN!!")
            setMessage("Tutup tanpa menyimpan?")
            setCancelable(false)
            setPositiveButton(
                "Ok",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    dialogInterface.dismiss()
                    returnIs = true
                    onBackPressed()
                    overridePendingTransition(R.anim.slide_from_top, R.anim.slide_to_bottom)
                })
            setNegativeButton("Batal", DialogInterface.OnClickListener { dialogInterface, i ->
                dialogInterface.dismiss()
            })
        }
        alertDialog.show()
    }

    //back button
    override fun onBackPressed() {
        if (returnIs == true){
            super.onBackPressed()
            overridePendingTransition(R.anim.slide_from_top, R.anim.slide_to_bottom)
            finish()
        } else{
            alertDialog()
        }
    }

}