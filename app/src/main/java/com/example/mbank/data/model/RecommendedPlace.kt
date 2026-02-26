package com.example.mbank.data.model

import androidx.annotation.DrawableRes

data class RecommendedPlace(
    val id: Int,
    val name: String,
    val description: String,
    @DrawableRes val imageResource: Int,
    val category: PlaceCategory
)
