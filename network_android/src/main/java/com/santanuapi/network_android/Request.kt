package com.santanuapi.network_android

import android.content.Context
import com.google.firebase.FirebaseApp

fun request(context: Context) {

    print("Initiating server link\n.\n.\n.\n.\n.\n.")

    try{
        FirebaseApp.initializeApp(context,Server_KEY.key)
    }
    catch(e: Exception) {
        e.printStackTrace()
        println("Error: ${e.message}")
    }
}