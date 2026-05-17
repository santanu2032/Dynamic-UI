package com.ui.values

import android.annotation.SuppressLint
import androidx.compose.ui.graphics.Color

class SantanuCC : CC {
    //universal color can be use in multi-platform
    @SuppressLint("UseKtx")
    override val navyBlue: Color=Color(android.graphics.Color.parseColor(CustomColor.NAVY_BLUE));
    @SuppressLint("UseKtx")
    override val terracotta: Color=Color(android.graphics.Color.parseColor(CustomColor.TERRACOTTA));
    @SuppressLint("UseKtx")
    override val mintGreen: Color=Color(android.graphics.Color.parseColor(CustomColor.MINT_GREEN));
    @SuppressLint("UseKtx")
    override val coralPink: Color=Color(android.graphics.Color.parseColor(CustomColor.CORAL_PINK));
    @SuppressLint("UseKtx")
    override val lavender: Color=Color(android.graphics.Color.parseColor(CustomColor.LAVENDER));
  }