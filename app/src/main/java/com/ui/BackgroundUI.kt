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
import com.mathEngine.ParticleSystem
import kotlinx.coroutines.delay
@Composable
fun BackgroundUI() {

    var enginePS by remember { mutableStateOf(ParticleSystem()) }
    var frameTick by remember { mutableStateOf(0) }

    // Animation loop — runs every frame
    LaunchedEffect(Unit) {//this block has been handed down to an independent background thread
        while (true) {
            withFrameMillis {
              enginePS.startParticleSystem()
                frameTick++
            }
        }
    }

    Canvas(modifier = Modifier.fillMaxSize().background(Color.Black)) {//draw the falling star effect
        val scaleX = size.width / 2000f
        val scaleY = size.height / 2000f
        val currentTick=frameTick
        enginePS.stars.forEach {
            drawCircle(
                color = Color.White.copy(alpha = 0.5f),
                radius = 2f,
                center = Offset(
                    x = it[0] * scaleX,
                    y = it[1] * scaleY
                )
            )
        }

        }
    }
