package com.example.wordsapp.domain.repository

interface WordRepository {
    fun getCorrectTranslation(wordId: String): String
}