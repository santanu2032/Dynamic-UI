package com.Presentation.CommonUI

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.Presentation.CommonUI.Event.Event_II.Event_2
import com.Presentation.CommonUI.mainScreenUI.DrawMainScreenBackground
import com.Presentation.CommonUI.mainScreenUI.EventLink
import com.Presentation.CommonUI.mainScreenUI.LocalDomain.LocalManager


@Composable
fun MainScreen(eventLink: EventLink,localManager: LocalManager){

    val currentState by localManager.uiState.collectAsState()
    Box(modifier = Modifier.fillMaxSize()){

       /**
        * State Driven UI Rendering
        * */
        if (!currentState.isClicked) {
            DrawMainScreenBackground(eventLink,localManager)
        } else {
            Event_2()
        }

    }
}

