package com.oscar.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Pantalla1( R.drawable.imagen1 , R.drawable.icone_de_service_noir, R.drawable.imagen_2, R.drawable.images_3_conv, R.drawable.imagen_4,)
                }
            }
        }
    }
}

@Composable
fun Pantalla1(@DrawableRes id1 : Int ,@DrawableRes id2 : Int, @DrawableRes id3 : Int ,@DrawableRes id4 : Int, @DrawableRes id5 : Int ) {
    val image1 = painterResource(id = id1)
    val image2 = painterResource(id = id2)
    val image3 = painterResource(id = id3)
    val image4 = painterResource(id = id4)
    val image5 = painterResource(id = id5)
    Column(
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = "Campus Destacado",
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            textAlign = TextAlign.Center,
            fontSize = 25.sp

        )
        Image(
            painter = image1,
            contentDescription = "Equipo",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )

        Text(
            text = "Destacados",
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            fontStyle = FontStyle.Italic,
            color = Color.Gray,
            fontSize = 25.sp
        )
        Row (modifier = Modifier.fillMaxWidth().height(163.dp)){
            Column (modifier = Modifier.weight(1f).padding(5.dp)) {
                Image(
                    painter = image2,
                    contentDescription = "Equipo",
                    modifier = Modifier.fillMaxWidth().height(120.dp),
                    contentScale = ContentScale.Inside
                )
                Surface( color = Color(34,153,84,), modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Service",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(5.dp)
                    )
                }

            }
            Column (modifier = Modifier.weight(1f)) {
                Image(
                    painter = image3,
                    contentDescription = "Equipo",
                    modifier = Modifier.fillMaxWidth().height(125.dp).padding(5.dp),
                    contentScale = ContentScale.Inside)
                Surface(color = Color.LightGray ,  modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Actualidad UVG",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(5.dp)
                    )

                }


            }

        }
        Text(
            text = "Servicios y recursos",
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            fontStyle = FontStyle.Italic,
            color = Color.Gray,
            fontSize = 25.sp

        )
        Row(modifier = Modifier.fillMaxWidth().height(300.dp)) {
            Column(modifier = Modifier.weight(1f)) {
                Image(
                    painter = image5,
                    contentDescription = "Equipo",
                    modifier = Modifier.fillMaxWidth().height(150.dp).padding(5.dp),
                    contentScale = ContentScale.Inside
                )
                Surface( color = Color(34,153,84),  modifier = Modifier.fillMaxWidth().padding(5.dp)) {
                    Text(
                        text = "Directorio de servicion ",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(5.dp)
                    )
                }

            }
            Column(modifier = Modifier.weight(1f)) {
                Image(
                    painter = image4,
                    contentDescription = "Equipo",
                    modifier = Modifier.fillMaxWidth().height(150.dp).padding(5.dp) ,
                    contentScale = ContentScale.Inside
                )
                Surface(color = Color.LightGray,  modifier = Modifier.fillMaxWidth().padding(5.dp)) {
                    Text(
                        text = "Portal web UVG",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(5.dp)
                    )

                }


            }

        }
    }
}


@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun GreetingPreview() {
    Lab4Theme {
        Pantalla1(
            R.drawable.imagen1,
            R.drawable.icone_de_service_noir,
            R.drawable.imagen_2,
            R.drawable.images_3_conv,
            R.drawable.imagen_4,

        )
    }
}
