package com.faridwaid.barangdanpersediaan.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.faridwaid.barangdanpersediaan.R
import com.faridwaid.barangdanpersediaan.activity.DaftarTransaksiActivity
import com.faridwaid.barangdanpersediaan.activity.PemindaiActivity

class LaporanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_laporan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity).supportActionBar?.title = "Laporan"

        val cardTransaksi: CardView = view.findViewById(R.id.cardTransaksi)
        cardTransaksi.setOnClickListener {
            alertDialog()
        }

    }


    private fun alertDialog() {
        val view = View.inflate(requireContext(), R.layout.alert_transaksi, null)

        val builder = AlertDialog.Builder(requireContext())
        builder.setView(view)

        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        dialog.setCancelable(false)

        var card30Hari = false

        val icVerified: ImageView = view.findViewById(R.id.icVerified)
        val icUnverified: ImageView = view.findViewById(R.id.icUnverified)
        val icVerified2: ImageView = view.findViewById(R.id.icVerified2)
        val icUnverified2: ImageView = view.findViewById(R.id.icUnverified2)
        val icVerified3: ImageView = view.findViewById(R.id.icVerified3)
        val icUnverified3: ImageView = view.findViewById(R.id.icUnverified3)
        val icVerified4: ImageView = view.findViewById(R.id.icVerified4)
        val icUnverified4: ImageView = view.findViewById(R.id.icUnverified4)
        val icVerified5: ImageView = view.findViewById(R.id.icVerified5)
        val icUnverified5: ImageView = view.findViewById(R.id.icUnverified5)

        icUnverified.visibility = View.VISIBLE
        icUnverified2.visibility = View.VISIBLE
        icUnverified3.visibility = View.VISIBLE
        icUnverified4.visibility = View.VISIBLE
        icUnverified5.visibility = View.VISIBLE

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
            card30Hari = true
        }

        icVerified2.setOnClickListener {
            icVerified2.visibility = View.INVISIBLE
            icUnverified2.visibility = View.VISIBLE
            card30Hari = false
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

        view.findViewById<Button>(R.id.buttonOk).setOnClickListener {
            if (card30Hari){
                // Jika berhasil maka akan pindah ke DaftarTransaksiActivity
                requireActivity().run{
                    startActivity(Intent(this, DaftarTransaksiActivity::class.java))
                    overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
                }
            }
            dialog.dismiss()
        }

        view.findViewById<Button>(R.id.buttonBatal).setOnClickListener {
            dialog.dismiss()
        }

    }


}