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
import com.faridwaid.barangdanpersediaan.activity.TambahPemasokActivity
import com.faridwaid.barangdanpersediaan.activity.TambahTokoActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TokoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_toko, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity).supportActionBar?.title = "Toko"

        val cardPemasok: CardView = view.findViewById(R.id.card1)
        cardPemasok.setOnClickListener {
            // Jika berhasil maka akan pindah ke TambahTokoActivity
            requireActivity().run{
                startActivity(Intent(this, TambahTokoActivity::class.java))
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
            }
        }

        val buttonAdd: FloatingActionButton = view.findViewById(R.id.buttonAdd)
        buttonAdd.setOnClickListener {
            // Jika berhasil maka akan pindah ke TambahTokoActivity
            requireActivity().run{
                startActivity(Intent(this, TambahTokoActivity::class.java))
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
            }
        }

    }


}