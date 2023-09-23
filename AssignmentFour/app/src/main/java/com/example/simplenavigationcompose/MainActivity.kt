package com.example.simplenavigationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.simplenavigationcompose.ui.navigation.NavGraph
import com.example.simplenavigationcompose.ui.theme.SimpleNavComposeAppTheme

class  MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Preview
@Composable
private fun MainScreen() {
    SimpleNavComposeAppTheme {
        val navController = rememberNavController()
        NavGraph(navController)
    }
}
