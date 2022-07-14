package com.faridwaid.barangdanpersediaan.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.faridwaid.barangdanpersediaan.R
import com.faridwaid.barangdanpersediaan.activity.TambahGrupActivity
import com.faridwaid.barangdanpersediaan.activity.TambahItemActivity
import com.faridwaid.barangdanpersediaan.adapter.ListBarangAdapter
import com.faridwaid.barangdanpersediaan.model.Barang
import com.faridwaid.barangdanpersediaan.model.DataBarang
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BarangFragment : Fragment() {

    private lateinit var rvBarang: RecyclerView
    private var list: ArrayList<Barang> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_barang, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity).supportActionBar?.title = "Barang"

        rvBarang = view.findViewById(R.id.rv_barang)
        rvBarang.setHasFixedSize(true)

        list.clear()
        list.addAll(DataBarang.listData)
        showRecyclesList()

        val buttonFolder: FloatingActionButton = view.findViewById(R.id.buttonFolder)
        buttonFolder.setOnClickListener {
            // Jika berhasil maka akan pindah ke TambahGrupActivity
            requireActivity().run{
                startActivity(Intent(this, TambahGrupActivity::class.java))
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
            }
        }

        val buttonAdd: FloatingActionButton = view.findViewById(R.id.buttonBox)
        buttonAdd.setOnClickListener {
            // Jika berhasil maka akan pindah ke TambahItemActivity
            requireActivity().run{
                startActivity(Intent(this, TambahItemActivity::class.java))
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
            }
        }

    }

    private fun showRecyclesList() {
        rvBarang.layoutManager = LinearLayoutManager(context)
        val listBarangAdapter = ListBarangAdapter(list)
        rvBarang.adapter = listBarangAdapter
    }

}