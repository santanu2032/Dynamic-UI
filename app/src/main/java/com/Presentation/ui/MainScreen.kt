package com.Presentation.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.Presentation.ui.mainScreenUI.DrawMainScreenBackground

@Preview
@Composable
fun drawMainScreen(){

    Box(modifier = Modifier.fillMaxSize()){

        DrawMainScreenBackground()

    }


}