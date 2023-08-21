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
import androidx.compose.foundation.shape.CornerSize
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
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.oscar.lab4.ui.theme.Lab4Theme

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Pantalla4( R.drawable.baseline_check_24,
                    )
                }
            }
        }
    }
}

@Composable
fun Pantalla4(@DrawableRes id5 : Int, ) {
    val outline_add_home_24 = painterResource(id = id5)
    val outline_people_24 = painterResource(id = id6)
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
                text = "Emergency Contacts",
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                modifier = Modifier
                    .weight(1f)
                    .padding(15.dp),
                textAlign = TextAlign.Center,
                fontSize = 25.sp
            )
        }
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(Color.LightGray)
        )
        Column {
            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .height(75.dp)
                    .fillMaxWidth()
            ){
                Image(
                    painter = painterResource(id = R.drawable.outline_groups_2_24) ,
                    contentDescription ="group",
                    modifier = Modifier
                        .padding(5.dp)
                        .width(50.dp)
                        .height(50.dp)
                        .border(
                            width = 2.dp,
                            color = Color.LightGray,
                        )
                )
                Column (
                    modifier = Modifier
                        .padding(5.dp)
                ){
                    Text(
                        text = "Emergencias",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(1.dp),
                    )
                    Text(
                        text = "Si se presenta un incidente o un percance porfavor marca el número de emergencia. ",
                        fontSize = 13.sp,
                        modifier = Modifier
                            .padding(1.dp)
                            .fillMaxWidth(),
                        lineHeight = 15.sp
                    )

                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 60.dp, vertical = 0.dp)
            ) {

                Row(
                    modifier = Modifier
                        .background(color = Color(34, 153, 84,))
                        .height(30.dp)
                        .border(
                            width = 2.dp,
                            color = Color(34, 153, 84,),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .clip(
                            RoundedCornerShape(10.dp)
                        )

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_phone_enabled_24),
                        contentDescription = "telefono",
                        modifier = Modifier
                            .padding(5.dp)
                    )
                    Text(
                        text = "call 5978-1736",
                        color = Color.White,
                        modifier = Modifier
                            .weight(1f))
                }
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color.LightGray)
            )

        }
        Column {
            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .height(75.dp)
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.outline_groups_2_24),
                    contentDescription = "group",
                    modifier = Modifier
                        .padding(5.dp)
                        .width(50.dp)
                        .height(50.dp)
                        .border(
                            width = 2.dp,
                            color = Color.LightGray,
                        )
                )
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                ) {
                    Text(
                        text = "Clinicas Uvg ",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(1.dp),
                    )
                    Text(
                        text = "Si se presenta un incidente o un percance porfavor marca el número de emergencia. ",
                        fontSize = 13.sp,
                        modifier = Modifier
                            .padding(1.dp)
                            .fillMaxWidth(),
                        lineHeight = 15.sp
                    )

                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 60.dp, vertical = 0.dp)
            ) {

                Row(
                    modifier = Modifier
                        .background(color = Color(34, 153, 84,))
                        .height(30.dp)
                        .border(
                            width = 2.dp,
                            color = Color(34, 153, 84,),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .clip(
                            RoundedCornerShape(10.dp)
                        )

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_phone_enabled_24),
                        contentDescription = "telefono",
                        modifier = Modifier
                            .padding(5.dp)
                    )
                    Text(
                        text = "call 5978-1736",
                        color = Color.White,
                        modifier = Modifier
                            .weight(1f)
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
fun GreetingPreview4() {
    Lab4Theme {
        Pantalla4(
            R.drawable.baseline_check_24,


        )
    }
}


