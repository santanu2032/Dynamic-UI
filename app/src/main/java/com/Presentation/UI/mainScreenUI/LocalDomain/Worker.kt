package com.Presentation.UI.mainScreenUI.LocalDomain

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.Presentation.UI.mainScreenUI.EventLink
import com.Presentation.UI.mainScreenUI.*
class Worker : EventLink {
    var isSelected by mutableStateOf(false)


    override fun onBoxIClicked(): Boolean {
        isSelected = !isSelected
        return isSelected
    }
    override fun onBoxIIClicked(): Boolean {
        isSelected = !isSelected
        return isSelected
    }
    override fun onBoxIIIClicked(): Boolean {
        isSelected = !isSelected
        return isSelected
    }
    override fun onBoxIVClicked(): Boolean {
        isSelected = !isSelected
        return isSelected
    }

}