package com.Presentation.CommonUI.Event

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
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

        val status by manager.eventTrigger1.collectAsState()
        LaunchedEffect(status.eventTriggerStatus1) {
            if (status.eventTriggerStatus1) {
                platformLink.execute()
            } else {
                println("Audio Input Unit is now Inactive")
            }
        }
    }
