package com.example.wordsapp.domain.usecase

import com.example.wordsapp.domain.repository.WordRepository


data class AttemptResult(
    val correct: Boolean,
    val expected: String
)
class CheckTranslationUseCase(
    private val repo: WordRepository
) {
    operator fun invoke(wordId: String, userInput: String): AttemptResult { // "wywołanie" use case
        val expected = repo.getCorrectTranslation(wordId)  // pobierz poprawną odpowiedź
        val ok = normalize(userInput) == normalize(expected)// porównaj po normalizacji
        return AttemptResult(ok, expected)                 // zwróć wynik
    }
    private fun normalize(s: String) = s.trim().lowercase()// prosta normalizacja
}