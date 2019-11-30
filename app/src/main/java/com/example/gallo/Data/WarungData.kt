package com.example.gallo.Data

import com.example.gallo.model.Warung

object WarungData{
    private val warungNames = arrayOf("Warung pintar","Warung bu Joko","Warung pak Aris")

    private val warungUrl = arrayOf("https://firebasestorage.googleapis.com/v0/b/gallo-648c8.appspot.com/o/Warung%2Fwarung%201.jpeg?alt=media&token=fbc1c89e-5fa2-49b4-8c65-cf19fc9277d9",
        "https://firebasestorage.googleapis.com/v0/b/gallo-648c8.appspot.com/o/Warung%2Fwaruing%202.jpg?alt=media&token=56b86529-1ac8-4675-ba3a-e30ede718da7",
        "https://firebasestorage.googleapis.com/v0/b/gallo-648c8.appspot.com/o/Warung%2Fwarung%203.jpg?alt=media&token=c6a2d495-523b-46d0-8fcd-fd3bf9e03e47")

    private val warungAlamat = arrayOf("Sukapura","Sukabirus","PBB")

    private val warungRating = intArrayOf(4,4,5)

    private val warungHarga = arrayOf("Rp. 20.000","Rp. 10.000","Rp. 5.000")

    val listData : ArrayList<Warung>
        get() {
            val list = arrayListOf<Warung>()
            for (position in warungNames.indices) {
                val warung = Warung()
                warung.name = warungNames[position]
                warung.url_photo = warungUrl[position]
                warung.alamat = warungAlamat[position]
                warung.rating = warungRating[position]
                warung.harga = warungHarga[position]
                list.add(warung)
            }
            return list
        }
}