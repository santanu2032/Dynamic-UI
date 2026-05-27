package com.sensoryunit.Audio.localDomain

/**
 * Tracks and smooths amplitude values over time.
 * Pure Kotlin — no platform dependencies. KMP-ready.
 */
class AmplitudeTracker(
    private val smoothingFactor: Float = 0.15f,   // EMA alpha (0.0 = frozen, 1.0 = raw)
    private val minAmplitude: Float = 0f,
    private val maxAmplitude: Float = 1f
) : AudioSource {

    private var _smoothed: Float = 0f
    private var _peak: Float = 0f
    private var _raw: Float = 0f

    val smoothed: Float get() = _smoothed
    val peak: Float get() = _peak
    val raw: Float get() = _raw

    /**
     * Feed a new raw amplitude sample.
     * Call this every audio frame / mic callback.
     */
    override fun push(rawValue: Float) {
        _raw = rawValue.coerceIn(minAmplitude, maxAmplitude)

        // Exponential Moving Average  →  S_n = α * x_n + (1 - α) * S_(n-1)
        _smoothed = smoothingFactor * _raw + (1f - smoothingFactor) * _smoothed

        if (_smoothed > _peak) _peak = _smoothed
    }

    /** Gradually decay peak back toward smoothed (call on every frame). */
    override fun decayPeak(decayRate: Float) {
        _peak *= decayRate
        if (_peak < _smoothed) _peak = _smoothed
    }

    /** Hard reset — e.g. mic stopped or session ended. */
    override fun reset() {
        _raw = 0f
        _smoothed = 0f
        _peak = 0f
    }
}

/**
 * // Android only — lives in Presentation or platform module
  val tracker = AmplitudeTracker(smoothingFactor = 0.2f)

  audioRecord.setRecordPositionUpdateListener(object : AudioRecord.OnRecordPositionUpdateListener {
      override fun onPeriodicNotification(recorder: AudioRecord) {
          val raw = recorder.maxAmplitude / 32767f  // normalize to 0..1
          tracker.push(raw)
      }
      override fun onMarkerReached(recorder: AudioRecord) {}
  })
 */
