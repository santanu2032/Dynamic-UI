package com.Presentation.CommonUI.values

import androidx.compose.ui.graphics.Color

// Updated parser to handle your RRGGBBAA strings safely
fun hexToColor(hex: String): Color {
    val cleaned = hex.trimStart('#')

    val argbString = when (cleaned.length) {
        6 -> "FF$cleaned" // If it's a standard 6-char RRGGBB, add FF to the front
        8 -> {
            // Your strings are RRGGBBAA (e.g., "0F3460FF").
            // Compose needs AARRGGBB. We move the last 2 characters (Alpha) to the front.
            val rgb = cleaned.substring(0, 6)
            val alpha = cleaned.substring(6, 8)
            alpha + rgb
        }
        else -> "FF000000" // Fallback to black if the string is malformed
    }

    return Color(argbString.toLong(radix = 16))
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