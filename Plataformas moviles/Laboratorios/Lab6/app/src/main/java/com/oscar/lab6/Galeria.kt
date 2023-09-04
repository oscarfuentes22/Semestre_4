package com.oscar.lab6

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.oscar.lab6.ui.theme.Lab6Theme


class Galeria : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab6Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    fotos()
                }
            }
        }
    }
}
@Composable
fun fotos() {
    var num = 0
    Column(){
        Spacer(modifier = Modifier.padding(10.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Button(
                onClick = {
                    if(num == 0){
                        num = 0
                    }else{
                        num--
                    }
                },
                modifier = Modifier
                    .width(100.dp)
                    .height(50.dp)
            ) {
                Text(text = "Anterior")
            }
            Button(
                onClick = {
                    if(num == 0){
                        num = 0
                    }else{
                        num++
                    }
                },
                modifier = Modifier
                    .width(100.dp)
                    .height(50.dp)
            ) {
                Text(text = "next")
            }
        }
        when(num){
             0 -> {
                 with(
                     Image(
                         painter = painterResource(id = R.drawable.tu_me_dejaste_de_queres),
                         contentDescription = "Imagen 1",
                         modifier = Modifier
                             .fillMaxWidth()
                             .height(600.dp),
                         contentScale = ContentScale.Crop
                     )
                 ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(500.dp)
                        ) {
                            this
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(600.dp)
                                    .background(
                                        Brush.verticalGradient(
                                            colors = listOf(
                                                Color.Transparent,
                                                Color.Black
                                            )
                                        )
                                    )
                                    .padding(10.dp),
                                verticalArrangement = Arrangement.Bottom
                            ) {
                                Text(
                                    text = "Tu me dejaste de querer",
                                    color = Color.White,
                                    fontSize = 30.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "C Tangana",
                                    color = Color.White,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                 }
            }
            1 -> {
                with(
                    Image(
                        painter = painterResource(id = R.drawable.casualidad),
                        contentDescription = "Imagen 2",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(650.dp),
                        contentScale = ContentScale.Crop
                    )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(500.dp)
                    ) {
                        this
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(600.dp)
                                .background(
                                    Brush.verticalGradient(
                                        colors = listOf(
                                            Color.Transparent,
                                            Color.Black
                                        )
                                    )
                                )
                                .padding(10.dp),
                            verticalArrangement = Arrangement.Bottom
                        ) {
                            Text(
                                text = "CASUALIDAD",
                                color = Color.White,
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Mora",
                                color = Color.White,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
            2 -> {
                with(
                    Image(
                        painter = painterResource(id = R.drawable.en_la_orilla),
                        contentDescription = "Imagen 3",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(650.dp),
                        contentScale = ContentScale.Crop
                    )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(500.dp)
                    ) {
                        this
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(600.dp)
                                .background(
                                    Brush.verticalGradient(
                                        colors = listOf(
                                            Color.Transparent,
                                            Color.Black
                                        )
                                    )
                                )
                                .padding(10.dp),
                            verticalArrangement = Arrangement.Bottom
                        ) {
                            Text(
                                text = "En la orilla",
                                color = Color.White,
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "mora",
                                color = Color.White,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
            3 -> {
                with(
                    Image(
                        painter = painterResource(id = R.drawable.flores_en_an_nimo),
                        contentDescription = "Imagen 4",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(650.dp),
                        contentScale = ContentScale.Crop
                    )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(500.dp)
                    ) {
                        this
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(600.dp)
                                .background(
                                    Brush.verticalGradient(
                                        colors = listOf(
                                            Color.Transparent,
                                            Color.Black
                                        )
                                    )
                                )
                                .padding(10.dp),
                            verticalArrangement = Arrangement.Bottom
                        ) {
                            Text(
                                text = "Flores en anónimo",
                                color = Color.White,
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "eladio",
                                color = Color.White,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
            4 -> {
                with(
                    Image(
                        painter = painterResource(id = R.drawable.golden_hour),
                        contentDescription = "Imagen 3",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(650.dp),
                        contentScale = ContentScale.Crop
                    )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(500.dp)
                    ) {
                        this
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(600.dp)
                                .background(
                                    Brush.verticalGradient(
                                        colors = listOf(
                                            Color.Transparent,
                                            Color.Black
                                        )
                                    )
                                )
                                .padding(10.dp),
                            verticalArrangement = Arrangement.Bottom
                        ) {
                            Text(
                                text = "Golden hour",
                                color = Color.White,
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "jvke",
                                color = Color.White,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
            5 -> {
                with(
                    Image(
                        painter = painterResource(id = R.drawable.leave_me_like_this),
                        contentDescription = "Imagen 6",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(650.dp),
                        contentScale = ContentScale.Crop
                    )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(500.dp)
                    ) {
                        this
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(600.dp)
                                .background(
                                    Brush.verticalGradient(
                                        colors = listOf(
                                            Color.Transparent,
                                            Color.Black
                                        )
                                    )
                                )
                                .padding(10.dp),
                            verticalArrangement = Arrangement.Bottom
                        ) {
                            Text(
                                text = "leave me like this",
                                color = Color.White,
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Skrillex",
                                color = Color.White,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
            6 -> {
                with(
                    Image(
                        painter = painterResource(id = R.drawable.lo_que_hay_x_aqui),
                        contentDescription = "Imagen 3",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(650.dp),
                        contentScale = ContentScale.Crop
                    )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(500.dp)
                    ) {
                        this
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(600.dp)
                                .background(
                                    Brush.verticalGradient(
                                        colors = listOf(
                                            Color.Transparent,
                                            Color.Black
                                        )
                                    )
                                )
                                .padding(10.dp),
                            verticalArrangement = Arrangement.Bottom
                        ) {
                            Text(
                                text = "Lo que hay aquí",
                                color = Color.White,
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "rels b",
                                color = Color.White,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
            7 -> {
                with(
                    Image(
                        painter = painterResource(id = R.drawable.rara_vez),
                        contentDescription = "Imagen 3",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(650.dp),
                        contentScale = ContentScale.Crop
                    )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(500.dp)
                    ) {
                        this
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(600.dp)
                                .background(
                                    Brush.verticalGradient(
                                        colors = listOf(
                                            Color.Transparent,
                                            Color.Black
                                        )
                                    )
                                )
                                .padding(10.dp),
                            verticalArrangement = Arrangement.Bottom
                        ) {
                            Text(
                                text = "Rara vez",
                                color = Color.White,
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "milo j",
                                color = Color.White,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
            8 -> {
                with(
                    Image(
                        painter = painterResource(id = R.drawable.rincon),
                        contentDescription = "Imagen 3",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(650.dp),
                        contentScale = ContentScale.Crop
                    )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(500.dp)
                    ) {
                        this
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(600.dp)
                                .background(
                                    Brush.verticalGradient(
                                        colors = listOf(
                                            Color.Transparent,
                                            Color.Black
                                        )
                                    )
                                )
                                .padding(10.dp),
                            verticalArrangement = Arrangement.Bottom
                        ) {
                            Text(
                                text = "Rincón",
                                color = Color.White,
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "milo j",
                                color = Color.White,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
            9 -> {
                with(
                    Image(
                        painter = painterResource(id = R.drawable.sustancia),
                        contentDescription = "Imagen 3",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(650.dp),
                        contentScale = ContentScale.Crop
                    )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(500.dp)
                    ) {
                        this
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(600.dp)
                                .background(
                                    Brush.verticalGradient(
                                        colors = listOf(
                                            Color.Transparent,
                                            Color.Black
                                        )
                                    )
                                )
                                .padding(10.dp),
                            verticalArrangement = Arrangement.Bottom
                        ) {
                            Text(
                                text = "Sustancia",
                                color = Color.White,
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "judeline",
                                color = Color.White,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
        }


    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}



@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true,
        showSystemUi = true)
@Composable
fun GreetingPreview() {
    Lab6Theme {
        fotos()
    }
}