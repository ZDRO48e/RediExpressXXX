package com.example.rediexpressxxx1.Domain

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.rediexpressxxx1.Data.Splash_Screen
import com.example.rediexpressxxx1.Presentation.OnBoarding1
import com.example.rediexpressxxx1.Presentation.SplashScreen
import kotlinx.coroutines.delay

@Composable
fun Navigation(pad : PaddingValues) {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Splash_Screen){
        composable<Splash_Screen>{
            SplashScreen(pad)
            LaunchedEffect(key1 = Unit) {
                delay(timeMillis = 2000L)
                navController.navigate(route = "second")
            }
        }
        composable(route = "second") {
            OnBoarding1(pad)
        }
    }
}