package com.hihi.testefime

import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MusicaAdapter (
    private val lista: List<String>

) : Adapter<MusicaAdapter.MusicaViewHolder>(){

    inner class MusicaViewHolder (val itemView: View): ViewHolder(itemView){
        private val letra : Button
        private val artista : TextView

        init{
            letra= itemView.findViewById(R.id.letra)
            artista = itemView.findViewById(R.id.artista)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicaViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.item_lista, parent, false)
        return MusicaViewHolder(itemView)

    }

    override fun getItemCount(): Int {


        return lista.size
    }

    override fun onBindViewHolder(holder: MusicaViewHolder, position: Int){


    }


}
