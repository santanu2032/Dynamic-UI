package com.Presentation.UI.mainScreenUI

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.Presentation.UI.mainScreenUI.LocalDomain.Worker
import com.Presentation.UI.values.CustomColorKT



@Composable
fun DrawMainScreenBackground(eventLink: EventLink) {
    Box(modifier = Modifier.fillMaxSize().background(CustomColorKT.EerieBlack())) {
        Text(
            text = "Test",
            modifier = Modifier.align(Alignment.Center),
            color = Color.White
        )
        StatusBar()
        PrototypeBox_I(eventLink)
        PrototypeBox_II(eventLink)
        PrototypeBox_III(eventLink)
        PrototypeBox_IV(eventLink)
        NavigationBar()

    }
}
@Preview
@Composable
private fun TestUI(){
    val mockEventLink = remember {
        Worker()
    }
    DrawMainScreenBackground(eventLink = mockEventLink)
}