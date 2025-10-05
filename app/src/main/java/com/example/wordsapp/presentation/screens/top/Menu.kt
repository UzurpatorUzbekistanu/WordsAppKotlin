package com.example.wordsapp.presentation.screens.top

import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Menu(){
    Box(){
        Button(onClick = {}) {
            Text("Action")
            Icon(Icons.Default.ArrowDropDown, contentDescription = "")
        }
    }
}


