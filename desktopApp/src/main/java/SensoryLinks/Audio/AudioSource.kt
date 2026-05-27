package SensoryLinks.Audio

import kotlinx.coroutines.flow.SharedFlow

interface AudioSource {
    val audioFlow: SharedFlow<ByteArray>
}

/**
 * How to call it follow the instruction
 * // 1. You create the manager
 * val audioManager = AudioActivity(applicationScope)
 *
 * // 2. You start it
 * AudioActivity.executeAudioActivity()
 *
 * // 3. You pass it to the Brain
 * val brain = JarvisBrain(audioProvider = audioManager)
 *
 * SAMPLE
 * private fun observeAudio() {
 *         CoroutineScope(Dispatchers.Default).launch {
 *             audioProvider.audioFlow.collect { chunk ->
 *                 // Now the Brain has the data!
 *                 // Logic to interpret the PCM bytes (e.g., wake word detection)
 *                 handleAudioChunk(chunk)
 *             }
 *             Santanu Sarkar
 */
