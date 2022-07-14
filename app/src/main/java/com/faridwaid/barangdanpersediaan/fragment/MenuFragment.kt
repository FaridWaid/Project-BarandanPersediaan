package com.faridwaid.barangdanpersediaan.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.faridwaid.barangdanpersediaan.R

class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity).supportActionBar?.title = "Barang dan Persediaan"

        val cardBarang: CardView = view.findViewById(R.id.cardBarang)
        cardBarang.setOnClickListener {
            replaceFragment(BarangFragment())
        }

        val cardDokumen: CardView = view.findViewById(R.id.cardDocument)
        cardDokumen.setOnClickListener {
            replaceFragment(DokumenFragment())
        }

        val cardLaporan: CardView = view.findViewById(R.id.cardLaporan)
        cardLaporan.setOnClickListener {
            replaceFragment(LaporanFragment())
        }

        val cardBiaya: CardView = view.findViewById(R.id.cardBiaya)
        cardBiaya.setOnClickListener {
            Toast.makeText(requireContext(), "Menu Biaya", Toast.LENGTH_SHORT).show()
        }

        val cardTambah1: CardView = view.findViewById(R.id.cardtambah1)
        cardTambah1.setOnClickListener {
            replaceFragment(PemasokFragment())
        }

        val cardTambah2: CardView = view.findViewById(R.id.cardtambah2)
        cardTambah2.setOnClickListener {
            Toast.makeText(requireContext(), "Menu Tambah 2", Toast.LENGTH_SHORT).show()
        }

        val cardTambah3: CardView = view.findViewById(R.id.cardtambah3)
        cardTambah3.setOnClickListener {
            replaceFragment(BarangFragment())
        }

        val cardTambah4: CardView = view.findViewById(R.id.cardtambah4)
        cardTambah4.setOnClickListener {
            replaceFragment(BarangFragment())
        }

        val cardPengaturan1: CardView = view.findViewById(R.id.cardpengaturan1)
        cardPengaturan1.setOnClickListener {
            Toast.makeText(requireContext(), "Menu Pengaturan 1", Toast.LENGTH_SHORT).show()
        }

        val cardPengaturan2: CardView = view.findViewById(R.id.cardPengaturan2)
        cardPengaturan2.setOnClickListener {
            Toast.makeText(requireContext(), "Menu Pengaturan 2", Toast.LENGTH_SHORT).show()
        }

        val cardPengaturan3: CardView = view.findViewById(R.id.cardpengaturan3)
        cardPengaturan3.setOnClickListener {
            replaceFragment(PengaturanFragment())
        }

        val cardPengaturan4: CardView = view.findViewById(R.id.cardPengaturan4)
        cardPengaturan4.setOnClickListener {
            Toast.makeText(requireContext(), "Menu Pengaturan 4", Toast.LENGTH_SHORT).show()
        }

    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = requireActivity().supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.disallowAddToBackStack()
        fragmentTransaction.commit()
    }

}