package com.mathEngine.CME


import kotlin.math.cos
import kotlin.math.sin

data class MathPoint(val x: Float, val y: Float)
class CircularMotionEngine {

   private var speed = 0.02f
   private var radius = 150f
   private var angle = 0.0f
   private var x = 0.0f
   private var y = 0.0f


    fun nextStep(cx: Float, cy: Float): MathPoint {
        angle += speed
        x = cx + radius * cos(angle)
        y = cy + radius * sin(angle)
        return MathPoint(x, y)
    }
}