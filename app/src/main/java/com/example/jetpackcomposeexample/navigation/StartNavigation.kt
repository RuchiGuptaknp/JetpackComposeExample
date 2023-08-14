package com.example.jetpackcomposeexample.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposeexample.Utils.NavigationScreen

@Composable
fun StartNavigation(){
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = NavigationScreen.FirstScreen.route ){
        composable(NavigationScreen.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(NavigationScreen.SecondScreen.route){
          SecondScreen()
        }
    }
}