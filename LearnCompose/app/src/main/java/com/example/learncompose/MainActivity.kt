package com.example.learncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learncompose.ui.theme.LearnComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Mahendran",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Column(
//        modifier = modifier
//            .background(Color.White)
////            .fillMaxSize()
////            .fillMaxWidth(),
//            .size(400.dp, 200.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.SpaceEvenly,
//    ) {
//        Text(
//            text = "Hello $name!",
//            color = Color.Black,
//            fontSize = 30.sp,
//        )
//        Text(
//            text = "Hello for 2nd time $name!",
//            color = Color.Black,
//            fontSize = 30.sp,
//        )
//    }
//    Row (
//        modifier = modifier
//            .background(Color.White)
//            .fillMaxSize()
//            .padding(10.dp),
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.SpaceBetween,
//    ){
//        Text(
//            text = name,
//            color = Color.Black,
//            fontSize = 30.sp,
//        )
//        Text(
//            text = name,
//            color = Color.Black,
//            fontSize = 30.sp,
//        )
//    }
//    Box(
//        modifier = modifier
//            .fillMaxSize()
//            .background(Color.White),
//    ){
//        Text(
//            text = name,
//            color = Color.Black,
//            fontSize = 30.sp,
//            modifier = modifier.align(Alignment.BottomEnd)
//        )
//        Text(
//            text = "Welcome $name",
//            color = Color.Black,
//            fontSize = 30.sp,
//        )
//    }
}
