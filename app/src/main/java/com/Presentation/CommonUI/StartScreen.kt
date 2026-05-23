package com.Presentation.CommonUI
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
import com.mathEngine.CME.CircularMotionEngine
import com.mathEngine.CME.UI.OnDrawCustomCircle
import com.mathEngine.CME.getScreenCenter
import com.mathEngine.CME.UI.TrailUI

@Composable
fun StartScreen(){

    val circleEngine = remember { CircularMotionEngine() }
    val trail = remember { mutableStateListOf<Offset>() }
    val center= getScreenCenter()
    val centerX=center.x
    val centerY=center.y

    Box(modifier = Modifier.fillMaxSize().onSizeChanged { size ->
       val center = Offset(
            x = size.width / 2f,
            y = size.height / 2f
        )
       },
        contentAlignment = Alignment.Center) {


        BackgroundUI()
        LaunchedEffect(circleEngine) {
            while (true) {
                withFrameMillis {
                    val mathResult=circleEngine.nextStep(cx = centerX, cy = centerY)
                    val currentPos = Offset(mathResult.x,mathResult.y) // update and get current point position

                    trail.add(currentPos)
                    if (trail.size > 65) trail.removeAt(0) // keep last 30 positions
                }
            }
        }


        TrailUI(positions = trail)
        OnDrawCustomCircle(engine = circleEngine)//point on the circumference call fun


    }
    Box(modifier = Modifier.fillMaxSize()){
        //add the logo here

        //example you can add the customer preff. here
        Text(
            text = "Codex Vanguard",
            Modifier.align(Alignment.Center).padding(start = 50.dp, top = 60.dp, end = 50.dp, bottom = 60.dp),
            color=Color.White,



            )

        Text(
            text = "SANTANU SARKAR",
            Modifier.align(Alignment.BottomCenter).padding(bottom = 50.dp),
            color=Color.White
        )
    }
}


