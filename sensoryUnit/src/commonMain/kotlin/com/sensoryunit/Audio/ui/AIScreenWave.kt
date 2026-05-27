package com.sensoryunit.Audio.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import com.sensoryunit.Audio.localDomain.Wave_Logic

@Composable
fun AIScreenWave(
    amplitude:  Float,              // caller owns this — UI just draws
    baseRadius: Float,
    freq:       Float,
    modifier:   Modifier = Modifier
) {
    Canvas(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        val cx = size.width  / 2f
        val cy = size.height / 2f

        val points = Wave_Logic.generateJarvisWave(
            amplitude  = amplitude,
            h          = cx,
            k          = cy,
            baseRadius = baseRadius,
            freq       = freq
        )

        val path = Path()
        points.forEachIndexed { i, p ->
            if (i == 0) path.moveTo(p.x, p.y)
            else        path.lineTo(p.x, p.y)
        }
        path.close()

        drawPath(
            path  = path,
            color = Color.Cyan,
            style = Stroke(width = 3f)
        )
    }
}