package com.mathEngine.CME.UI


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color

@Composable
fun SatellitePointUI(position: Offset){
    Canvas(modifier = Modifier.fillMaxSize()) {

        drawCircle(
            color=Color.Cyan,
            radius=8f,
            center=position
        )



    }

}