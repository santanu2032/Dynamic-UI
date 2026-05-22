package com.ui.mainScreenUI

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.ui.values.CustomColorKT

@Preview

@Composable
fun DrawMainScreenBackground() {
    Box(modifier = Modifier.fillMaxSize().background(CustomColorKT.EerieBlack())) {
        Text(
            text = "Test",
            modifier = Modifier.align(Alignment.Center),
            color = Color.White
        )
        StatusBar()
        PrototypeBox_I()
        PrototypeBox_II()
        PrototypeBox_III()
        PrototypeBox_IV()
        NavigationBar()

    }
}