package com.example.wordsapp.presentation.screens.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.wordsapp.presentation.screens.footer.footer
import com.example.wordsapp.presentation.screens.guessing.hint
import com.example.wordsapp.presentation.screens.guessing.synonyms
import com.example.wordsapp.presentation.screens.guessing.wordToGuess
import com.example.wordsapp.presentation.screens.statisticTotal.dailyRank
import com.example.wordsapp.presentation.screens.statisticTotal.monthlyRank
import com.example.wordsapp.presentation.screens.statisticTotal.topRank
import com.example.wordsapp.presentation.screens.userStatistic.userStatistic
import com.example.wordsapp.presentation.screens.userStatistic.userStatisticDetails

@Composable
    fun Screen(name: String, modifier: Modifier = Modifier) {
        Column (
            Modifier
                .fillMaxSize()
                .systemBarsPadding()
                .padding(16.dp)
        ){
            Row {
                footer()
            }
            Row {
                userStatistic()
                userStatisticDetails()
            }
            Row()
            {
                Column {
                    synonyms()
                    wordToGuess()
                    hint()
                }
            }
            Row {
                dailyRank()
                monthlyRank()
                topRank()

            }
            Row {
                footer()
            }
        }
    }
