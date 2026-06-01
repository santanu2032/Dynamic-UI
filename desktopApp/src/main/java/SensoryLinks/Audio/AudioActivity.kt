package SensoryLinks.Audio

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

class AudioActivity(private val scope: CoroutineScope): AudioSource {
    private val _audioFlow = MutableSharedFlow<ByteArray>(replay = 0)
    override val audioFlow = _audioFlow.asSharedFlow()
    private var isRunning = false

 suspend fun executeAudioActivity(n: Int) {
        val audioStreamer = ContinuousAudioStream(sampleRate = 16000f, channels = 1)

        // Using .take(50) for the example so it doesn't run infinitely,
        // but you can remove it to loop forever just like the Python example.

            isRunning = true
            for (audioChunk in audioStreamer.listen().take(n)) {
                if (!isRunning) break
                // 'audioChunk' is a ByteArray containing raw 16-bit PCM data.
                println("Received audio chunk of size: ${audioChunk.size} bytes")
                _audioFlow.emit(audioChunk)
            }

        println("Done listening.")
    }
    suspend fun stopAudioActivity(){
        isRunning = false
    }

}