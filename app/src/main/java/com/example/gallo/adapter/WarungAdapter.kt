package com.example.gallo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.gallo.R
import com.example.gallo.model.Warung
import com.squareup.picasso.Picasso

class WarungAdapter(val listWarung: ArrayList<Warung>) : RecyclerView.Adapter<WarungAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_warung,parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listWarung.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val warung = listWarung[position]

        /*Glide.with(holder.itemView.context)
            .load(R.drawable.warung_1)
            .apply(RequestOptions().override(55, 55))
            .into(holder.IV)*/
        Picasso.get().load(warung.url_photo).into(holder.IV)
        holder.TVNama.text = warung.name
        holder.TVAlamat.text = warung.alamat
        holder.TVRating.text = warung.rating.toString()
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var IV : ImageView = itemView.findViewById(R.id.IV)
        var TVNama : TextView = itemView.findViewById(R.id.TVNama)
        var TVAlamat : TextView = itemView.findViewById(R.id.TVAlamat)
        var TVRating : TextView = itemView.findViewById(R.id.TVRating)
    }

}