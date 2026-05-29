package SensoryLinks.Audio

import com.Presentation.CommonUI.Event.AudioPlatformLink
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.IOException

class ExecuteAudioWindows (private val applicationScope: CoroutineScope): AudioPlatformLink{
    val audioManager = AudioActivity(applicationScope)
    override fun execute() {//This is for windows
        /**
         * This is the Worker that implements the intent; can be used by any other classes with same intent
         * **/

        applicationScope.launch(Dispatchers.Default) {//solved the Coroutines leak problem
            try {
                audioManager.executeAudioActivity(50)
            }
            catch (e: IOException){
                println(e.message)
            }
        }
    }
}