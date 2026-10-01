package com.example.rediexpressxxx1

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
import androidx.compose.ui.tooling.preview.Preview
import com.example.rediexpressxxx1.Domain.Navigation
import com.example.rediexpressxxx1.Presentation.OnBoarding1
import com.example.rediexpressxxx1.Presentation.SplashScreen
import com.example.rediexpressxxx1.ui.theme.RediExpressXXX1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RediExpressXXX1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Navigation(pad = innerPadding)

                }
            }
        }
    }
}
