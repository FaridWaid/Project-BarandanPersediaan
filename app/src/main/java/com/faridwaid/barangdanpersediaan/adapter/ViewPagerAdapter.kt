package com.faridwaid.barangdanpersediaan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.faridwaid.barangdanpersediaan.R
import com.faridwaid.barangdanpersediaan.model.DataViewPager
import com.squareup.picasso.Picasso

class ViewPagerAdapter (private val listData: List<DataViewPager>): RecyclerView.Adapter<ViewPagerAdapter.DataViewHolder>() {

    // Membuat class PostViewHolder yang digunakan untuk set view yang akan ditampilkan,
    inner class DataViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textView1: TextView = itemView.findViewById(R.id.textView1)
        val textView2: TextView = itemView.findViewById(R.id.textView2)
        val iconImage: ImageView = itemView.findViewById(R.id.iconImage)
        fun bind(dataViewPager: DataViewPager){
            with(itemView){
                textView1.text = "${dataViewPager.text1}"
                textView2.text = "${dataViewPager.text2}"
//                Picasso.get().load(dataViewPager.image).into(iconImage)
            }
        }
    }

    // Menentukan layout yang akan ditampilkan dalam recyclerview
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false)
        return DataViewHolder(view)
    }

    // Mendapatkan jumlah data dari list
    override fun getItemCount(): Int = listData.size

    // Memasukkan data ke dalam list recyclerview seasui dengan posisi/position,
    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(listData[position])
    }

}