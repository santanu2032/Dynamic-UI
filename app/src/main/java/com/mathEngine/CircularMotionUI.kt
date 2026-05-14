package com.mathEngine

import android.R
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.delay

@Composable
  fun onDrawCustomCircle(engine: CircularMotionEngine)
    {

      var cx=0f
      var cy=0f
      var a by remember { mutableStateOf(Offset.Zero) }
      BoxWithConstraints(modifier = Modifier.fillMaxSize()) {

        cx= constraints.maxWidth/2f
        cy=constraints.maxHeight/2f
        LaunchedEffect(cx,cy) {
          while (true) {
            a = engine.nextStep(cx, cy)
            delay(16)
          }
        }

        ///the draw logic


        Canvas(modifier = Modifier.fillMaxSize()) {
          drawCircle(
            color= Color.White,
            radius = 10f,
            center=a
          )
          drawCircle(Color.Black,
          radius=90f
          )
        }


      }


    }
