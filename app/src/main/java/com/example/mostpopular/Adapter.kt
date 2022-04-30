package com.example.mostpopular

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class Adapter (val articulos:List<Resultado>):RecyclerView.Adapter<MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MainViewHolder(layoutInflater.inflate(R.layout.item_articulo,parent,false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val articulo:Resultado = articulos.get(position)
        val item = articulos
        holder.render(articulo,position)
    }

    override fun getItemCount(): Int {
        return articulos.count()
    }

}

class MainViewHolder(val view: View) : RecyclerView.ViewHolder(view){
    fun render(articulos:Resultado, position: Int){

        view.findViewById<TextView>(R.id.title).text = articulos.title
        view.findViewById<TextView>(R.id.date).text = articulos.published_date
       val foto = view.findViewById<ImageView>(R.id.ivLogo)
        //Picasso.get().load(articulos.media[position].metadata[position].urlmetadata).into(foto)

        Picasso.get().load(articulos.media[0].metadata[0].urlmetadata).into(foto)


    }

}