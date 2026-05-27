package SensoryLinks.Audio

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

// =========================================
// Example Usage
// =========================================
private val _audioFlow = MutableSharedFlow<ByteArray>(replay = 0)
val audioFlow = _audioFlow.asSharedFlow()

suspend fun main() {
    val audioStreamer = ContinuousAudioStream(sampleRate = 16000f, channels = 1)

    // Using .take(50) for the example so it doesn't run infinitely,
    // but you can remove it to loop forever just like the Python example.
    for (audioChunk in audioStreamer.listen().take(50)) {
        // 'audioChunk' is a ByteArray containing raw 16-bit PCM data.
        println("Received audio chunk of size: ${audioChunk.size} bytes")
        _audioFlow.emit(audioChunk)
    }

    println("Done listening.")
}