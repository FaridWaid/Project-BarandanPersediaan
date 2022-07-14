package com.faridwaid.barangdanpersediaan.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.faridwaid.barangdanpersediaan.R
import com.faridwaid.barangdanpersediaan.activity.*
import com.google.android.material.floatingactionbutton.FloatingActionButton

class PengaturanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pengaturan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity).supportActionBar?.title = "Pengaturan"

        val cardUmum: CardView = view.findViewById(R.id.cardUmum)
        cardUmum.setOnClickListener {
            // Jika berhasil maka akan pindah ke UmumActivity
            requireActivity().run{
                startActivity(Intent(this, UmumActivity::class.java))
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
            }
        }

        val cardTampilkan: CardView = view.findViewById(R.id.cardTampilkan)
        cardTampilkan.setOnClickListener {
            // Jika berhasil maka akan pindah ke TampilkanActivity
            requireActivity().run{
                startActivity(Intent(this, TampilkanActivity::class.java))
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
            }
        }

        val cardProperti: CardView = view.findViewById(R.id.cardProperti)
        cardProperti.setOnClickListener {
            // Jika berhasil maka akan pindah ke PropertiBarangActivity
            requireActivity().run{
                startActivity(Intent(this, PropertiBarangActivity::class.java))
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
            }
        }

        val cardImpordanExpor: CardView = view.findViewById(R.id.cardImpor)
        cardImpordanExpor.setOnClickListener {
            // Jika berhasil maka akan pindah ke ImpordanExporActivity
            requireActivity().run{
                startActivity(Intent(this, ImpordanExporActivity::class.java))
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
            }
        }

        val cardPemindai: CardView = view.findViewById(R.id.cardBarcode)
        cardPemindai.setOnClickListener {
            // Jika berhasil maka akan pindah ke PemindaiActivity
            requireActivity().run{
                startActivity(Intent(this, PemindaiActivity::class.java))
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
            }
        }

        val cardKuantitas: CardView = view.findViewById(R.id.cardKuantitas)
        cardKuantitas.setOnClickListener {
            // Jika berhasil maka akan pindah ke KuantitasMinimumActivity
            requireActivity().run{
                startActivity(Intent(this, KuantitasMinimumActivity::class.java))
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
            }
        }

        val cardPerusahaan: CardView = view.findViewById(R.id.cardPerusahaan)
        cardPerusahaan.setOnClickListener {
            // Jika berhasil maka akan pindah ke PerusahaanActivity
            requireActivity().run{
                startActivity(Intent(this, PerusahaanActivity::class.java))
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
            }
        }

    }

}