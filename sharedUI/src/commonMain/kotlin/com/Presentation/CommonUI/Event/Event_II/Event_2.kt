package com.Presentation.CommonUI.Event.Event_II


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
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
    var textInput by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {

        Box(modifier = Modifier//audio input
            .fillMaxWidth(0.105f)
            .fillMaxHeight(0.08f)
            .background(color = Color.White,shape = CircleShape)
            .align(BiasAlignment(horizontalBias = 0.95f, verticalBias = 0.96f))
            .clickable{
                TODO("link the manager")
            }
            , contentAlignment = Alignment.Center
        ){

            Text("Audio")
        }

        Box(modifier = Modifier//send
            .fillMaxWidth(0.105f)
            .fillMaxHeight(0.08f)
            .background(color = Color.White,shape = CircleShape)
            .align(BiasAlignment(horizontalBias = 0.65f, verticalBias = 0.96f))
            .clickable{
                TODO("link the manager")

            }
            , contentAlignment = Alignment.Center
        ){

            Text("send")
        }

        Box( modifier = Modifier
            .fillMaxWidth(0.65f)
            .fillMaxHeight(0.08f)
            .align(BiasAlignment(horizontalBias = -0.86f, verticalBias = 0.92f))) {
            TextField(
                value = textInput,
                onValueChange = { textInput = it },
                modifier = Modifier.fillMaxWidth().fillMaxHeight()
                    .padding(all = 1.dp),

                placeholder = {
                    Text(
                        "Type something...",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                },
                textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.Start, color = Color.White),
                shape = CircleShape,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.LightGray,
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    focusedIndicatorColor = SantanuCC().navyBlue,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    errorIndicatorColor = Color.Red,
                    cursorColor = SantanuCC().navyBlue,

                ),
                singleLine = true,
                maxLines = 100
            )
        }

    }
}