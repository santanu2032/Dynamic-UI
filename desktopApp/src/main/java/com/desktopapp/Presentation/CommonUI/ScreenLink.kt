package com.desktopapp.Presentation.CommonUI

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.desktopapp.Presentation.CommonUI.mainScreenUI.EventLink

@Composable
fun ScreenLink(
    eventHandler: EventLink
) {

    var event1 by remember { mutableStateOf(eventHandler::onBoxIClicked) }
    var event2 by remember { mutableStateOf(eventHandler::onBoxIIClicked) }
    var event3 by remember { mutableStateOf(eventHandler::onBoxIIIClicked) }
}
