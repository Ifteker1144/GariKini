package com.example.garikini

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.garikini.ui.*
import com.example.garikini.ui.theme.GariKiniTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GariKiniTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation()
                }
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        // Login Screen
        composable("login") {
            LoginScreen(
                onLoginSuccess = {
                    navController.navigate("home") {
                        popUpTo("login") { inclusive = true }
                    }
                }
            )
        }

        // Home Screen
        composable("home") {
            HomeScreen(
                onVehicleClick = { vehicleId ->
                    navController.navigate("detail/$vehicleId")
                },
                onCategoryClick = {
                    navController.navigate("category")
                },
                onBimanTicketClick = {
                    navController.navigate("biman_ticket")
                },
                onLogoClick = {
                    // Refresh or remain on Home
                    navController.navigate("home") {
                        popUpTo("home") { inclusive = true }
                    }
                },
                onNavClick = { tab ->
                    when (tab) {
                        "Home" -> navController.navigate("home")
                        "Search" -> navController.navigate("search")
                        "Post" -> navController.navigate("post")
                        "Chats" -> navController.navigate("chats")
                        "Profile" -> navController.navigate("profile")
                    }
                },
                currentTab = "Home"
            )
        }

        // Category Screen
        composable("category") {
            CategoryScreen(onBackClick = { navController.popBackStack() })
        }

        // Biman E-Ticket Screen
        composable("biman_ticket") {
            SimpleScreen(title = "Biman E-Ticket", currentTab = "Home", onNavClick = { tab -> handleNav(navController, tab) })
        }

        // Search Screen
        composable("search") {
            SimpleScreen(title = "Search Vehicles", currentTab = "Search", onNavClick = { tab -> handleNav(navController, tab) })
        }

        // Post Screen
        composable("post") {
            SimpleScreen(title = "Create Post / Add Listing", currentTab = "Post", onNavClick = { tab -> handleNav(navController, tab) })
        }

        // Chats Screen
        composable("chats") {
            SimpleScreen(title = "Messages & Chats", currentTab = "Chats", onNavClick = { tab -> handleNav(navController, tab) })
        }

        // Profile Screen
        composable("profile") {
            SimpleScreen(title = "User Profile & Settings", currentTab = "Profile", onNavClick = { tab -> handleNav(navController, tab) })
        }

        // Vehicle Detail Screen
        composable(
            route = "detail/{vehicleId}",
            arguments = listOf(navArgument("vehicleId") { type = NavType.StringType })
        ) { backStackEntry ->
            val vehicleId = backStackEntry.arguments?.getString("vehicleId") ?: ""
            DetailScreen(
                vehicleId = vehicleId,
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}

private fun handleNav(navController: androidx.navigation.NavController, tab: String) {
    when (tab) {
        "Home" -> navController.navigate("home") { popUpTo("home") { inclusive = true } }
        "Search" -> navController.navigate("search")
        "Post" -> navController.navigate("post")
        "Chats" -> navController.navigate("chats")
        "Profile" -> navController.navigate("profile")
    }
}