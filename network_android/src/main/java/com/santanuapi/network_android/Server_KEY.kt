package com.santanuapi.network_android

import com.google.firebase.FirebaseOptions

data class RAW_KEY(
    val application_id: String="",
    val project_id:String="",
    val api_key:String=""
)


object Server_KEY {
   private final val credentials= RAW_KEY()
    val key: FirebaseOptions = FirebaseOptions.Builder()
        .setApplicationId(credentials.application_id)
        .setProjectId(credentials.project_id)
        .setApiKey(credentials.api_key)
        .build()
}