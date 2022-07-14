package com.faridwaid.barangdanpersediaan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.faridwaid.barangdanpersediaan.R
import com.faridwaid.barangdanpersediaan.model.DataViewPager
import com.squareup.picasso.Picasso

class ViewPagerAdapter (private val listData: List<DataViewPager>): RecyclerView.Adapter<ViewPagerAdapter.DataViewHolder>() {

    // Membuat class DataViewHolder yang digunakan untuk set view yang akan ditampilkan,
    inner class DataViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textView1: TextView = itemView.findViewById(R.id.textView1)
        val textView2: TextView = itemView.findViewById(R.id.textView2)
        val textView3: TextView = itemView.findViewById(R.id.textView3)
        val textView4: TextView = itemView.findViewById(R.id.textView4)
        val textView5: TextView = itemView.findViewById(R.id.textView5)
        val textViewButton: TextView = itemView.findViewById(R.id.textToButton)
        val textViewButtonYes: TextView = itemView.findViewById(R.id.textButtonYes)
        val textViewButtonNo: TextView = itemView.findViewById(R.id.textButtonNo)
        val textConstrains1: TextView = itemView.findViewById(R.id.textConstraint1)
        val button1: TextView = itemView.findViewById(R.id.textConstraint2)
        val button2: TextView = itemView.findViewById(R.id.textConstraint3)
        val iconImage: ImageView = itemView.findViewById(R.id.iconImage)
        val iconImage2: ImageView = itemView.findViewById(R.id.iconEditAttributes)
        val iconImage3: ImageView = itemView.findViewById(R.id.iconEditAttributes2)
        val iconImage4: ImageView = itemView.findViewById(R.id.iconEditAttributes3)
        val primeImage: ImageView = itemView.findViewById(R.id.primeImage)
        fun bind(dataViewPager: DataViewPager){
            with(itemView){
                textView1.text = "${dataViewPager.text1}"
                textView2.text = "${dataViewPager.text2}"
                textView3.text = "${dataViewPager.text3}"
                textView4.text = "${dataViewPager.text4}"
                textView5.text = "${dataViewPager.text5}"
                textViewButton.text = "${dataViewPager.textToButton}"
                textViewButtonYes.text = "${dataViewPager.textToButtonYes}"
                textViewButtonNo.text = "${dataViewPager.textToButtonNo}"
                textConstrains1.text = "${dataViewPager.textConstraint1}"
                button1.text = "${dataViewPager.button1}"
                button2.text = "${dataViewPager.button2}"
                Glide.with(itemView.context)
                    .load(dataViewPager.image)
                    .apply(RequestOptions().override(200,200))
                    .into(iconImage)
                Glide.with(itemView.context)
                    .load(dataViewPager.iconImage)
                    .apply(RequestOptions().override(30,30))
                    .into(iconImage2)
                Glide.with(itemView.context)
                    .load(dataViewPager.iconImage2)
                    .apply(RequestOptions().override(30,30))
                    .into(iconImage3)
                Glide.with(itemView.context)
                    .load(dataViewPager.iconImage3)
                    .apply(RequestOptions().override(30,30))
                    .into(iconImage4)
                Glide.with(itemView.context)
                    .load(dataViewPager.primeImage)
                    .apply(RequestOptions().override(500,500))
                    .into(primeImage)
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