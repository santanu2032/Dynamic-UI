package com.mathEngine.CME.UI

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
import androidx.compose.ui.zIndex
import com.mathEngine.CME.CircularMotionEngine
import kotlinx.coroutines.delay

@Composable
  fun OnDrawCustomCircle(engine: CircularMotionEngine)
    {

      var cx=0f
      var cy=0f
      var a by remember { mutableStateOf(Offset.Zero) }
      BoxWithConstraints(modifier = Modifier.fillMaxSize()) {

        cx= constraints.maxWidth/2f
        cy=constraints.maxHeight/2f
        LaunchedEffect(cx,cy) {
          while (true) {
            val point=engine.nextStep(cx,cy)
            a = Offset(point.x, point.y)
            delay(16)
          }
        }

        ///the draw logic


        Canvas(modifier = Modifier.fillMaxSize().zIndex(0f)) {
          drawCircle(
            color= Color.White,
            radius = 4f,
            center=a
          )
          drawCircle(Color.Black,
          radius=149f
          )
        }


      }


    }
