package com.faridwaid.barangdanpersediaan.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView
import com.faridwaid.barangdanpersediaan.R

class PemindaiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pemindai)

        supportActionBar?.hide()

        val icVerified: ImageView = findViewById(R.id.icVerified)
        val icUnverified: ImageView = findViewById(R.id.icUnverified)
        val icVerified2: ImageView = findViewById(R.id.icVerified2)
        val icUnverified2: ImageView = findViewById(R.id.icUnverified2)
        val icVerified3: ImageView = findViewById(R.id.icVerified3)
        val icUnverified3: ImageView = findViewById(R.id.icUnverified3)
        val seekBar1: SeekBar = findViewById(R.id.seekbar1)
        val seekBar2: SeekBar = findViewById(R.id.seekbar2)
        val seekBar3: SeekBar = findViewById(R.id.seekbar3)
        val seekBar4: SeekBar = findViewById(R.id.seekbar4)
        val textSeekBar1: TextView = findViewById(R.id.textSeekbar1)
        val textSeekBar2: TextView = findViewById(R.id.textSeekbar2)
        val textSeekBar3: TextView = findViewById(R.id.textSeekbar3)
        val textSeekBar4: TextView = findViewById(R.id.textSeekbar4)

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

        seekBar1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                textSeekBar1.text = p1.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })

        seekBar2.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                textSeekBar2.text = p1.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })

        seekBar3.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                textSeekBar3.text = p1.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })

        seekBar4.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                textSeekBar4.text = p1.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })

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