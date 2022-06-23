package com.faridwaid.barangdanpersediaan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.faridwaid.barangdanpersediaan.adapter.ViewPagerAdapter
import com.faridwaid.barangdanpersediaan.model.DataViewPager
import me.relex.circleindicator.CircleIndicator3
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private var arrayData = ArrayList<DataViewPager>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataViewPager: ViewPager2 = findViewById(R.id.view_pager)
        val indicator: CircleIndicator3 = findViewById(R.id.indicator)

        val listData1 = DataViewPager()
        listData1.text1 = "Selamat Datang\n Silahkan, ikuti panduan ini untuk memulai dengan cepat."
        listData1.text2 = "Anda dapat mengubah parameter apa pun nanti di 'Pengaturan' "
        arrayData.add(listData1)

        val listData2 = DataViewPager()
        listData2.text1 = "Pilih properti barang yang ingin anda gunakan"
        listData2.text2 = "Jumlah digit setelah desimal untuk 'kuantitas'"
        arrayData.add(listData2)

        val listData3 = DataViewPager()
        listData3.text1 = "Pilih tampilan default"
        listData3.text2 = ""
        arrayData.add(listData3)

        val listData4 = DataViewPager()
        listData4.text1 = "Aplikasi ini mengizinkan impor dan ekspor ke/dari Excel"
        listData4.text2 = "PENTING:"
        arrayData.add(listData4)

        val listData5 = DataViewPager()
        listData5.text1 = "Jika Anda ingin memindai kode barkode, kami memiliki beberapa tipe alat pemindai"
        listData5.text2 = "Anda dapat memilih tipe pemindai yang paling sesuai dengan perangkat Anda"
        arrayData.add(listData5)

        val listData6 = DataViewPager()
        listData6.text1 = "Apakah anda ingin menggunakan Harga Jual dan Harga Beli untuk barang Anda"
        listData6.text2 = ""
        arrayData.add(listData6)

        val adapter = ViewPagerAdapter(arrayData)
        dataViewPager.adapter = adapter

        dataViewPager.offscreenPageLimit = 3
        dataViewPager.getChildAt(0)
        dataViewPager.overScrollMode = RecyclerView.OVER_SCROLL_NEVER

        indicator.setViewPager(dataViewPager)

    }
}