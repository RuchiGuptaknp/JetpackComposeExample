package com.example.jetpackcomposeexample.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.jetpackcomposeexample.Utils.NavigationScreen

@Composable
fun FirstScreen(navHostController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello, Jetpack Compose!", fontSize = 24.sp, color = Color.Black)

        Spacer(modifier = Modifier.height(16.dp))



        Button(onClick = {navHostController.navigate(NavigationScreen.SecondScreen.route) }, modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)) {
            Text(text = "Click on the Second Screen")
    }



    }
}