package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtspaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtspaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpace()
                }
            }
        }
    }
}

@Composable
fun ArtLayout(imageResource: Int,  textResource: String, titleResource: String,modifier: Modifier){
    Column(
        verticalArrangement = Arrangement.Center ,
        horizontalAlignment = Alignment.CenterHorizontally  ) {
        Image(painter = painterResource(id = imageResource), contentDescription=  null, modifier = Modifier
            .padding(20.dp)
            .border(border = BorderStroke(2.dp, Color.Gray), shape = RectangleShape)
            .height(350.dp)
            .width(300.dp)
            .shadow(elevation = 4.dp, shape = RectangleShape)
            .padding(20.dp))
        Card(modifier = Modifier.padding(horizontal = 20.dp, vertical = 100.dp)){
            Column(modifier = Modifier.padding(30.dp))
            Text(
                text = titleResource,
                fontSize = 32.sp,
                fontWeight = FontWeight.Medium,
            )
            Text(
                text = textResource,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }

{}
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ArtspaceTheme {
        ArtSpace()
    }
}