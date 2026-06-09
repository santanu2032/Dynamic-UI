package com.Presentation.CommonUI.Event.Event_II

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.zIndex

@Composable
fun Output() {//TODO(CREATE THE PIPELINE OF DATA TO SATISFY UDF)

    var dummy by remember { mutableStateOf("test") }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)
        .zIndex(0f)

    ) {

        TextField(value = dummy, onValueChange = { dummy = it },
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center),
            textStyle = TextStyle(color = Color.White, textAlign = TextAlign.Center),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                cursorColor = Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            )
        )
    }
}