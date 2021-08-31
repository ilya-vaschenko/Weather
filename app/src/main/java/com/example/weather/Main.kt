package com.example.weather

fun main() {
    val test : String = "Test"
    println()

    Repository.weatherList.forEach {
        println(it.town)
    }
}