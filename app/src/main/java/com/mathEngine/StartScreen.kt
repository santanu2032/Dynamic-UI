package com.mathEngine
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.withFrameMillis
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.dp
import com.ui.BackgroundUI
import com.ui.TrailUI

@Composable
fun StartScreen(){

    val circleEngine = remember { CircularMotionEngine() }
    val trail = remember { mutableStateListOf<Offset>() }
    val center=getScreenCenter()
    val centerX=center.x
    val centerY=center.y

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {


        BackgroundUI()
        LaunchedEffect(circleEngine) {
            while (true) {
                withFrameMillis {
                    val currentPos = circleEngine.nextStep(centerX,centerY) // update and get current point position
                    trail.add(currentPos)
                    if (trail.size > 30) trail.removeAt(0) // keep last 30 positions
                }
            }
        }
        TrailUI(positions = trail)
        onDrawCustomCircle(engine = circleEngine)//point on the circumference call fun

        //add the logo here

        //example you can add the customer preff. here
        Text(
            text = "SANTANU SARKAR",
            Modifier.align(Alignment.BottomCenter).padding(bottom = 50.dp),
            color=Color.White
        )
    }
}


