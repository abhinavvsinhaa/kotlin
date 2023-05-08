package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Layout()
                }
            }
        }
    }
}

@Composable
fun Layout() {
    Column {
        Row {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(color = Color(0xFFEADDFF))
                    .fillMaxWidth(0.5F)
                    .fillMaxHeight(0.5F)
                    .padding(16.dp)
            ) {
                Text(
                    text = "Text composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 16.dp)
                )
                Text(
                    "Displays text and follows the recommended Material Design guidelines.",
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(color = Color(0xFFD0BCFF))
                    .fillMaxWidth()
                    .fillMaxHeight(0.5F)
                    .padding(16.dp)
            ) {
                Text(
                    text = "Image composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 16.dp)
                )
                Text(
                    "Creates a composable that lays out and draws a given Painter class object.",
                    textAlign = TextAlign.Justify
                )
            }
        }
        Row {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(color = Color(0xFFB69DF8))
                    .fillMaxWidth(0.5F)
                    .fillMaxHeight()
                    .padding(16.dp)
            ) {
                Text(
                    text = "Row composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 16.dp)
                )
                Text(
                    "A layout composable that places its children in a horizontal sequence.",
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(color = Color(0xFFF6EDFF))
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(16.dp)
            ) {
                Text(
                    text = "Column composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 16.dp)
                )
                Text(
                    "A layout composable that places its children in a vertical sequence.",
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        Layout()
    }
}