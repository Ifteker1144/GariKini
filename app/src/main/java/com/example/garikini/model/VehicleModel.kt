package com.example.garikini.model

import com.example.garikini.R

object VehicleDataRepository {
    fun getVehicles(): List<VehicleModel> {
        return listOf(
            VehicleModel("1", "Honda Civic", "Sedan", "Sleek design with high-performance engine.", R.drawable.hondacivic),
            VehicleModel("2", "Honda Vezel", "SUV", "Compact crossover with high fuel efficiency.", R.drawable.hondavezel),
            VehicleModel("3", "Tata Harrier", "SUV", "Premium SUV with powerful diesel powertrain.", R.drawable.harrier),
            VehicleModel("4", "Tata Nexon", "Compact SUV", "5-Star safety rating with modern features.", R.drawable.tatanexon),
            VehicleModel("5", "Tata Altroz", "Hatchback", "Premium hatchback with top-tier safety.", R.drawable.altroz),
            VehicleModel("6", "Tata Tiago", "Hatchback", "Compact city car with stylish interior.", R.drawable.tiago),
            VehicleModel("7", "Yamaha Aerox 155", "Scooter", "Sports scooter with R15 engine technology.", R.drawable.aerox155),
            VehicleModel("8", "Yamaha RayZR 125", "Scooter", "Lightweight hybrid engine city scooter.", R.drawable.rayzr125),
            VehicleModel("9", "Yamaha Fascino", "Scooter", "Classic retro styled modern scooter.", R.drawable.newfascino),
            VehicleModel("10", "Tata Ace Gold", "Commercial", "Reliable mini truck for business delivery.", R.drawable.ace1),
            VehicleModel("11", "Tata Intra V30", "Commercial", "Heavy-duty pickup truck for industrial load.", R.drawable.intra1),
            VehicleModel("12", "Tata Yodha Pickup", "Commercial", "Rugged pickup for heavy goods transport.", R.drawable.yodha)
        )
    }
}