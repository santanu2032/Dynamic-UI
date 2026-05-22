package com.Presentation.UI.mainScreenUI

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.Presentation.UI.values.CustomColorKT

@Preview
@Composable
fun StatusBar() {
    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth(0.94f)
                .fillMaxHeight(0.15f)
                .background(CustomColorKT.SlateGray(), shape = RoundedCornerShape(16.dp))
                .align(BiasAlignment(horizontalBias = 0f, verticalBias = -0.96f))
                .padding(all = 50.dp)


        ) {
            Text(
                text = "Test",
                modifier = Modifier.align(Alignment.Center),
                color = Color.White
            )
        }
    }
}





