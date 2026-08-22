package com.santanuapi.network_android

import android.os.Bundle
import androidx.activity.ComponentActivity

// MainActivity.kt
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        request(this)   // pass Activity context

    }
}