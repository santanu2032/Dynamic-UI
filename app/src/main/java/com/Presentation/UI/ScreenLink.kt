package com.Presentation.UI
import com.Presentation.UI.mainScreenUI.EventLink
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun ScreenLink(
    eventHandler: EventLink
) {

    var event1 by remember { mutableStateOf(eventHandler::onBoxIClicked) }
    var event2 by remember { mutableStateOf(eventHandler::onBoxIClicked) }
}
