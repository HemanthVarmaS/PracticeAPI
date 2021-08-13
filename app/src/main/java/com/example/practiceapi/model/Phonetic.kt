package com.example.practiceapi.model


import com.google.gson.annotations.SerializedName

data class Phonetic(
    @SerializedName("audio")
    val audio: String,
    @SerializedName("text")
    val text: String
)