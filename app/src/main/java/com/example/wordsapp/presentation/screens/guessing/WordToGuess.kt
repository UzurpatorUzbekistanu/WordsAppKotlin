package com.example.wordsapp.presentation.screens.guessing


import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext


@Composable
    fun WordToGuess(){

        Column{

            Row (
            ){
                Text("jestem słowem do zgadnięcia")
            }
            Row (
            ){
                OutlinedTextField(onValueChange = { }, value="")
            }

            Row {
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
