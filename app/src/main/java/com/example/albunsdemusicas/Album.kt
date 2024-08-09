package com.example.listadealbuns

import com.example.albunsdemusicas.R

class Datasource {
    fun obterAlbuns(): List<Albuns
            >{
        return listOf<Albuns>(
            Albuns("Electra Heart", "MARINA", 4.0, R.drawable.electra_heart),
            Albuns("Indigo", "RM", 5.0, R.drawable.indigo_rm),
            Albuns("Born to Die", "Lana del Rey", 5.0, R.drawable.born_to_die),
            Albuns("Campfire", "Rend Collective",3.0, R.drawable.rendcollective),
            Albuns("Rio", "Duran Duran", 3.0, R.drawable.rio),
            Albuns("Four", "One Direction", 4.0, R.drawable.four),
        )
    }
}