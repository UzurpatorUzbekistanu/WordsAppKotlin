package com.example.wordsapp.presentation.screens.Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.wordsapp.presentation.screens.footer.Footer
import com.example.wordsapp.presentation.screens.guessing.Hint
import com.example.wordsapp.presentation.screens.guessing.Synonyms
import com.example.wordsapp.presentation.screens.guessing.WordToGuess
import com.example.wordsapp.presentation.screens.statisticTotal.DailyRank
import com.example.wordsapp.presentation.screens.statisticTotal.MonthlyRank
import com.example.wordsapp.presentation.screens.statisticTotal.TopRank
import com.example.wordsapp.presentation.screens.top.Menu
import com.example.wordsapp.presentation.screens.userStatistic.UserStatistic
import com.example.wordsapp.presentation.screens.userStatistic.UserStatisticDetails

@Composable
fun Screen(name: String, modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = { Menu() },
        bottomBar = { Footer() }
    ) { innerPadding ->
        Box(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp) // <-- odstępy pionowe
            ) {
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp), // <-- odstępy w wierszu
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    UserStatistic()
                    UserStatisticDetails()
                }

                // Tu masz Row z jedną Columną — odstęp do poprzedniego/next już robi spacedBy w Column
                Row(Modifier.fillMaxWidth()) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(16.dp) // między Word/Hint/Synonyms
                    ) {
                        WordToGuess()
                        Hint()
                        Synonyms()
                    }
                }

                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp) // między rankami
                ) {
                    DailyRank()
                    MonthlyRank()
                    TopRank()
                }
            }
        }
    }
}

