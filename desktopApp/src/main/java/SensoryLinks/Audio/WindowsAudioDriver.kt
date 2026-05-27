package SensoryLinks.Audio
import javax.sound.sampled.AudioFormat
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.TargetDataLine

class ContinuousAudioStream(
    private val sampleRate: Float = 16000f,
    private val channels: Int = 1,
    private val chunkSize: Int = 1024
) {
    private var microphoneLine: TargetDataLine? = null

    // 16-bit audio = 2 bytes per sample.
    private val bytesPerFrame = 2 * channels
    private val bufferSizeBytes = chunkSize * bytesPerFrame

    fun startStream() {
        // format: sampleRate, sampleSizeInBits, channels, signed, bigEndian
        val format = AudioFormat(sampleRate, 16, channels, true, false)

        microphoneLine = AudioSystem.getTargetDataLine(format).apply {
            open(format)
            start()
        }
    }

    fun stopStream() {
        microphoneLine?.apply {
            stop()
            close()
        }
        microphoneLine = null
    }

    /**
     * A Sequence generator that starts the microphone and continuously
     * yields byte arrays containing raw PCM audio data.
     */
    fun listen(): Sequence<ByteArray> = sequence {
        startStream()
        println("Microphone stream started. Listening...")

        val line = microphoneLine ?: throw IllegalStateException("Microphone line failed to initialize.")
        val buffer = ByteArray(bufferSizeBytes)

        try {
            while (true) {
                // This blocks until enough audio data is captured to fill the buffer
                val bytesRead = line.read(buffer, 0, buffer.size)

                if (bytesRead > 0) {
                    // Yield a copy of the buffer so downstream processing
                    // doesn't conflict with the next read cycle
                    yield(buffer.copyOf(bytesRead))
                }
            }
        } finally {
            // Ensures the hardware is released if the loop is broken (e.g., via a break statement)
            println("\nReleasing microphone hardware...")
            stopStream()
        }
    }
}

// =========================================
// Example Usage
// =========================================
fun main() {
    val audioStreamer = ContinuousAudioStream(sampleRate = 16000f, channels = 1)

    // Using .take(50) for the example so it doesn't run infinitely,
    // but you can remove it to loop forever just like the Python example.
    for (audioChunk in audioStreamer.listen().take(50)) {
        // 'audioChunk' is a ByteArray containing raw 16-bit PCM data.
        println("Received audio chunk of size: ${audioChunk.size} bytes")
    }

    println("Done listening.")
}