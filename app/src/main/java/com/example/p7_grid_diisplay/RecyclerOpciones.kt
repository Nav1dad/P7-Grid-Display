package com.example.p7_grid_diisplay

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecyclerOpciones(val context : Context, val list : List<Opciones>) : RecyclerView.Adapter<RecyclerOpciones.ViewHolder>(){

    inner class ViewHolder (view : View) : RecyclerView.ViewHolder(view){
        var cardView : CardView = view.findViewById(R.id.ci)
        var textView : TextView = view.findViewById(R.id.textView)
        var imageView : ImageView = view.findViewById(R.id.imageView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycleview, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(list[position].image)
        holder.textView.text = list[position].nombre

        // card
        holder.cardView.setOnClickListener{
            Toast.makeText(context, " ${list[position].nombre}", Toast.LENGTH_SHORT).show()
        }
    }
}