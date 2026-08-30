package com.Presentation.CommonUI.Event.Event_I.network_module_UI

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.domain.NetworkUILinkRepository


@Composable
fun Network_UI(networkEvent: NetworkUILinkRepository,networkManager: NetworkManager){

    var isClicked by remember{mutableStateOf(false)}
    val boxColor = if (isClicked) Color.Gray else Color.White

    Box(modifier = Modifier

        .fillMaxSize()
        .background(color = Color.Black)

    ) {

        Box(modifier = Modifier
            .fillMaxWidth(0.9f)
            .fillMaxHeight(0.2f)
            .background(color = Color.Red)//TODO("change it to mutable or remote calling")
            .align(alignment = BiasAlignment(horizontalBias = 0.1f, verticalBias = -0.96f))
            .padding(all = 20.dp),
            contentAlignment = Alignment.Center,


            ){Text("Status")}
        Box(modifier = Modifier
            .fillMaxHeight(0.08f)
            .fillMaxWidth(0.3f)
            .align(alignment = Alignment.Center)
            .background(color = boxColor)
            .clickable{
                isClicked=true
                networkEvent.Status_Report(isClicked)
                networkManager.requestNetworkActivity()
                val state = networkManager.sendRequest.value
                print("Test"+state)
            }
            ,
            contentAlignment = Alignment.Center

        ) {
            Text("Test run")
        }

    }
}