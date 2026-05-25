package com.Presentation.CommonUI.mainScreenUI

interface EventLink {
    fun onBoxIClicked(currentStatus: Boolean): Boolean
    fun onBoxIIClicked(currentStatus: Boolean): Boolean
    fun onBoxIIIClicked(currentStatus: Boolean): Boolean
    fun onBoxIVClicked(currentStatus: Boolean): Boolean
}