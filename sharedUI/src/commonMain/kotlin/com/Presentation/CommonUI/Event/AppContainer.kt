package com.Presentation.CommonUI.Event

public object AppContainer {

    lateinit var eventManager: EventManager
    lateinit var audioPlatformLink: AudioPlatformLink

    fun init(platformLink: AudioPlatformLink) {
        eventManager = EventManager()
        audioPlatformLink = platformLink
    }
}