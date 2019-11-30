package com.example.gallo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gallo.Data.WarungData
import com.example.gallo.adapter.WarungAdapter
import com.example.gallo.model.Warung

class MainActivity : AppCompatActivity() {
    private lateinit var rvWarung : RecyclerView
    private var list : ArrayList<Warung> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvWarung = findViewById(R.id.rvWarung)
        rvWarung.setHasFixedSize(true)

        list.addAll(WarungData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvWarung.layoutManager = LinearLayoutManager(this)
        val listWarungAdapter = WarungAdapter(list)
        rvWarung.adapter = listWarungAdapter
    }
}
