package com.mathEngine

import kotlin.math.sqrt
import com.mathEngine.getScreenCenter
class ParticleSystem()
{
    val centerX = 1000f
    val centerY = 1000f

    val stars: Array<FloatArray> = Array(100){/*
   * The current position=(x,y) which is corresponding to x->star[0] & y-> star[1],
   * The velocity v of the particle is star[2]
   * The target center c=(xc,yc)
     */
        floatArrayOf(
            (0..2000).random().toFloat(),// for x
            (0..2000).random().toFloat(),//for y
            (0..6).random().toFloat()//for velocity
        )
    }

    fun startParticleSystem(){
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
                val ratio = star[2] / dist//scaling factor
                stars[i] = floatArrayOf(
                    star[0] - (dx * ratio),// calculating the position x toward center, here (dx * ratio) is the  distance to move along x-axis during a single frame
                    star[1] - (dy * ratio),// calculating the position y toward center, here (dy * ratio) is the distance to move along y-axis during a single frame
                    star[2]
                )
            }
        }
    }

}