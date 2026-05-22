package com.Presentation.Android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.Presentation.UI.StartScreen
import com.Presentation.UI.MainScreen
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.Companion.fillMaxSize(),
                color = Color.Companion.Black
            ) {
                var showMainScreen by remember { mutableStateOf(false) }

                LaunchedEffect(Unit) {
                    delay(5000)
                    showMainScreen = true
                }

                if (showMainScreen) {
                    MainScreen()
                } else {
                    StartScreen()
                }
            }
        }
    }
}