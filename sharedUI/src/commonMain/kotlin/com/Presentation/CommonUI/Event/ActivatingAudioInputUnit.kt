package com.Presentation.CommonUI.Event

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import kotlinx.coroutines.CoroutineScope
import com.Presentation.CommonUI.Event.AudioPlatformLink


class ActivatingAudioInputUnit(private val manager: EventManager, private val platformLink: AudioPlatformLink) {
    /**
     * Goal: Asynchronous Decoupling & fire and forget
     * **/

    @Composable
    fun ExecuteAudioIntent() {
        /**
         * This is the Orchestrator that observes the UI and waits for the user interaction and then triggers execute
        **/

        val status by manager.eventTrigger1.collectAsState()

        if (status.eventTriggerStatus1) {
            platformLink.execute()
            println("Audio Input Unit is now Active")
        } else {
            println("Audio Input Unit is now Inactive")
        }
    }

}