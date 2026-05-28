package com.Presentation.CommonUI.mainScreenUI.LocalDomain

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class LocalUiState(
    val isClicked: Boolean = false
)

class LocalManager {

    private val _uiState = MutableStateFlow(LocalUiState())
    val uiState: StateFlow<LocalUiState> = _uiState.asStateFlow()

    fun Clicked() {
        _uiState.value = _uiState.value.copy(isClicked = !_uiState.value.isClicked)

    }

}