package com.ui.mainScreenUI

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun PrototypeBox_IV(){

    Box(modifier = Modifier.fillMaxSize()) {

        Box(modifier = Modifier

            .fillMaxWidth(0.4f)
            .fillMaxHeight(0.2f)
            .background(color = Color.White, shape = RoundedCornerShape(16.dp))
            .align(BiasAlignment(horizontalBias = 0.8f, verticalBias = 0.35f))
        ) {

        }
    }
}