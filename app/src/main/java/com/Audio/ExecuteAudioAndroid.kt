package com.Audio

import com.Presentation.CommonUI.Event.AudioPlatformLink
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.IOException

class ExecuteAudioAndroid(private val applicationScope: CoroutineScope): AudioPlatformLink {
    override fun execute(){//This is for Android
        applicationScope.launch(Dispatchers.Default) {
            try {

            }
            catch (e: IOException){
                println(e.message)
            }
        }
    }
}