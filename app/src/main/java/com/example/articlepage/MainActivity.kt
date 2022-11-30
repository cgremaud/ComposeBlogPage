package com.example.articlepage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.articlepage.ui.theme.ArticlePageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticlePageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column() {
                        ArticleHeaderImage()
                        Row{ArticleHeader(text = "Title")}
                        Row{ArticleBody(text = stringResource(R.string.paragraph_one))}
                        Row{ArticleBody(text = getString(R.string.paragraph_two))}
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun ArticleHeaderImage() {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(painter = image, contentDescription = "header", alignment = Alignment.TopCenter)
}

@Composable
fun ArticleBody(text: String = "") {
    Text(
        text = text
    )
}

@Composable
fun ArticleHeader(text: String = "") {
    Text(
        text = text,
        modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.Start),
        fontSize = 34.sp
    )
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    ArticlePageTheme {
//        Greeting("Android")
//    }
//}