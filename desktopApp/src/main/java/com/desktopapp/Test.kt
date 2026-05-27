package com.desktopapp

import SensoryLinks.Audio.AudioActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Test(applicationScope: CoroutineScope) {
    val audioManager = AudioActivity(applicationScope)

    fun main() {
        CoroutineScope(Dispatchers.Default).launch {
            audioManager.executeAudioActivity(50)
        }
    }
}

