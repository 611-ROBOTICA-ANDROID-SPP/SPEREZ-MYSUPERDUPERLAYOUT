package com.example.composefundamentals.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MiLista() {
    val food = listOf("Hamburguesa", "Pizza", "Tacos", "Sushi")

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 400.dp, start = 10.dp, end = 10.dp)
            .background(Color.LightGray)
            .padding(10.dp)
    ) {
        Text(
            text = "Lista de Elementos",
            fontSize = 18.sp,
            color = Color.Black,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(bottom = 10.dp)
        )

        LazyColumn {
            items(food) { f ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                        .background(Color.Gray)
                        .padding(16.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color.Black
                    )

                    Text(
                        text = f,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
            }
        }
    }
}
