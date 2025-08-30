/*
 * Copyright (c) 2025. Pranam.
 * ORCID: https://orcid.org/0009-0007-9316-3616
 *
 * This code is licensed under the MIT License.
 *
 * You may obtain a copy of the License at https://opensource.org/licenses/MIT
 *
 * Attribution:
 * If you use this code, please provide appropriate credit to the original author.
 * For example: "This code is based on work by Pranam whose ORCID is https://orcid.org/0009-0007-9316-3616."
 */

package phd.pranam.happybirthday

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import phd.pranam.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingImage(message = "Happy Birthday, Ram!", from = "Sitha", modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Composable
fun GreetingText(modifier: Modifier = Modifier, message: String, from: String) {
    Column(modifier = modifier, verticalArrangement = Arrangement.Center) {
        Text(text = message, fontSize = 100.sp, lineHeight = 116.sp)
        Text(text = from, fontSize = 36.sp, modifier = Modifier
            .padding(16.dp)
            .align(alignment = Alignment.End))
    }
}
@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(painter = image, contentDescription = null, contentScale = ContentScale.Crop, alpha = 0.5F)

        GreetingText(message = "Happy Birthday, Ram!", from = "Sitha", modifier = Modifier.fillMaxSize())
    }
}

@Preview(showBackground = true)
@Composable
fun HappyBirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingImage(message = "Happy Birthday, Android!", from = "Android User", modifier = Modifier)
    }
}