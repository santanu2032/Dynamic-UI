package com.desktopapp
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Codex Vanguard"
    ) {
        MaterialTheme {
            Column {
                Text("Welcome to Codex Vanguard on Windows!")

                Button(onClick = {
                    // Call your pure logic from the :shared module here!
                    // println(YourMathFunction())
                }) {
                    Text("Run Math Engine")
                }
            }
        }
    }
}