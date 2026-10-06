package com.example.garikini.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleScreen(
    title: String,
    currentTab: String,
    onNavClick: (String) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(title) },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = GariKiniBlue, titleContentColor = androidx.compose.ui.graphics.Color.White)
            )
        },
        bottomBar = {
            GariKiniBottomNavigation(
                selectedTab = currentTab,
                onTabSelected = onNavClick
            )
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "$title Screen", style = MaterialTheme.typography.headlineMedium)
        }
    }
}