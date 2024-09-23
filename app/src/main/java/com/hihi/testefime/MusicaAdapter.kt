package com.hihi.testefime

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MusicaAdapter (
    private val lista: List<Musica>

) : Adapter<MusicaAdapter.MusicaViewHolder>(){

    /*inner class MusicaViewHolder (val itemView: View): ViewHolder(itemView){
        private val letra : Button
        private val artista : TextView

        init{
            letra= itemView.findViewById(R.id.letrayears)
            artista = itemView.findViewById(R.id.artista)
        }*/
        inner class MusicaViewHolder (val itemView: View): ViewHolder(itemView){
            val imagem : ImageView
            val artista : TextView
            val musica : TextView

            init{
                musica = itemView.findViewById(R.id.musica)
                imagem = itemView.findViewById(R.id.imageView3)
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

    override fun onBindViewHolder(MusicaViewHolder: MusicaViewHolder, position: Int){
        val musica = lista[position]
        MusicaViewHolder.musica.text = musica.musica
        MusicaViewHolder.imagem.setImageResource(R.drawable.tttt) = musica.imagem
        MusicaViewHolder.artista.text = musica.artista

        reciclevilMusicas.layoutManager = LinearLayoutManager(this)






    }


}
