package com.desktopapp.Presentation.CommonUI.values


import androidx.compose.ui.graphics.Color

fun hexToColor(hex: String): Color {
    val cleaned = hex.trimStart('#')
    return Color(("FF$cleaned").toLong(16))  // FF = full opacity prefix
}

class SantanuCC : CC {
    override val navyBlue: Color = hexToColor(CustomColor.NAVY_BLUE)
    override val terracotta: Color = hexToColor(CustomColor.TERRACOTTA)
    override val mintGreen: Color = hexToColor(CustomColor.MINT_GREEN)
    override val coralPink: Color = hexToColor(CustomColor.CORAL_PINK)
    override val lavender: Color = hexToColor(CustomColor.LAVENDER)
    override val charcoal: Color = hexToColor(CustomColor.CHARCOAL)
    override val slateGray: Color = hexToColor(CustomColor.SLATE_GRAY)
    override val deepPurple: Color = hexToColor(CustomColor.DEEP_PURPLE)
    override val goldenYellow: Color = hexToColor(CustomColor.GOLDEN_YELLOW)
}