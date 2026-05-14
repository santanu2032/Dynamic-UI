package com.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.android.awaitFrame
import kotlin.math.sqrt

@Composable
fun BackgroundUI() {
    val centerX = 1000f
    val centerY = 1000f

    // Each star: [x, y, speed]
    val stars = remember {
        mutableStateListOf(*Array(100) {
            floatArrayOf(
                (0..2000).random().toFloat(),
                (0..2000).random().toFloat(),
                (2..6).random().toFloat()
            )
        })
    }

    // Animation loop — runs every frame
    LaunchedEffect(Unit) {
        while (true) {
            withFrameMillis {
                for (i in stars.indices) {
                    val star = stars[i]
                    val dx = star[0] - centerX
                    val dy = star[1] - centerY
                    val dist = sqrt(dx * dx + dy * dy)

                    if (dist < 10f) {
                        // Star reached center — reset to random edge
                        stars[i] = floatArrayOf(
                            (0..2000).random().toFloat(),
                            (0..2000).random().toFloat(),
                            star[2]
                        )
                    } else {
                        // Move star toward center
                        val ratio = star[2] / dist
                        stars[i] = floatArrayOf(
                            star[0] - dx * ratio,
                            star[1] - dy * ratio,
                            star[2]
                        )
                    }
                }
            }
        }
    }

    Canvas(modifier = Modifier.fillMaxSize().background(Color.Black)) {
        val scaleX = size.width / 2000f
        val scaleY = size.height / 2000f
        stars.forEach { star ->
            drawCircle(
                color = Color.White.copy(alpha = 0.5f),
                radius = 4f,
                center = Offset(star[0] * scaleX, star[1] * scaleY)
            )

        }
    }
}