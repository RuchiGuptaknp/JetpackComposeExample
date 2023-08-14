package com.example.jetpackcomposeexample.login

import android.content.Intent
import android.os.Bundle

import android.widget.Toast

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon

import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.jetpackcomposeexample.detail.DetailScreen
import com.example.jetpackcomposeexample.ui.theme.JetpackComposeExampleTheme

class LoginScreen :ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeExampleTheme {

              loginPage()

            }
        }
    }

    fun loggedIn(name:String,password:String){
        if (name=="Ruchi Gupta"&&password=="ruchi@1234"){
         Toast.makeText(this,"Login Successfully",Toast.LENGTH_LONG).show()
            val intent= Intent(this,DetailScreen::class.java)
            startActivity(intent)
        }else{
            Toast.makeText(this,"Invalid password",Toast.LENGTH_LONG).show()
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun loginPage(){
        val userName= remember { mutableStateOf("") }
        val password= remember {
            mutableStateOf("") }
        Column( modifier= Modifier
            .fillMaxSize()
            .padding(30.dp),
        verticalArrangement = Arrangement.Center) {


          Text(text = "Hello Again", color = Color.Blue, fontSize = 30.sp, fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold)
            Text(text = "Welcome", color = Color.Blue, fontSize = 30.sp, fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold)
            Text(text = "Back!!", color = Color.Blue, fontSize = 30.sp, fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold)

            OutlinedTextField(value = userName.value, onValueChange ={
                userName.value=it
            }, leadingIcon = {
               Icon(Icons.Default.Person, contentDescription = "Person")
            }, label = {
                Text(text = "UserName")
            }, placeholder = {
                Text(text = "Enter User Name")
            }, modifier= Modifier.fillMaxWidth())

            OutlinedTextField(value = password.value, onValueChange ={
                password.value=it
            }, leadingIcon = {
                Icon(Icons.Default.Info, contentDescription = "Password")
            }, label = {
                Text(text = "Password")
            }, placeholder = {
                Text(text = "Enter Password")
            },  modifier= Modifier.fillMaxWidth())

    OutlinedButton(onClick = { loggedIn(userName.value,password.value)} ,modifier= Modifier.fillMaxWidth()) {
    Text(text = "LOGIN", fontSize = 20.sp, color = Color.Black)

}


        }

    }

}