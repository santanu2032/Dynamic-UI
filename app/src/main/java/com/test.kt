package com

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.Presentation.CommonUI.Event.EventStatus
import com.Presentation.CommonUI.Event.Event_II.Event_2



@Preview
@Composable
fun Test(){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {

        Box(modifier = Modifier
            .fillMaxWidth(0.105f)
            .fillMaxHeight(0.08f)
            .background(color = Color.White,shape = CircleShape)
            .align(BiasAlignment(horizontalBias = 0.8f, verticalBias = 0.96f))
            .clickable{

            }
            , contentAlignment = Alignment.Center
        ){

            Text("Test the AI button")
        }


    }
}