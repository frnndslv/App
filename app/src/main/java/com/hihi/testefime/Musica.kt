package com.hihi.testefime

data class Musica(
    val musica : String,
    val imagem : String,
    val artista : String

)
val musicas = listOf(

        Musica("Tausen years","tttt.jpg", "bela do crepusculo" ),
        Musica("Mine filds","tttt..jpg", "Fayusia"),
        Musica("Meteoro" , "tttt..jpg", "Luan santana")


    )
    //reciclevilMusicas.adapter = MusicaAdapter(musicas)