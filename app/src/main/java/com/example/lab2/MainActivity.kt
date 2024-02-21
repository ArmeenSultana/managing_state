package com.example.lab2

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab2.ui.theme.Lab2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(8.dp) // margin
                .border(2.dp, Color.White) // outer border
                .padding(8.dp) // space between the borders
                .border(2.dp, Color.Green) // inner border
                .padding(8.dp) // padding.padding(8.dp) // margin
                .border(2.dp, Color.White) // outer border
                .padding(8.dp) // space between the borders
                .border(2.dp, Color.Green) // inner border
                .padding(8.dp) // padding
                .border(width = 1.dp, color = Color.DarkGray),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Greeting(name = "Jamal")
            }
        }
    }
}

val colors = listOf<Color>(Color.Magenta, Color.Green, Color.DarkGray, Color.Cyan, Color.LightGray)
var index = 0
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val color = remember {
        mutableStateOf(colors[index])
    }

    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = color.value
        ),

        onClick = {
            Log.d("Checking Error", "Error here")
            index = (index+1) % colors.size
            color.value = colors[index]
        }
    ) {
        Text(
            text = name,
            modifier = modifier
        )
    }
}