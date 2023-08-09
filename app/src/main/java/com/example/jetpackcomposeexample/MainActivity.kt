@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.jetpackcomposeexample

import android.annotation.SuppressLint
import android.os.Bundle
import android.provider.CalendarContract
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeexample.OnBoardingScreen.ViewPagerScreen
import com.example.jetpackcomposeexample.ui.theme.JetpackComposeExampleTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeExampleTheme {
                ViewPagerScreen()
                // A surface container using the 'background' color from the theme
             /*   Scaffold(
                    topBar = {
                        TopAppBar(
                            title= {
                                Text("Compose Example")
                            }, navigationIcon = {
                                IconButton(onClick = { }) {
                                    Icon(Icons.Default.Menu , "Menu" )


                                    }

                                }, actions = {
                                IconButton(onClick = { }) {
                                    Icon(Icons.Default.Search , "Search" )

                                }
                                IconButton(onClick = { }) {
                                    Icon(Icons.Default.Notifications , "Notification" )


                                }
                            }
                        )
                    }, floatingActionButton = {
                        IconButton(onClick = { }) {
                            Icon(Icons.Default.Add, "ADD")

        }
    }
                ){

                }
*/
            }

        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
@Composable
fun showSwitch(){
    val isChecked= remember {
        mutableStateOf(true)
    }
    Switch(
        checked = isChecked.value, onCheckedChange = {
            isChecked.value=it
        }, modifier = Modifier.run {
            size(40.dp)
            padding(80.dp)
        })


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeExampleTheme {
        Greeting("Android")
        showSwitch()
    }
}
