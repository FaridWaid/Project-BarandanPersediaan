package com.faridwaid.barangdanpersediaan.model

object DataBarang {

    private val charBarangs = arrayOf("Obat Harian",
        "Obat Mingguan",
        "Vaksin WB",
        "Vaksin Pencegah",
        "Vaksin Penyembuh",
        "Sanitasi",
        "Biosecurity",
        "Food")

    val listData: ArrayList<Barang>
        get() {
            val list = arrayListOf<Barang>()
            for (position in charBarangs.indices) {
                val charBarang = Barang()
                charBarang.nameFolder = charBarangs[position]
                list.add(charBarang)
            }
            return list
        }

}