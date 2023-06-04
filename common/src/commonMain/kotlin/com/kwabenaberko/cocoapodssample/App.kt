package com.kwabenaberko.cocoapodssample

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun App(){
    Button(onClick = {}){
        Text(Greeting().greet())
    }
}