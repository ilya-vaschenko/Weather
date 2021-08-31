package com.example.weather

object Repository {

    val weatherList : List<Weather> = listOf(
        Weather(),
        Weather("Моска", 26),
        Weather("Омск", 23),
        Weather("Тюмень", 22),
        Weather(temperature = 25, town = "Абакан"),

    )
}