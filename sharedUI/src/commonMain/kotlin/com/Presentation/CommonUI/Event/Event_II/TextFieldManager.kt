package com.Presentation.CommonUI.Event.Event_II

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class TextFieldState(
    val textField_id_event2_data: String = ""//manual data input unit from the AI screen
)

class TextFieldManager {

    private val _textField_id_event2_data= MutableStateFlow(TextFieldState())
    val id_event2_data: StateFlow<TextFieldState> = _textField_id_event2_data

    fun onTextField_Id_Event2_DataChange(newValue: String) {
        _textField_id_event2_data.value = _textField_id_event2_data.value.copy(
            textField_id_event2_data = newValue
        )
    }
}
