package com.example.happy_birthday_harshdeep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happy_birthday_harshdeep.ui.theme.Happy_Birthday_HarshdeepTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Happy_Birthday_HarshdeepTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Harshdeep"," - from Harsh")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String,from:String, modifier: Modifier = Modifier) {

    Column(
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "HAPPY BIRTHDAY $name!",
            textAlign = TextAlign.Center,
            fontSize = 70.sp,
            lineHeight = 115.sp,
            modifier = modifier
        )
        Text(
            text = from,
            fontSize = 40.sp,
            lineHeight = 115.sp,
            modifier = modifier.align(Alignment.End).padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Happy_Birthday_HarshdeepTheme {
        Greeting("Harshdeep", " - from Harsh")
    }
}