package com.faridwaid.barangdanpersediaan.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.cardview.widget.CardView
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.faridwaid.barangdanpersediaan.R
import com.faridwaid.barangdanpersediaan.fragment.*
import com.google.android.material.navigation.NavigationView

class UserActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        if(savedInstanceState == null) { // initial transaction should be wrapped like this
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, MenuFragment())
                .commitAllowingStateLoss()
        }

        drawerLayout = findViewById(R.id.drawerLayout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {

            it.isChecked = true

            when(it.itemId){
                R.id.menu_utama -> replaceFragment(MenuFragment(), "Toko Utama")
                R.id.barang -> replaceFragment(BarangFragment(), it.title.toString())
                R.id.dokumen -> replaceFragment(DokumenFragment(), it.title.toString())
                R.id.biaya -> Toast.makeText(applicationContext, "Menu Biaya", Toast.LENGTH_SHORT).show()
                R.id.laporan -> replaceFragment(LaporanFragment(), it.title.toString())
                R.id.pemasok -> replaceFragment(PemasokFragment(), it.title.toString())
                R.id.pelanggan -> Toast.makeText(applicationContext, "Menu Pelanggan", Toast.LENGTH_SHORT).show()
                R.id.toko -> replaceFragment(TokoFragment(), it.title.toString())
                R.id.pengaturan -> replaceFragment(PengaturanFragment(), it.title.toString())
                R.id.pertanyaan -> Toast.makeText(applicationContext, "Menu Pertanyaan", Toast.LENGTH_SHORT).show()
                R.id.bantuan -> Toast.makeText(applicationContext, "Menu Bantuan", Toast.LENGTH_SHORT).show()
                R.id.fitur -> Toast.makeText(applicationContext, "Menu Fitur", Toast.LENGTH_SHORT).show()
            }

            true

        }
    }

    private fun replaceFragment(fragment: Fragment, title: String){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
        drawerLayout.closeDrawers()
        setTitle(title)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (toggle.onOptionsItemSelected(item)) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }

}