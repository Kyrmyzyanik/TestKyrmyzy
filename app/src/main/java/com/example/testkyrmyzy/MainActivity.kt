package com.example.testkyrmyzy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.testing.TestNavHostController
import com.example.testkyrmyzy.ui.navigation.SetUpNavGraph
import com.example.testkyrmyzy.ui.screens.VxHomeScreen
import com.example.testkyrmyzy.ui.theme.TestKyrmyzyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            navController = rememberNavController()
            TestKyrmyzyTheme(darkTheme = true) {
                SetUpNavGraph(navController = navController)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
//    VxHomeScreen()
    val navController = TestNavHostController(LocalContext.current)
    VxHomeScreen(navController)
}