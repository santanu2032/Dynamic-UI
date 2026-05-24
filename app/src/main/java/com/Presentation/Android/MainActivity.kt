package com.presentation.android

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
import com.Presentation.CommonUI.StartScreen
import com.Presentation.CommonUI.MainScreen
import com.Presentation.CommonUI.mainScreenUI.LocalDomain.Worker
import kotlinx.coroutines.delay


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color.Black
            ) {
                var showMainScreen by remember { mutableStateOf(false) }
                val Link = remember { Worker() }

                LaunchedEffect(Unit) {
                    delay(5000)
                    showMainScreen = true
                }

                if (showMainScreen) {
                    MainScreen(Link)
                } else {
                    StartScreen()
                }
            }

            var boxOneStatus by remember { mutableStateOf(true) }
        }
    }
}