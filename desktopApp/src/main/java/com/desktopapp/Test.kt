package com.desktopapp

import com.Presentation.CommonUI.Event.AudioPlatformLink
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch

class TestWindows(
    private val platformLink: AudioPlatformLink
) : IntentManagerContract {

    private val scope = CoroutineScope(Dispatchers.Default)  // ✅ owned here

    override fun onAudioInputRequested() {
        scope.launch {          // fire
            platformLink.execute()  // and forget
        }
    }

    override fun shutdownAudioRequest() {
        scope.cancel()          // clean up when IntendManager dies
    }
}