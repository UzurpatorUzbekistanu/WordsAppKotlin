package com.example.wordsapp.presentation.screens.guessing


import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
    fun WordToGuess(){

        var inputValue by remember { mutableStateOf("") }



        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ){

            Row (
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ){
                Text("jestem słowem do zgadnięcia")
            }
            Row (
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ){
                OutlinedTextField(
                    onValueChange = { inputValue = it},
                    value=inputValue,
                    placeholder = { Text("enter translation") })
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                val context = LocalContext.current
                Button(onClick = { Toast.makeText(context, "to się zrobi", Toast.LENGTH_LONG).show()}) {
                    Text("Submit")
                }
                Button(onClick = {}) {
                    Text("Next Word")
                }
            }
        }



    }
