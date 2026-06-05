package com.Presentation.CommonUI.Event.Event_II


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.Presentation.CommonUI.Event.AppContainer
import com.Presentation.CommonUI.Event.ExecuteAudioIntent
import com.Presentation.CommonUI.values.SantanuCC


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
            .align(BiasAlignment(horizontalBias = 0.95f, verticalBias = 0.96f))
            .clickable{

            }
            , contentAlignment = Alignment.Center
        ){

            Text("Audio")
        }

        Box(modifier = Modifier
            .fillMaxWidth(0.105f)
            .fillMaxHeight(0.08f)
            .background(color = Color.White,shape = CircleShape)
            .align(BiasAlignment(horizontalBias = 0.65f, verticalBias = 0.96f))
            .clickable{

            }
            , contentAlignment = Alignment.Center
        ){

            Text("send")
        }

        TextField(//manual input
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(0.65f)
                .fillMaxHeight(0.085f)
                .align(BiasAlignment(horizontalBias = -0.83f, verticalBias = 0.96f)),
            shape = CircleShape,
            textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.Center),
            placeholder = { Text("Type something...") },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Gray,
                unfocusedContainerColor = Color.Black,
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.White,
                focusedIndicatorColor = SantanuCC().navyBlue,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                errorIndicatorColor = Color.Red,
                cursorColor = SantanuCC().navyBlue,
                selectionColors = androidx.compose.foundation.text.selection.TextSelectionColors(
                    handleColor = SantanuCC().navyBlue,
                    backgroundColor = SantanuCC().navyBlue.copy(alpha = 0.4f)
                )
            )
        )

    }
}