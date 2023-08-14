@file:OptIn(ExperimentalPagerApi::class)
package com.example.jetpackcomposeexample.OnBoardingScreen
import android.content.Intent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeexample.R
import com.example.jetpackcomposeexample.Utils.ViewPager
import com.example.jetpackcomposeexample.Utils.dataList
import com.example.jetpackcomposeexample.login.LoginScreen
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun ViewPagerScreen(){
    val pagerState= rememberPagerState()
    val context = LocalContext.current
    Column {
        HorizontalPager(
            count = dataList.size, state = pagerState, modifier = Modifier
                .fillMaxWidth()
                .weight(1f)

        ) { pager->
            pageUi(viewPager = dataList[pager])
            
        }
    HorizontalPagerIndicator(pagerState = pagerState,modifier=Modifier.align(CenterHorizontally).padding(20.dp),
    activeColor = colorResource(id = R.color.purple_500)
)
        AnimatedVisibility(visible =pagerState.currentPage==7 ) {
            Button(onClick = {context.startActivity(Intent(context, LoginScreen::class.java))  }, modifier = Modifier.fillMaxWidth()) {
                Text(text = "Getting Started")
                
            }
        }
    }
}

@Composable
fun pageUi(viewPager: ViewPager){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = viewPager.image ),
            contentDescription = viewPager.description, modifier = Modifier.size(250.dp).align(CenterHorizontally))
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = viewPager.description, modifier = Modifier.align(CenterHorizontally), color = Color.Black)

    }

}