package com.Presentation.CommonUI

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.Presentation.CommonUI.mainScreenUI.DrawMainScreenBackground
import com.Presentation.CommonUI.mainScreenUI.EventLink
import com.Presentation.CommonUI.mainScreenUI.LocalDomain.Worker


@Composable
fun MainScreen(eventLink: EventLink){

    Box(modifier = Modifier.fillMaxSize()){

        DrawMainScreenBackground(eventLink)

    }
}
@Preview
@Composable
private fun TestUI(){
    val mockEventLink = remember {
        Worker()
    }
    MainScreen(eventLink = mockEventLink)
}