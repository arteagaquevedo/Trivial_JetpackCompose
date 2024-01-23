package com.example.trivial.ui.menu.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.trivial.R

@Composable
fun menuScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(all = 16.dp)
    ){
        menu(Modifier.align(Alignment.Center))
    }
}

@Composable
fun menu(modifier: Modifier){

    Column(modifier) {
        headerImage()

    }
}

@Composable
fun headerImage(){
    Image(painter = painterResource(id = R.drawable.logotrivial ), contentDescription = "<a href=\"https://www.flaticon.es/iconos-gratis/trivial\" title=\"trivial iconos\">Trivial iconos creados por Icongeek26 - Flaticon</a>" )
}