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
    LaunchedEffect(Unit) {/*
   * The current position=(x,y) which is corresponding to x->star[0] & y-> star[1],
   * The velocity v of the particle is star[2]
   * The target center c=(xc,yc)
     */
        while (true) {
            withFrameMillis {
                for (i in stars.indices) {
                    val star = stars[i]
                    val dx = star[0] - centerX//  calculating the delta x of the displacement vector
                    val dy = star[1] - centerY//  calculating the delta y of the displacement vector
                    val dist = sqrt((dx * dx) + (dy * dy))// calculate the mod of displacement vector's magnitude |D|

                    if (dist < 10f) {//  |D|<10 since the displacement of the particle has crossed the event horizon of Schwarzschild radius r=10f
                        // The Star reached center — reset to random edge
                        stars[i] = floatArrayOf(
                            (0..2000).random().toFloat(),
                            (0..2000).random().toFloat(),
                            star[2]
                        )
                    } else {// The particle has not reached the Schwarzschild radius r=10f
                        // Move star toward center
                        val ratio = star[2] / dist//scaling factor or a direction vector with a length of exactly 1 or a unit vector
                        stars[i] = floatArrayOf(
                            star[0] - (dx * ratio),// calculating the position x toward center, here (dx * ratio) is the actual distance from the center during a single frame
                            star[1] - (dy * ratio),// calculating the position y toward center, here (dy * ratio) is the actual distance from the center during a single frame
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