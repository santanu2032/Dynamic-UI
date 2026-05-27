package com.sensoryunit.Audio.localDomain

import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin

data class WavePoint(val x: Float, val y: Float)

object Wave_Logic {
    fun generateJarvisWave(
        amplitude: Float,
        h: Float,
        k: Float,
        baseRadius: Float,
        freq: Float,
        step: Double = 2.0
    ): List<WavePoint> {
        val points = mutableListOf<WavePoint>()

        var degree = 0.0
        while (degree <= 360) {
            val theta = Math.toRadians(degree)

            val sinValue = sin(freq * theta)
            var r = baseRadius + (amplitude * sinValue.pow(3.0))
            val jitter = (amplitude * 0.1f) * sin(theta * 150)
            r += jitter

            val x = (h + r * cos(theta)).toFloat()
            val y = (k + r * sin(theta)).toFloat()

            points.add(WavePoint(x, y))
            degree += step
        }

        return points
    }
}