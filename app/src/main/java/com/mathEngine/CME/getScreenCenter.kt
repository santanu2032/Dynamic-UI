package com.mathEngine.CME

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.layout.onSizeChanged

@Composable
fun getScreenCenter(): Offset {
    var center by remember { mutableStateOf(Offset.Zero) }

    Box(modifier = Modifier
        .fillMaxSize()
        .onSizeChanged { size ->
            center = Offset(
                x = size.width / 2f,
                y = size.height / 2f
            )
        }
    )

    return center
}
/*
how to call just follow this
val center = getScreenCenter()
val cx = center.x
val cy = center.y
 */
