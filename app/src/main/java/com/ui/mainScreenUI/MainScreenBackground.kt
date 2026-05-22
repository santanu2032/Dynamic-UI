package com.ui.mainScreenUI

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.zIndex
import com.ui.values.CustomColorKT

@Preview

@Composable
fun DrawMainScreenBackground() {
    Box(modifier = Modifier.fillMaxSize().background(Color.Black)) {

            Text(
                text = "Test",
                modifier = Modifier.align(Alignment.Center),
                color = Color.White

            )


    }
}