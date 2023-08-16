package com.oscar.prueba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.oscar.prueba.ui.theme.PruebaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PruebaTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Oscar22", Modifier, "22763")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier , carnet: String){
    Surface(color = Color.Cyan) {
        Text(
            text = "Hello mi nombre es $name! y mi carnet es $carnet",
            modifier = modifier.padding(24.dp),
            color= Color.Red,
            fontSize = 24.sp
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true )
@Composable
fun GreetingPreview() {
    PruebaTheme {
        Greeting("Oscar22" ,Modifier , "22763")
    }
}