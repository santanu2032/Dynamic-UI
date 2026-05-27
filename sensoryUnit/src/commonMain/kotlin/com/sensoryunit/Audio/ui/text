package com.api.wave_engine

import android.Manifest
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {

    private val audioSource: AudioSource = StandardMicSource()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ask for permission first
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.RECORD_AUDIO), 1)

        val jarvisView = findViewById<Link_wave_logic>(R.id.jarvis_ring)

        audioSource.start { amplitude ->
            runOnUiThread {
                jarvisView.currentMicVolume = amplitude
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        audioSource.stop()
    }
}