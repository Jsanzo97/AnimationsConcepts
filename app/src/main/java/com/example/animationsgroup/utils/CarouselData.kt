package com.example.animationsgroup.utils

import com.example.animationsgroup.R

class CarouselData {

    companion object {
        val data = listOf(
            Value("Barbarian 1", R.drawable.barbarian_1),
            Value("Barbarian 2", R.drawable.barbarian_2),
            Value("Barbarian 3", R.drawable.barbarian_3),
            Value("Barbarian 4", R.drawable.barbarian_4),
            Value("Barberian 5", R.drawable.barbarian_5)
        )
    }
}

data class Value(
    val title: String,
    val image: Int
)