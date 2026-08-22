package com.santanuapi.network_android

import com.google.firebase.FirebaseOptions

data class RAW_KEY(
    val application_id: String="1:583637206060:android:e058941b64f053a35b7d89",
    val project_id:String="server-bond",
    val api_key:String="AIzaSyDCT2o1zbu_bxObVrL1G7Ak5uATdv3MvmI"
)


object Server_KEY {
   private final val credentials= RAW_KEY()
    val key: FirebaseOptions = FirebaseOptions.Builder()
        .setApplicationId(credentials.application_id)
        .setProjectId(credentials.project_id)
        .setApiKey(credentials.api_key)
        .build()
}