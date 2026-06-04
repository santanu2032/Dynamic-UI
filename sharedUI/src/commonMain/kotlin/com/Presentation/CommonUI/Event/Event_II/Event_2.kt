package com.Presentation.CommonUI.Event.Event_II


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.Presentation.CommonUI.Event.AppContainer
import com.Presentation.CommonUI.Event.ExecuteAudioIntent


@Composable
fun Event_2() {
    /** The Object will come from higher Classes **/
    ExecuteAudioIntent(
    manager = AppContainer.eventManager,
    platformLink = AppContainer.audioPlatformLink
)/***/
    val manager = AppContainer.eventManager

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
                manager.updateEventTrigger1()
            }
            , contentAlignment = Alignment.Center
        ){

            Text("Test the AI button")
        }


    }
}