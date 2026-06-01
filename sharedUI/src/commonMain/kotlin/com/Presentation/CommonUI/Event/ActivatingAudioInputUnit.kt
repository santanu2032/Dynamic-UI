package com.Presentation.CommonUI.Event

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.coroutines.CoroutineScope
import com.Presentation.CommonUI.Event.AudioPlatformLink


    /**
     * Goal: Asynchronous Decoupling & fire and forget
     * **/

    @Composable
    fun ExecuteAudioIntent( manager: EventManager,
                            platformLink: AudioPlatformLink) {
        /**
         * This is the Orchestrator that observes the UI and waits for the user interaction and then triggers execute
         **/
        var isClicked by remember { mutableStateOf(false) }

        val status by manager.eventTrigger1.collectAsState()
        LaunchedEffect(status.eventTriggerStatus1) {
            if (status.eventTriggerStatus1) {
                isClicked=true
                platformLink.execute()
            } else if(isClicked!=true) {
                platformLink.stop()
                println("Audio Input Unit is now Inactive")
            }
        }
    }
