package com.example.composefundamentals.components

import android.R.attr.top
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composefundamentals.ui.theme.ComposeFundamentalsTheme

@Composable
fun MyComplexComposable (){
    Column(
        modifier =Modifier.fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 100.dp),
    ){
        //VISTA HORIZONTAL
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),

        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color.Yellow),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text= "Caja 1",)
                    Button(
                        onClick = { }
                    ) {
                        Text(
                            text = "Acción"
                        )
                    }
            }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f)
                        .background(Color.Green),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Caja 2",)
                    Button(
                        onClick = { }
                    ) {
                        Text(
                            text = "Acción"
                        )
                    }

                }
        }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true,
)
@Composable
fun MyComplexComponentPreview(){
    ComposeFundamentalsTheme{
        MyComplexComposable()
    }
}