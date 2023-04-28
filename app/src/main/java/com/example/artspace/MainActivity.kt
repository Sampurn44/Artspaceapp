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
fun ArtSpace(){
    var result by remember {
        mutableStateOf(1)
    }
    when (result) {
        1 -> ArtLayout(
            imageResource = R.drawable.mona_lisa_c_1503_1519, textResource = (stringResource(
                id = R.string.Mona
            )), titleResource = (stringResource(id = R.string.vinci)), modifier = Modifier
        )
        2-> ArtLayout(imageResource = R.drawable.thekiss, textResource = (stringResource(
            id = R.string.Thekiss
        )) , titleResource = (stringResource(id = R.string.kiss)), modifier =Modifier )
        3-> ArtLayout(imageResource = R.drawable.thestarry, textResource = (stringResource(
            id = R.string.StarryNight
        )) , titleResource = (stringResource(id = R.string.starry)), modifier =Modifier )
    }
    }

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ArtspaceTheme {
        ArtSpace()
    }
}