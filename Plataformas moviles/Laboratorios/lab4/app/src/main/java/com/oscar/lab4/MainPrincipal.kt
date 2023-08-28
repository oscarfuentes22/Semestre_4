package com.oscar.lab4

import android.content.Intent
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.oscar.lab4.ui.theme.Lab4Theme

class MainPrincipal : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Pantalla5()

                }
            }
        }
    }
}

@Composable
fun Pantalla5() {
    val context = LocalContext.current
    Modifier.background(Color.LightGray)
    Column (verticalArrangement = Arrangement.SpaceEvenly){
        Button(onClick = { Intent(context, MainActivity::class.java)
            .also { context.startActivity(it) } },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
            ,colors = ButtonDefaults.outlinedButtonColors(Color.Red)) {
            Text(text = "Home")
        }
        Button(onClick = { Intent(context, MainActivity2::class.java)
            .also { context.startActivity(it) } }
            ,modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                ,colors = ButtonDefaults.outlinedButtonColors(Color.Yellow)) {
            Text(text = "Profile")
        }
        Button(onClick = { Intent(context, MainActivity3::class.java)
            .also { context.startActivity(it) } }
            ,modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)) {
            Text(text = "Settings")
        }
        Button(onClick = { Intent(context, MainActivity4::class.java)
            .also { context.startActivity(it) } }
            ,modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
            ,colors = ButtonDefaults.outlinedButtonColors(Color.Green)) {
            Text(text = "Help")
        }
            
        }
    }



@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview5() {
    Lab4Theme {
        Pantalla5()
    }
}


