package com.example.jetpackcomposeexample.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.jetpackcomposeexample.ui.theme.JetpackComposeExampleTheme

class NavigationActivity:ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeExampleTheme {
                StartNavigation()

            }
        }
    }
}