package com.example.garikini.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val CategoryHeaderGreen = Color(0xFF005B52)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen(onBackClick: () -> Unit) {
    val categories = listOf(
        "All Ads",
        "Top Urgent",
        "Light Vehicles",
        "Heavy Vehicles",
        "Heavy & Equipment Vehicles",
        "Motorbike",
        "Bicycle",
        "Auto CNG",
        "Paddle Rickshaw",
        "Paddle Van"
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("GariKini", color = Color.White, fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back", tint = Color.White)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = CategoryHeaderGreen)
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .background(Color(0xFFE0E0E0))
                .padding(16.dp)
        ) {
            Text(
                text = "Pick a Category",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 12.dp)
            )

            LazyColumn(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                items(categories) { category ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { onBackClick() },
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFD9D9D9)),
                        shape = RoundedCornerShape(4.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            Text(
                                text = category,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF4A4A4A)
                            )
                        }
                    }
                }
            }
        }
    }
}