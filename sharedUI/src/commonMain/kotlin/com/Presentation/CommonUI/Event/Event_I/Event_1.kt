package com.Presentation.CommonUI.Event.Event_I

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.domain.NetworkUILinkRepository
import com.Presentation.CommonUI.Event.Event_I.network_module_UI.Network_UI


@Composable
fun Event_1(network: NetworkUILinkRepository){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        Network_UI(network)
    }
}