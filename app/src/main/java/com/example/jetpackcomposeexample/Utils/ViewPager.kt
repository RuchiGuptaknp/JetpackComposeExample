package com.example.jetpackcomposeexample.Utils

import androidx.annotation.DrawableRes
import com.example.jetpackcomposeexample.R

data class ViewPager(
   @DrawableRes val image:Int,
    val description:String

)
val dataList= listOf(
    ViewPager(R.drawable.img_stay_home,"Home Screen"),
            ViewPager(R.drawable.img_elearning,"Learning Screen"),
            ViewPager(R.drawable.img_stay_home,"Stay Home Screen"),
            ViewPager(R.drawable.img_online_shopping,"Online Shopping Screen"),
            ViewPager(R.drawable.img_painting,"Painting Screen"),
            ViewPager(R.drawable.img_working,"Working  Screen"),
            ViewPager(R.drawable.img_video_calling,"Video  Screen"),
            ViewPager(R.drawable.img_chatting,"Chatting Screen ")
)
