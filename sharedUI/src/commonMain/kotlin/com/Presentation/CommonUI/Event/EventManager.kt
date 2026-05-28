package com.Presentation.CommonUI.Event

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class EventStatus(
    /**
     * Warning This is not a GOD class !
     *
     * This data class contain the status data for the UI to Change,
     * Effective even if the Object is destroyed (eg-phone rotating and the UI update with new object)
     * */
    val eventTriggerStatus1: Boolean = false,
    val eventTriggerStatus2: Boolean=false,
    val eventTriggerStatus3: Boolean=false,
    val eventTriggerStatus4: Boolean=false
)

class EventManager {

    private val _eventTrigger1 = MutableStateFlow(EventStatus())
    private val _eventTrigger2= MutableStateFlow(EventStatus())
    private val _eventTrigger3 = MutableStateFlow(EventStatus())
    private val _eventTrigger4 = MutableStateFlow(EventStatus())
    val eventTrigger1: StateFlow<EventStatus> = _eventTrigger1.asStateFlow()
    val eventTrigger2: StateFlow<EventStatus> = _eventTrigger2.asStateFlow()
    val eventTrigger3: StateFlow<EventStatus> = _eventTrigger3.asStateFlow()
    val eventTrigger4: StateFlow<EventStatus> = _eventTrigger4.asStateFlow()
/**
* the .value say "hey I am the current object",
 * because of immutable type data we use .copy() to exchange the current Object with the old one
**/
    fun updateEventTrigger1() {
        _eventTrigger1.value = _eventTrigger1.value.copy(eventTriggerStatus1 =!_eventTrigger1.value.eventTriggerStatus1)
    }

    fun updateEventTrigger2() {
        _eventTrigger2.value = _eventTrigger2.value.copy(eventTriggerStatus2 = !_eventTrigger2.value.eventTriggerStatus2)
    }

    fun updateEventTrigger3() {
        _eventTrigger3.value = _eventTrigger3.value.copy(eventTriggerStatus3 = !_eventTrigger3.value.eventTriggerStatus3)
    }

    fun updateEventTrigger4() {
        _eventTrigger4.value = _eventTrigger4.value.copy(eventTriggerStatus4 = !_eventTrigger4.value.eventTriggerStatus4)
    }
}