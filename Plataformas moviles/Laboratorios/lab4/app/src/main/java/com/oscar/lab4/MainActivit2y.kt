package com.oscar.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.oscar.lab4.ui.theme.Lab4Theme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Pantalla2( R.drawable.outline_add_home_24 , R.drawable.imagen_5)
                }
            }
        }
    }
}

@Composable
fun Pantalla2(@DrawableRes id5 : Int, @DrawableRes id6 : Int) {
    val outline_add_home_24 = painterResource(id = id5)
    val image5 = painterResource(id = id6)

    Column() {
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "My profile",
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                modifier = Modifier
                    .weight(1f)
                    .padding(5.dp),
                textAlign = TextAlign.Center,
                fontSize = 25.sp
            )
            Image(
                painter = outline_add_home_24,
                contentDescription = "Home o la tuerca de settings",
                contentScale = ContentScale.Inside,
                modifier = Modifier
                    .offset(y = 6.dp)
                    .padding(7.dp)
            )
        }
        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)

        ){
            Image(
                painter = image5,
                contentDescription = "biblioteca",
                contentScale = ContentScale.FillBounds
            )
            Text(
                text = "My profile",
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                modifier = Modifier
                    .padding(5.dp),
                textAlign = TextAlign.Center,
                fontSize = 25.sp ,
              
            )

        }




    }
}


@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun GreetingPreview2() {
    Lab4Theme {
        Pantalla2(
            R.drawable.outline_add_home_24,  R.drawable.imagen_5


        )
    }
}
