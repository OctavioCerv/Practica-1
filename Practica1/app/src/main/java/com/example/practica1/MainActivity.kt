package com.example.practica1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practica1.ui.theme.Practica1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practica1Theme {
                Presentacion(
                    nombre = "Jesús Octavio Cervantes Contreras",
                    numeroControl = "22130530"
                )
            }
        }
    }
}

@Composable
fun Presentacion(nombre: String, numeroControl: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = nombre,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1976D2),
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = numeroControl,
            fontSize = 20.sp,
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MiPresentacionPreview() {
    Practica1Theme {
        Presentacion("Jesus Octavio Cervantes Contreras", "22130530")
    }
}
