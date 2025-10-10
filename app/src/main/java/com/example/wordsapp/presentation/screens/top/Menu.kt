package com.example.wordsapp.presentation.screens.top

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Menu(){
    var isActionExpanded by remember {mutableStateOf(false)}
    var isAccountExpanded by remember {mutableStateOf(false)}

    Row {
        Spacer(modifier = Modifier.width(8.dp))
        Box() {
            Button(onClick = {
                isActionExpanded =  true }) {
                Text("Action")
                Icon(Icons.Default.ArrowDropDown, contentDescription = "")
            }
            DropdownMenu(expanded = isActionExpanded, onDismissRequest = {isActionExpanded = false}) {
                DropdownMenuItem(
                    text = { Text("New Words") },
                    onClick = {
                        isActionExpanded = false
                    }
                )

                DropdownMenuItem(
                    text = { Text("Repeats") },
                    onClick = {
                        isActionExpanded = false
                    }
                )
            }
        }
        Spacer(modifier = Modifier.width(16.dp))
        Box() {
            Button(onClick = {isAccountExpanded = true}) {
                Text("Account")
                Icon(Icons.Default.ArrowDropDown, contentDescription = "")
            }
            DropdownMenu(expanded = isAccountExpanded, onDismissRequest = {isAccountExpanded = false}) {
                DropdownMenuItem(
                    text = { Text("Sign In") },
                    onClick = {isAccountExpanded = false}
                )
                DropdownMenuItem(
                    text = { Text("Sign Up") },
                    onClick = {isAccountExpanded = false}
                )
                DropdownMenuItem(
                    text = { Text("Profile") },
                    onClick = {isAccountExpanded = false}
                )
                DropdownMenuItem(
                    text = { Text("Log Out") },
                    onClick = {isAccountExpanded = false}
                )
            }
        }
    }
}


