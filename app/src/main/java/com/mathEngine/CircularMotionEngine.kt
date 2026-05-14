package com.mathEngine

import androidx.compose.ui.geometry.Offset
import kotlin.math.cos;
import kotlin.math.sin;

class CircularMotionEngine {

   private var speed = 0.02f
   private var radius = 100f
   private var angle = 0.0f
   private var x = 0.0f
   private var y = 0.0f


    fun nextStep(cx: Float, cy: Float): Offset {
        angle += speed
        x = cx + radius * cos(angle)
        y = cy + radius * sin(angle)
        return Offset(x, y)
    }
}