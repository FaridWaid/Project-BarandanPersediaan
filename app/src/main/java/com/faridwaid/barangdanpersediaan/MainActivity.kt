package com.faridwaid.barangdanpersediaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.faridwaid.barangdanpersediaan.activity.UserActivity
import com.faridwaid.barangdanpersediaan.adapter.ViewPagerAdapter
import com.faridwaid.barangdanpersediaan.model.DataViewPager
import me.relex.circleindicator.CircleIndicator3
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private var arrayData = ArrayList<DataViewPager>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val dataViewPager: ViewPager2 = findViewById(R.id.view_pager)
        val indicator: CircleIndicator3 = findViewById(R.id.indicator)
        val nextButton: ImageView = findViewById(R.id.nextButton)
        val skipButton: ImageView = findViewById(R.id.skipButton)

        val listData1 = DataViewPager()
        listData1.text1 = "Selamat datang!\n Silahkan, ikuti panduan ini untuk memulai dengan cepat.\n\n Anda dapat mengubah parameter apa pun nanti di 'Pengaturan' "
        listData1.text2 = ""
        listData1.image = R.drawable.packages
        arrayData.add(listData1)

        val listData2 = DataViewPager()
        listData2.text1 = "Pilih properti barang yang ingin anda gunakan:"
        listData2.text2 = "Jumlah digit setelah desimal untuk 'kuantitas': \n 0"
        listData2.text3 = "Nama"
        listData2.text4 = "Kode barcode"
        listData2.text5 = "Deskripsi"
        listData2.iconImage = R.drawable.checked
        listData2.iconImage2 = R.drawable.checked
        listData2.iconImage3 = R.drawable.checked
        listData2.image = R.drawable.checklist
        arrayData.add(listData2)

        val listData3 = DataViewPager()
        listData3.textConstraint1 = "Pilih tampilan default:"
        listData3.text2 = ""
        listData3.button1 = "Daftar"
        listData3.button2 = "Kotak"
        listData3.primeImage = R.drawable.icon_image
        arrayData.add(listData3)

        val listData4 = DataViewPager()
        listData4.text1 = "Aplikasi ini mengizinkan impor dan ekspor ke/dari Excel\n\n PENTING:\n\n 1.Jika Anda ingin mengimpor tok awal barang - impor ke 'Dokumen Masuk'.\n\n 2.Jika Anda hanya ingin mengimpor daftar barang dan keterengannya tanpa jumlah - impor ke layar 'Barang'.\n\n 3.Anda dapat mengatur kolom di Excel melalui 'settings - Impor dan Ekspor'."
        listData4.image = R.drawable.excel_file
        arrayData.add(listData4)

        val listData5 = DataViewPager()
        listData5.text1 = "Jika Anda ingin memindai kode barkode, kami memiliki beberapa tipe alat pemindai\n\n Anda dapat memilih tipe pemindai yang paling sesuai dengan perangkat Anda\n\n"
        listData5.text2 = ""
        listData5.textToButton = "Coba Sekarang"
        listData5.text3 = "Kamera Seluler"
        listData5.iconImage = R.drawable.ic_arrow_down
        listData5.image = R.drawable.barcode
        arrayData.add(listData5)

        val listData6 = DataViewPager()
        listData6.text1 = "Apakah anda ingin menggunakan Harga Jual dan Harga Beli untuk barang Anda?"
        listData6.text2 = ""
        listData6.textToButtonYes = "IYA"
        listData6.textToButtonNo = "TIDAK"
        listData6.image = R.drawable.tag
        arrayData.add(listData6)

        val adapter = ViewPagerAdapter(arrayData)
        dataViewPager.adapter = adapter
        dataViewPager.offscreenPageLimit = 3
        dataViewPager.getChildAt(0)
        dataViewPager.overScrollMode = RecyclerView.OVER_SCROLL_NEVER

        // Ketika "buttonNext" diklik akan pindah ke data selanjutnya,
        // dan jika sudah berada pada data terakhir maka akan pindah activity ke LoginActivity
        // overridePendingTransition digunakan untuk animasi dari intent
        nextButton.setOnClickListener {
            if (dataViewPager.currentItem + 1 < adapter.itemCount){
                dataViewPager.currentItem += 1
            } else{
                // Pindah ke LoginActivity
                Intent(applicationContext, UserActivity::class.java).also {
                    startActivity(it)
                    overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
                    finish()
                }
            }
        }

        // Ketika "skipButton" diklik akan pindah activity ke UserActivity
        // overridePendingTransition digunakan untuk animasi dari intent
        skipButton.setOnClickListener {
            Intent(applicationContext, UserActivity::class.java).also {
                startActivity(it)
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
                finish()
            }
        }

        indicator.setViewPager(dataViewPager)

    }

}