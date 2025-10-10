package com.example.wordsapp.presentation.screens.guessing  // pakiet prezentacji

import androidx.compose.runtime.getValue                    // importy Compose state
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel                         // bazowy ViewModel
import com.example.wordsapp.domain.usecase.CheckTranslationUseCase // use case
import com.example.wordsapp.domain.usecase.AttemptResult    // model wyniku

class WordToGuessViewModel(                                // VM dla ekranu zgadywania
    private val checkTranslation: CheckTranslationUseCase  // wstrzyknięty use case
) : ViewModel() {

    data class UiState(                                    // stan UI
        val lastResult: AttemptResult? = null              // ostatni wynik (null gdy brak)
    )

    var uiState by mutableStateOf(UiState())               // obserwowalny stan dla Compose
        private set                                        // modyfikowalny tylko w VM

    fun submit(wordId: String, input: String) {            // akcja po kliknięciu "Submit"
        val result = checkTranslation(wordId, input)       // uruchom use case z danymi
        uiState = uiState.copy(lastResult = result)        // zaktualizuj stan UI
    }
}
