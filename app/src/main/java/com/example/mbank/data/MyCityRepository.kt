package com.example.mbank.data

import com.example.mbank.R
import com.example.mbank.data.model.PlaceCategory
import com.example.mbank.data.model.RecommendedPlace

class MyCityRepository {

    private val places = listOf(
        RecommendedPlace(
            id = 1,
            name = "Talas arc",
            description = "An arc located in the city starting point.",
            imageResource = R.drawable.arc,
            category = PlaceCategory.MOUNTAINS
        ),
        RecommendedPlace(
            id = 2,
            name = "Beshtash Lake",
            description = "A large lake surrounded by mountains, perfect for hiking and nature lovers.",
            imageResource = R.drawable.beshtash,
            category = PlaceCategory.VIEW
        ),
        RecommendedPlace(
            id = 3,
            name = "Beshtash Lake",
            description = "A large lake surrounded by mountains, perfect for hiking and nature lovers.",
            imageResource = R.drawable.beshtashlake,
            category = PlaceCategory.VIEW
        ),
        RecommendedPlace(
            id = 4,
            name = "Center",
            description = "The central area of the city.",
            imageResource = R.drawable.center,
            category = PlaceCategory.PARKS
        ),
        RecommendedPlace(
            id = 5,
            name = "Manas Kumbozu",
            description = "The Manas Kumbozu is a great building in the city .",
            imageResource = R.drawable.manas_kumbozu,
            category = PlaceCategory.BUILDINGS
        ),
        RecommendedPlace(
            id = 6,
            name = "Manas",
            description = "A beautiful building in the city.",
            imageResource = R.drawable.manas,
            category = PlaceCategory.BUILDINGS
        ),
        RecommendedPlace(
            id = 7,
            name = "Talas Daamy",
            description = "Talas Daamy is a beautiful net of caffees where you can enjoy delicious coffee and snacks.",
            imageResource = R.drawable.orig,
            category = PlaceCategory.BUILDINGS
        ),
        RecommendedPlace(
            id = 8,
            name = "Beshtash Lake",
            description = "A large lake surrounded by mountains, perfect for hiking and nature lovers.",
            imageResource = R.drawable.beshtashlake,
            category = PlaceCategory.VIEW
        )
    )


    fun getCategories(): List<PlaceCategory> = PlaceCategory.entries

    fun getPlacesByCategory(category: PlaceCategory): List<RecommendedPlace> {
        return places.filter { it.category == category }
    }

    fun getPlaceById(placeId: Int): RecommendedPlace? = places.find { it.id == placeId }
}
