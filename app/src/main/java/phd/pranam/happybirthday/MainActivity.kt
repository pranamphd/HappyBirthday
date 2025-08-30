package phd.pranam.happybirthday

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import phd.pranam.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                }
            }
        }
    }
}
@Composable
fun GreetingText(modifier: Modifier = Modifier, message: String, from: String) {
    Row {
        Text(text = message, fontSize = 30.sp, lineHeight = 116.sp)
        Text(text = from, fontSize = 36.sp)
    }
}
@Preview(showBackground = true)
@Composable
fun HappyBirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingText(message = "Happy Birthday, Android!", from = "Android User")
    }
}