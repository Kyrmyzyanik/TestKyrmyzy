package com.example.testkyrmyzy.ui.navigation

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    object MovieDetailScreen : Screen("movie_detail")
}

