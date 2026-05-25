package com.desktopapp.Presentation.CommonUI.mainScreenUI.LocalDomain

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

import com.desktopapp.Presentation.CommonUI.mainScreenUI.EventLink

class Worker : EventLink {
    var isSelected by mutableStateOf(false)


    override fun onBoxIClicked(currentStatus: Boolean): Boolean {
        isSelected = currentStatus
        return isSelected
    }
    override fun onBoxIIClicked(currentStatus: Boolean): Boolean {
        isSelected = currentStatus
        return isSelected
    }
    override fun onBoxIIIClicked(currentStatus: Boolean): Boolean {
        isSelected = currentStatus
        return isSelected
    }
    override fun onBoxIVClicked(currentStatus: Boolean): Boolean {
        isSelected = currentStatus
        return isSelected
    }

}