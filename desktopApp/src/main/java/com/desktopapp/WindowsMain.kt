package com.desktopapp
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.desktopapp.Presentation.CommonUI.MainScreen
import com.desktopapp.Presentation.CommonUI.StartScreen
import com.desktopapp.Presentation.CommonUI.mainScreenUI.LocalDomain.Worker
import kotlinx.coroutines.delay
import androidx.compose.ui.graphics.Color


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Codex Vanguard"
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.Black
        ) {
            var showMainScreen by remember { mutableStateOf(false) }
            val link = remember { Worker() }
            var boxOneStatus by remember { mutableStateOf(true) }

            LaunchedEffect(Unit) {
                delay(5000)
                showMainScreen = true
            }

            if (showMainScreen) {
                MainScreen(link)
            } else {
                StartScreen()
            }
        }
    }
}