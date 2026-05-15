package com.ui



import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap

@Composable
fun TrailUI(
    modifier: Modifier = Modifier,
    positions: List<Offset>,
    trailColor: Color = Color.White
) {
    Canvas(modifier = modifier) {
        if (positions.size < 2) return@Canvas

        val total = positions.size

        for (i in 1 until total) {
            // Closer to the end = brighter, closer to start = more faded
            val alpha = i.toFloat() / total.toFloat()

            drawLine(
                color = trailColor.copy(alpha = alpha),
                start = positions[i - 1],//length of the trail
                end = positions[i],
                strokeWidth = alpha * 6f, // line gets thicker toward the tip
                cap = StrokeCap.Round
            )
        }
    }
}