package com.Presentation.ui.values


import androidx.compose.ui.graphics.Color

class SantanuCC : CC {
    //universal color can be used in multi-platform, warning if using pure HTML and CSS then use the CustomColor.java Class

    override val navyBlue: Color=Color(android.graphics.Color.parseColor(CustomColor.NAVY_BLUE));

    override val terracotta: Color=Color(android.graphics.Color.parseColor(CustomColor.TERRACOTTA));

    override val mintGreen: Color=Color(android.graphics.Color.parseColor(CustomColor.MINT_GREEN));

    override val coralPink: Color=Color(android.graphics.Color.parseColor(CustomColor.CORAL_PINK));

    override val lavender: Color=Color(android.graphics.Color.parseColor(CustomColor.LAVENDER));

    override  val charcoal: Color=Color(android.graphics.Color.parseColor(CustomColor.CHARCOAL));

    override val slateGray: Color = Color(android.graphics.Color.parseColor(CustomColor.SLATE_GRAY));

    override val deepPurple: Color = Color(android.graphics.Color.parseColor(CustomColor.DEEP_PURPLE));

    override val goldenYellow: Color = Color(android.graphics.Color.parseColor(CustomColor.GOLDEN_YELLOW));

  }