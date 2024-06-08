package com.example.learncompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
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
                Scaffold(modifier = Modifier.fillMaxSize()) { safePadding ->
//                    Greeting(
//                        name = "Mahendran M",
//                        modifier = Modifier.padding(padding)
//                    )
//                    CounterApp(
//                        modifier = Modifier.padding(safePadding)
//                    )
                    SimpleListApp(
                        modifier = Modifier.padding(safePadding)
                    )
                }
            }
        }
    }
}

@Composable
fun SimpleListApp (modifier: Modifier = Modifier) {
    var data by remember {
        mutableStateOf("")
    }

    var dataList by remember {
        mutableStateOf(listOf<String>())
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(18.dp)
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            OutlinedTextField(
                value = data,
                onValueChange = { text ->
                    data = text
                }
            )
            Button(onClick = {
                if(data.isNotEmpty()){
                    dataList += data
                    data = ""
                }
            }) {
                Text(
                    text = "Add"
                )
            }
        }
        LazyColumn {
            items(dataList){ currData ->
                Text(
                    text = currData,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(16.dp)
                )
                Divider()
            }
        }
    }
}

@Composable
fun CounterApp(modifier: Modifier = Modifier) {
    var count by remember {
        mutableStateOf(0)
    }
    val context = LocalContext.current
       Column(
           modifier = modifier
               .fillMaxSize()
               .background(Color.White),
           horizontalAlignment = Alignment.CenterHorizontally,
           verticalArrangement = Arrangement.Center,
       ) {
            Text(
                text = "$count",
                color = Color.Black,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
            )
           Button(onClick = {
               count++
               Toast.makeText(context, if(count < 10) "Button Clicked" else "enough Clicking Button", Toast.LENGTH_SHORT).show()
           }) {
               Text(
                   text = "Click"
               )
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
//    Column(
//        modifier = modifier
//            .fillMaxSize(),
//        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.CenterHorizontally,
//    ){
//        val res:String = if(name.length > 10)  "> 10 So Add Displayed" else "< 10 So Android Displayed"
//        Text(
//            text = name,
//            color = Color.Gray,
//            fontSize = 30.sp,
//            fontWeight = FontWeight.Bold,
//        )
//        Text(
//            text = "Length is ${name.length} $res",
//            color = Color.Gray,
//            fontSize = 30.sp,
//            fontWeight = FontWeight.Bold,
//        )
//        if(name.length > 10){
//            Icon(
//                imageVector =  Icons.Default.Add,
//                contentDescription = null,
//                tint = Color.White,
//                modifier = modifier
//                    .background(Color.Green)
//                    .height(60.dp)
//                    .width(60.dp)
//            )
//        }else{
//            Image(
//                painter = painterResource(id = R.drawable.ic_launcher_foreground),
//                contentDescription = null,
//                modifier = modifier
//                    .background(Color.Yellow)
//            )
//        }
//
//    }
//    Column (
//        modifier = modifier
//            .fillMaxSize()
//            .background(Color.Black),
//        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.CenterHorizontally,
//    ){
//        for(i in 1..5){
//            Image(
//                painter = painterResource(id = R.drawable.ic_launcher_foreground),
//                contentDescription = null,
//                modifier = modifier
//                    .background(Color.Yellow)
//            )s
//        }
//    }
//    LazyColumn (
//        modifier = modifier
//            .fillMaxSize()
//            .background(Color.Black),
//        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.CenterHorizontally,
//    ){
//        items(count = 10){i ->
//            Image(
//                painter = painterResource(id = R.drawable.ic_launcher_foreground),
//                contentDescription = null,
//                modifier = modifier
//                    .background(Color.Yellow)
//            )
//        }
//    }
//    LazyRow (
//        modifier = modifier
//            .fillMaxSize()
//            .background(Color.Black),
//        horizontalArrangement = Arrangement.SpaceEvenly,
//        verticalAlignment = Alignment.CenterVertically,
//    ){
//        items(count = 10){ i->
//            if(i > 5){
//                Icon(
//                    imageVector =  Icons.Default.Add,
//                    contentDescription = null,
//                    tint = Color.White,
//                    modifier = modifier
//                        .height(30.dp)
//                        .width(30.dp)
//                        .clip(CircleShape)
//                        .background(Color.Green)
//                )
//            }else{
//                Image(
//                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
//                    contentDescription = null,
//                    modifier = modifier
//                        .background(Color.Yellow)
//                )
//            }
//        }
//    }
}
