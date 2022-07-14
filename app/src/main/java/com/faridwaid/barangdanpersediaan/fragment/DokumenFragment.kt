package com.faridwaid.barangdanpersediaan.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.faridwaid.barangdanpersediaan.R
import com.faridwaid.barangdanpersediaan.activity.TambahItemActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DokumenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dokumen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity).supportActionBar?.title = "Dokumen"

        val buttonAdd: FloatingActionButton = view.findViewById(R.id.buttonAdd)

        var count = 0

        val underline1: View = view.findViewById(R.id.underline1)
        val underline2: View = view.findViewById(R.id.underline2)
        val underline3: View = view.findViewById(R.id.underline3)
        val underline4: View = view.findViewById(R.id.underline4)
        val underline5: View = view.findViewById(R.id.underline5)

        val textMasuk: TextView = view.findViewById(R.id.masuk)
        val textSemua: TextView = view.findViewById(R.id.semua)
        val textKeluar: TextView = view.findViewById(R.id.keluar)
        val textTransfer: TextView = view.findViewById(R.id.transfer)
        val textPerhitungan: TextView = view.findViewById(R.id.perhitungan)


        underline1.visibility = View.VISIBLE

        textSemua.setOnClickListener {
            underline1.visibility = View.VISIBLE
            underline2.visibility = View.INVISIBLE
            underline3.visibility = View.INVISIBLE
            underline4.visibility = View.INVISIBLE
            underline5.visibility = View.INVISIBLE
            buttonAdd.visibility = View.VISIBLE
            count = 0
        }

        textMasuk.setOnClickListener {
            underline1.visibility = View.INVISIBLE
            underline2.visibility = View.VISIBLE
            underline3.visibility = View.INVISIBLE
            underline4.visibility = View.INVISIBLE
            underline5.visibility = View.INVISIBLE
            buttonAdd.visibility = View.VISIBLE
            count = 1
        }

        textKeluar.setOnClickListener {
            underline1.visibility = View.INVISIBLE
            underline2.visibility = View.INVISIBLE
            underline3.visibility = View.VISIBLE
            underline4.visibility = View.INVISIBLE
            underline5.visibility = View.INVISIBLE
            buttonAdd.visibility = View.VISIBLE
            count = 2
        }

        textTransfer.setOnClickListener {
            underline1.visibility = View.INVISIBLE
            underline2.visibility = View.INVISIBLE
            underline3.visibility = View.INVISIBLE
            underline4.visibility = View.VISIBLE
            underline5.visibility = View.INVISIBLE
            buttonAdd.visibility = View.VISIBLE
            count = 3
        }

        textPerhitungan.setOnClickListener {
            underline1.visibility = View.INVISIBLE
            underline2.visibility = View.INVISIBLE
            underline3.visibility = View.INVISIBLE
            underline4.visibility = View.INVISIBLE
            underline5.visibility = View.VISIBLE
            buttonAdd.visibility = View.INVISIBLE
            count = 4
        }

        buttonAdd.setOnClickListener {
            if (count == 0){
                alertDialogSemua()
            } else if (count == 1) {
                alertDialogMasuk()
            } else if (count == 2) {
                alertDialogKeluar()
            } else if (count == 3) {
                alertDialogTransfer()
            }
//            else if (count == 4) {
//                Toast.makeText(requireContext(), "Perhitungan", Toast.LENGTH_SHORT).show()
//            }
        }



    }

    private fun alertDialogSemua() {
        val view = View.inflate(requireContext(), R.layout.alert_semua, null)

        val builder = AlertDialog.Builder(requireContext())
        builder.setView(view)

        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        dialog.setCancelable(false)

        var cardMasuk = false
        var cardKeluar = false
        var cardTransfer = false
        var cardPerhitungan = false

        val icVerified: ImageView = view.findViewById(R.id.icVerified)
        val icUnverified: ImageView = view.findViewById(R.id.icUnverified)
        val icVerified2: ImageView = view.findViewById(R.id.icVerified2)
        val icUnverified2: ImageView = view.findViewById(R.id.icUnverified2)
        val icVerified3: ImageView = view.findViewById(R.id.icVerified3)
        val icUnverified3: ImageView = view.findViewById(R.id.icUnverified3)
        val icVerified4: ImageView = view.findViewById(R.id.icVerified4)
        val icUnverified4: ImageView = view.findViewById(R.id.icUnverified4)

        icUnverified.visibility = View.VISIBLE
        icUnverified2.visibility = View.VISIBLE
        icUnverified3.visibility = View.VISIBLE
        icUnverified4.visibility = View.VISIBLE

        icUnverified.setOnClickListener {
            icVerified.visibility = View.VISIBLE
            icUnverified.visibility = View.INVISIBLE
            cardMasuk = true
        }

        icVerified.setOnClickListener {
            icVerified.visibility = View.INVISIBLE
            icUnverified.visibility = View.VISIBLE
            cardMasuk = false
        }

        icUnverified2.setOnClickListener {
            icVerified2.visibility = View.VISIBLE
            icUnverified2.visibility = View.INVISIBLE
            cardKeluar = true
        }

        icVerified2.setOnClickListener {
            icVerified2.visibility = View.INVISIBLE
            icUnverified2.visibility = View.VISIBLE
            cardKeluar = false
        }

        icUnverified3.setOnClickListener {
            icVerified3.visibility = View.VISIBLE
            icUnverified3.visibility = View.INVISIBLE
            cardTransfer = true
        }

        icVerified3.setOnClickListener {
            icVerified3.visibility = View.INVISIBLE
            icUnverified3.visibility = View.VISIBLE
            cardTransfer = false
        }

        icUnverified4.setOnClickListener {
            icVerified4.visibility = View.VISIBLE
            icUnverified4.visibility = View.INVISIBLE
            cardPerhitungan = true
        }

        icVerified4.setOnClickListener {
            icVerified4.visibility = View.INVISIBLE
            icUnverified4.visibility = View.VISIBLE
            cardPerhitungan = false
        }

        view.findViewById<Button>(R.id.buttonOk).setOnClickListener {
            if (cardMasuk == true && cardKeluar == true && cardTransfer == true) {
                alertDialogTransfer()
                alertDialogKeluar()
                alertDialogMasuk()
            } else if (cardMasuk == true && cardKeluar == false && cardTransfer == true) {
                alertDialogTransfer()
                alertDialogMasuk()
            } else if (cardMasuk == true && cardKeluar == true && cardTransfer == false) {
                alertDialogKeluar()
                alertDialogMasuk()
            } else if (cardMasuk == true && cardKeluar == false && cardTransfer == false) {
                alertDialogMasuk()
            } else if (cardMasuk == false && cardKeluar == false && cardTransfer == true) {
                alertDialogTransfer()
            } else if (cardMasuk == false && cardKeluar == true && cardTransfer == true) {
                alertDialogTransfer()
                alertDialogKeluar()
            } else if (cardMasuk == false && cardKeluar == true && cardTransfer == false) {
                alertDialogKeluar()
            }
            dialog.dismiss()
        }

        view.findViewById<Button>(R.id.buttonBatal).setOnClickListener {
            dialog.dismiss()
        }

    }

    private fun alertDialogMasuk() {
        val view = View.inflate(requireContext(), R.layout.alert_dialog, null)

        val builder = AlertDialog.Builder(requireContext())
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

    private fun alertDialogKeluar() {
        val view = View.inflate(requireContext(), R.layout.alert_keluar, null)

        val builder = AlertDialog.Builder(requireContext())
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

    private fun alertDialogTransfer() {
        val view = View.inflate(requireContext(), R.layout.alert_dialog_toko, null)

        val builder = AlertDialog.Builder(requireContext())
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

}