package com.example.testkyrmyzy.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.testkyrmyzy.ui.screens.VxDetailScreen
import com.example.testkyrmyzy.ui.screens.VxHomeScreen

@Composable
fun SetUpNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(route = Screen.HomeScreen.route) {
            VxHomeScreen(navController)
        }
        composable(route = Screen.MovieDetailScreen.route) {
            VxDetailScreen(navController)
        }
    }
}

