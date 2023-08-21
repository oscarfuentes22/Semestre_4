package com.oscar.lab4

import android.os.Bundle
import android.os.ParcelFileDescriptor
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
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
                    Pantalla2( R.drawable.outline_add_home_24,
                        R.drawable.imagen_5,
                        R.drawable.perfil,
                    )
                }
            }
        }
    }
}

@Composable
fun Pantalla2(@DrawableRes id5 : Int,
              @DrawableRes id6 : Int,
              @DrawableRes id7 : Int,

              ) {
    val outline_add_home_24 = painterResource(id = id5)
    val image5 = painterResource(id = id6)
    val image6 = painterResource(id = id7)



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
                .height(200.dp)

        ) {
            Image(
                painter = image5,
                contentDescription = "biblioteca",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .alpha(0.8f)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = 110.dp)
                    .clip(RoundedCornerShape(75.dp))
            ) {
                Image(
                    painter = image6,
                    contentDescription = "perfil",
                    modifier = Modifier
                        .padding(5.dp)
                        .width(150.dp)
                        .height(150.dp)
                        .border(
                            width = 2.dp,
                            color = Color.Black,
                            shape = RoundedCornerShape(75.dp)
                        )
                        .clip(RoundedCornerShape(75.dp))
                        .align(Alignment.Center)
                        .fillMaxSize()
                        .background(Color.LightGray),
                    contentScale = ContentScale.Crop

                )
            }
        }

        Spacer(Modifier.height(70.dp))
        Text(
            text = "Julio Martinez",
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            modifier = Modifier
                .padding(5.dp)
                .offset(x = 100.dp),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,

            )
        opcionDosTextos(
            idImagen = R.drawable.icone_de_service_noir
        )
        opcionunTextos(
            idImagen = R.drawable.perfil, texto = "My Friends", descrip = "amigos"
        )
        opcionunTextos(
            idImagen = R.drawable.outline_calendar_month_24, texto = "Calendar", descrip = "calendario"
        )
        opcionunTextos(
            idImagen = R.drawable.outline_book_24, texto = "My Couses" , descrip = "cursos"
        )
        opcionunTextos(
            idImagen = R.drawable.baseline_grading_24, texto = "My Grades" , descrip = "notas"
        )
        opcionunTextos(
            idImagen = R.drawable.baseline_fingerprint_24, texto = "My Groups" , descrip = "grupos"
        )
        opcionunTextos(
            idImagen = R.drawable.outline_event_24, texto = "My Upcoming Events" , descrip = "eventos"
        )
    }
}
@Composable
fun opcionDosTextos(@DrawableRes idImagen : Int){
    Spacer(modifier = Modifier
        .fillMaxWidth()
        .height(1.dp)
        .background(Color.LightGray)
    )
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = idImagen),
            contentDescription = "perfil",
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .padding(5.dp)
        )
        Column {
            Text(
                text = "My campus",
                color = Color.Gray
            )

            Text(
                text = "Campus Central")
        }
    }
}
@Composable
fun opcionunTextos(@DrawableRes idImagen : Int, texto :  String, descrip : String) {
    Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(Color.LightGray)
    )
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = idImagen),
            contentDescription = descrip,
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .padding(5.dp)
        )
        Column {
            Text(
                text = texto,

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
            R.drawable.outline_add_home_24,
            R.drawable.imagen_5,
            R.drawable.perfil,

        )
    }
}


