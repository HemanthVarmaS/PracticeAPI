package com.example.practiceapi.model


import com.google.gson.annotations.SerializedName

data class WordItem(
    @SerializedName("meanings")
    val meanings: List<Meaning>,
    @SerializedName("origin")
    val origin: String,
    @SerializedName("phonetic")
    val phonetic: String,
    @SerializedName("phonetics")
    val phonetics: List<Phonetic>,
    @SerializedName("word")
    val word: String
)