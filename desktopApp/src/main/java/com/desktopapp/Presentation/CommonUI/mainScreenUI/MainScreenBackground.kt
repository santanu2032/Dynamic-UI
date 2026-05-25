package com.desktopapp.Presentation.CommonUI.mainScreenUI

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text

import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import com.desktopapp.Presentation.CommonUI.values.CustomColorKT


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