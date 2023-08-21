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

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Pantalla3( R.drawable.baseline_check_24,
                        R.drawable.imagen_5,
                        R.drawable.perfil,
                    )
                }
            }
        }
    }
}

@Composable
fun Pantalla3(@DrawableRes id5 : Int,
              @DrawableRes id6 : Int,
              @DrawableRes id7 : Int,

              ) {
    val outline_add_home_24 = painterResource(id = id5)
    Modifier.background(Color.LightGray)

    Column() {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = outline_add_home_24,
                contentDescription = "Home o la tuerca de settings",
                contentScale = ContentScale.Inside,
                modifier = Modifier
                    .offset(y = 6.dp)
                    .padding(7.dp)
            )
            Text(
                text = "Settings",
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                modifier = Modifier
                    .weight(1f)
                    .padding(15.dp),
                textAlign = TextAlign.Center,
                fontSize = 25.sp
            )
        }
        opcionunTextos(
            idImagen = R.drawable.outline_person_outline_24, texto = "Edit Profile" , descrip = "persona"
        )
        opcionunTextos(
            idImagen = R.drawable.outline_mail_24, texto = "Email Addresses" , descrip = "mail"
        )
        opcionunTextos(
            idImagen = R.drawable.outline_notifications_active_24, texto = "Notifications" , descrip = "campana"
        )
        opcionunTextos(
            idImagen = R.drawable.baseline_block_24, texto = "Privacy" , descrip = "block"
        )
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(10.dp)
            .background(Color.LightGray)
        )
        opcion2Textos(
            idImagen = R.drawable.outline_help_outline_24, texto1 = "Help & Feedback", texto2 = "Troubleshooting tips and guides", descript = "pregunta"
        )
        opcion2Textos(
            idImagen = R.drawable.outline_info_24, texto1 = "About", texto2 = "App information and documents", descript = "exclamacion"
        )
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(10.dp)
            .background(Color.LightGray)
        )

        Text(
            text = "Logout",
            textAlign = TextAlign.Center,
            color = Color.Red,
            modifier = Modifier.fillMaxWidth().padding(15.dp),
        )
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.LightGray)
        )


    }
}
@Composable
fun opcion2Textos(@DrawableRes idImagen : Int, texto1 : String, texto2: String, descript: String){
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
            contentDescription = descript,
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .padding(5.dp)
        )
        Column {
            Text(
                text = texto1,
                fontSize = 21.sp,
            )

            Text(
                text = texto2,
                fontSize = 13.sp
            )
        }
    }
}
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview3() {
    Lab4Theme {
        Pantalla3(
            R.drawable.baseline_check_24,
            R.drawable.imagen_5,
            R.drawable.perfil,

        )
    }
}


