package com.example.listadealbuns

import androidx.annotation.DrawableRes

data class Albuns(
    var nome: String,
    var artista: String,
    var rating: Double,
    @DrawableRes var imagem: Int
)
