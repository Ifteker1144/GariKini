package com.example.garikini.model

object AdminData {
    const val DEFAULT_EMAIL = "admin@garikini.com"
    const val DEFAULT_PASSWORD = "admin1234"
}

data class VehicleModel(
    val id: String,
    val name: String,
    val category: String,
    val description: String,
    val imageResId: Int
)