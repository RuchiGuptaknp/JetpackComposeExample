package com.example.jetpackcomposeexample.detail

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape

import com.example.jetpackcomposeexample.Utils.getData


import androidx.compose.material3.Card

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeexample.R
import com.example.jetpackcomposeexample.Utils.DataSource
import com.example.jetpackcomposeexample.ui.theme.JetpackComposeExampleTheme

class DetailScreen :ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeExampleTheme {
                RecyclerViewData(data = getData())


            }

        }
    }
        @Composable
        fun eachRowData(dataSource: DataSource){



        Card(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 10.dp)
            , shape = (RoundedCornerShape(CornerSize(10.dp))),
        ) {
            Row (modifier = Modifier.padding(10.dp)){
                Image(painter = painterResource(id = R.drawable.scenary_image),contentDescription = "Image ",
               modifier = Modifier
                   .padding(10.dp)
                   .size(80.dp)
                   .align(androidx.compose.ui.Alignment.CenterVertically)
                   .clip(RoundedCornerShape(CornerSize(10.dp))) )
                Text(text = dataSource.description, modifier = Modifier.padding(10.dp), fontSize = 20.sp)

            }

        }


    }
    @Composable
    fun RecyclerViewData(data:List<DataSource>){
        LazyColumn{
            items (data){
                eachRowData(it)
            }
        }
        
    }

}