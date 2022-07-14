package com.faridwaid.barangdanpersediaan.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.faridwaid.barangdanpersediaan.R
import com.faridwaid.barangdanpersediaan.activity.BarangActivity
import com.faridwaid.barangdanpersediaan.model.Barang


class ListBarangAdapter(private val listBarang: ArrayList<Barang>): RecyclerView.Adapter<ListBarangAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvNameFolder: TextView = itemView.findViewById(R.id.nameFolder)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_barang, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val charBarang = listBarang[position]

        holder.tvNameFolder.text = charBarang.nameFolder

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener{
            val moveDetail = Intent(mContext, BarangActivity::class.java)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return listBarang.size
    }

}
