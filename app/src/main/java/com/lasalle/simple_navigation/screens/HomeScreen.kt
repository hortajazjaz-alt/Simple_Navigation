package com.lasalle.simple_navigation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lasalle.simple_navigation.models.BlogPost
import com.lasalle.simple_navigation.utils.BlogData

// IA generated: Pantalla que muestra la lista de entradas del blog, movida a la carpeta screens
@Composable
fun HomeScreen(onPostClick: (Int) -> Unit) {
    Scaffold(
        topBar = {
            Text(
                text = "Mi blog Personal",
                style = MaterialTheme.typography.headlineMedium,
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(30.dp),
               color = MaterialTheme.colorScheme.primary
            )
        }
    ) { padding ->
        LazyColumn(modifier = Modifier.padding(padding)) {
            items(BlogData.posts) { post ->
                PostItem(post = post, onClick = { onPostClick(post.id) })
            }
        }
    }
}

@Composable
fun PostItem(post: BlogPost, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .background(MaterialTheme.colorScheme.background)
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(16.dp)
    ) {
        Column(modifier = Modifier.padding(30.dp)) {
            Text(text = post.title, style = MaterialTheme.typography.titleLarge,fontSize = 25.sp,  fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = post.summary, style = MaterialTheme.typography.bodyMedium,fontSize = 20.sp,textAlign = TextAlign.Justify)

        }
    }
}
