package com.example.weather

object Test {
    fun copy() = Repository.weatherList
    fun print() {
        println(copy())
    }
}