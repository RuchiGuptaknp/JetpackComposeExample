package com.example.jetpackcomposeexample.Utils

sealed class NavigationScreen(val route:String){

object FirstScreen:NavigationScreen("firstScreen")
    object SecondScreen:NavigationScreen("secondScreen")
}
