package com.example.testkyrmyzy.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.testkyrmyzy.ui.navigation.Screen

@Composable
fun VxDetailScreen(navController: NavController) {
    val homeScreenScrollState = rememberScrollState()

    Scaffold(
        modifier = Modifier.background(Color.Yellow),
        content = { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .background(Color.Green)
            ) {
                Column(
                    modifier = Modifier
                        .verticalScroll(homeScreenScrollState)
                        .background(Color.Cyan)
                        .fillMaxSize()
                ) {
                    Text(
                        text = "Detail Screen",
                        modifier = Modifier
                            .background(Color.Magenta)
                            .padding(16.dp)
                    )

                    Button(
                        onClick = {navController.popBackStack()},
                        modifier = Modifier.align(Alignment.End)
                    ) {
                        Text(text = "to back screen")
                    }
                }
            }
        }
    )
}