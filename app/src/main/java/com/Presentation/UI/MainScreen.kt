package com.Presentation.UI

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.Presentation.UI.mainScreenUI.DrawMainScreenBackground

@Preview
@Composable
fun MainScreen(){

    Box(modifier = Modifier.fillMaxSize()){

        DrawMainScreenBackground()

    }
}