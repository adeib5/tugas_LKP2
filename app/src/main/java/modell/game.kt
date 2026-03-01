package com.example.praktam2.model
import androidx.annotation.DrawableRes
data class Game(
    val nama: String,
    val deskripsi: String,
    val tahun: Int,
    @DrawableRes val imageRes: Int
)