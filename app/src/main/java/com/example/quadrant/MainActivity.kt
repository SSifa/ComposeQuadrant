package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Row(horizontalArrangement = Arrangement.SpaceEvenly) {
        Column (verticalArrangement = Arrangement.SpaceEvenly,
            modifier = modifier.weight(1.0F, true)) {
            Surface(color = Color(0xFFEADDFF),
                modifier = modifier.fillMaxHeight(0.5F)) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = modifier
                        .weight(0.5F, true)
                        .padding(16.dp).fillMaxHeight(0.5F),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = stringResource(id = R.string.item_text),
                        modifier = modifier
                            .padding(16.dp)
                            .align(Alignment.CenterHorizontally),
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        text = stringResource(id = R.string.text_desc),
                        modifier.align(Alignment.CenterHorizontally)
                    )
                }
            }
            Surface(color = Color(0xFFB69DF8),
                modifier = modifier.fillMaxHeight()) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = modifier
                        .weight(0.5F, true)
                        .padding(16.dp)
                ) {
                    Text(
                        text = stringResource(id = R.string.row),
                        modifier = modifier
                            .padding(16.dp)
                            .align(Alignment.CenterHorizontally),
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        text = stringResource(id = R.string.row_desc)
                    )
                }
            }
        }
        Column(verticalArrangement = Arrangement.SpaceEvenly,
            modifier = modifier.weight(1.0F, true)) {
            Surface(color = Color(0xFFD0BCFF),
                modifier = modifier.fillMaxHeight(0.5F)) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = modifier
                        .weight(0.5F, true)
                        .padding(16.dp)
                ) {
                    Text(
                        text = stringResource(id = R.string.image),
                        modifier = modifier
                            .padding(16.dp)
                            .align(Alignment.CenterHorizontally),
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        text = stringResource(id = R.string.image_desc)
                    )
                }
            }
            Surface(color = Color(0xFFF6EDFF),
            modifier = modifier.fillMaxHeight()) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = modifier
                        .weight(0.5F, true)
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = stringResource(id = R.string.column),
                        modifier = modifier
                            .padding(16.dp)
                            .align(Alignment.CenterHorizontally),
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        text = stringResource(id = R.string.column_desc)
                    )
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantTheme {
        Greeting()
    }
}