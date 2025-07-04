package com.example.laboratorio7_androidbot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio7_androidbot.ui.theme.Laboratorio7_androidbotTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                BusinessCardScreen()
            }
        }
    }
}

@Composable
fun BusinessCardScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_bot),
            contentDescription = "Android Bot",
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
                .border(2.dp, Color.White, CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text("Tu Nombre Aquí", color = Color.White, fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text("Ingeniero en Software", color = Color.Gray, fontSize = 16.sp)

        Spacer(modifier = Modifier.height(24.dp))

        Text("Correo: tuemail@ejemplo.com", color = Color.White)
        Text("LinkedIn: linkedin.com/in/tuperfil", color = Color.White)
        Text("GitHub: github.com/tuperfil", color = Color.White)

        Spacer(modifier = Modifier.height(24.dp))

        Text("Habilidades:", color = Color.White, fontWeight = FontWeight.Bold)
        Text("- Kotlin, Java", color = Color.White)
        Text("- Jetpack Compose", color = Color.White)
        Text("- Firebase, SQL", color = Color.White)
    }
}
