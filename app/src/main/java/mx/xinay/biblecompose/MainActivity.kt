package mx.xinay.biblecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.xinay.biblecompose.ui.theme.BibleComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BibleComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

//@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OnBoardingCard() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.bg_red),
            contentDescription = "Background Image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            Modifier
                .padding(horizontal = 32.dp, vertical = 80.dp)
                .fillMaxSize()
        ) {
            Text(
                text = "Tu Biblia en Español",
                color = Color.White,
                fontSize = 36.sp,
                fontWeight = FontWeight.Black
            )
            Spacer(modifier = Modifier.fillMaxSize(0.6f))
            Box(
//        elevation = CardElevation( 4.dp),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .border(
                        width = 1.dp,
                        color = Color.White.copy(0.1f),
                        shape = RoundedCornerShape(27.dp)
                    )
                    .clip(RoundedCornerShape(27.dp))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bg_blue),
                    contentDescription = "Card Background",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(45.dp)
                ) {
                    Text(
                        text = "Tu Biblia en Español",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "You, Lord, are the Ruler of the nations.",
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.padding(bottom = 27.dp))
                    Button(
                        onClick = { /*TODO*/ },
                        shape = RoundedCornerShape(percent = 50),
                        modifier = Modifier.border(
                            width = 1.dp,
                            color = Color.White.copy(0.5f),
                            shape = RoundedCornerShape(percent = 50)
                        ),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(151, 169, 246, alpha = 0x32),
                            contentColor = Color.White
                        )
                    ) {
                        Text(
                            text = "Amen",
                            modifier = Modifier.padding(horizontal = 40.dp, vertical = 4.dp),
                            fontSize = 15.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun CardExample() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(20.dp)) {
        Box(
//            elevation = 4.dp,
        ) {
            Image(painter = painterResource(id = R.drawable.bg_red), contentDescription = null)
            Column(modifier = Modifier.padding(10.dp)) {
                Text("AB CDE", fontWeight = FontWeight.W700)
                Text("+0 12345678")
                Text("XYZ city", fontWeight = FontWeight.W300)
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "¡Hola $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BibleComposeTheme {
        OnBoardingCard()
//        CardExample()
    }
}
