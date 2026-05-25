package com.desktopapp.Presentation.CommonUI

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.desktopapp.Presentation.CommonUI.mainScreenUI.DrawMainScreenBackground
import com.desktopapp.Presentation.CommonUI.mainScreenUI.EventLink


@Composable
fun MainScreen(eventLink: EventLink){

    Box(modifier = Modifier.fillMaxSize()){

        DrawMainScreenBackground(eventLink)

    }
}
