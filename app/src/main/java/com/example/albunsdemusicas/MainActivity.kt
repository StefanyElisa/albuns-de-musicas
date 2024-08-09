package com.example.albunsdemusicas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.albunsdemusicas.ui.theme.AlbunsDeMusicasTheme
import com.example.listadealbuns.Albuns
import com.example.listadealbuns.Datasource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlbunsDeMusicasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AlbunsDeMusicasTheme {
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListaDeAlbuns() {
    AlbunsDeMusicasTheme(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun CardAlbum(album: Albuns){
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
    ){
        Column (
            modifier = Modifier
                .padding(12.dp)
                .fillMaxSize()
        ) {
            Image (
                modifier = Modifier.align(Alignment.CenterHorizontally),
                painter = painterResource(id = album.imagem),
                contentDescription = album.nome,
                contentScale = ContentScale.Fit
            )
            Text(
                text = album.nome,
                fontSize = 32.sp
            )
            Text(
                text = album.artista
            )
            Text(text = album.artista)
            Text(
                text = "${album.rating}",
                fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun AlbunsDeMusicasTheme(modifier: Modifier = Modifier){
    LazyColumn(){
        items(Datasource().obterAlbuns()){
                Albuns -> CardAlbum(Albuns)
        }
    }
}

