package com.Presentation.CommonUI

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.Presentation.CommonUI.mainScreenUI.DrawMainScreenBackground
import com.Presentation.CommonUI.mainScreenUI.EventLink


@Composable
fun MainScreen(eventLink: EventLink){

    Box(modifier = Modifier.fillMaxSize()){

        DrawMainScreenBackground(eventLink)

    }
}
