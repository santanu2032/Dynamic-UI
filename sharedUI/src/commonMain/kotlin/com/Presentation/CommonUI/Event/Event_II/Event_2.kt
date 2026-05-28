package com.Presentation.CommonUI.Event.Event_II


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.Presentation.CommonUI.Event.EventManager
import kotlin.math.round


@Composable
fun Event_2() {
    val manager= remember { EventManager() }//TODO use constructor later after the testing Phase
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {

        Box(modifier = Modifier
            .fillMaxWidth(0.32f)
            .fillMaxHeight(0.15f)
            .background(color = Color.White,shape = CircleShape)
            .align(Alignment.Center)
            .clickable{
                manager.updateEventTrigger1()
            }
            , contentAlignment = Alignment.Center
        ){
            Text("Test the AI button")
        }

    }
}