package com.sensoryunit.Audio.localDomain

interface AudioSource {
    fun push(rawValue: Float)// give the raw audio source
    fun reset()//reset all values
    fun decayPeak(decayRate: Float)//adjust loudness
}