package com.lasalle.simple_navigation.activities

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.lasalle.simple_navigation.models.BlogPost
import com.lasalle.simple_navigation.utils.BlogData

// IA generated: Función para mostrar la lista de entradas del blog
@Composable
fun HomeScreen(onPostClick: (Int) -> Unit) {
    Scaffold(
        topBar = {
            Text(
                text = "Mi Blog Personal",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(16.dp)
            )
        }
    ) { padding ->
        // IA generated: LazyColumn es eficiente para mostrar listas largas
        LazyColumn(modifier = Modifier.padding(padding)) {
            items(BlogData.posts) { post ->
                PostItem(post = post, onClick = { onPostClick(post.id) })
            }
        }
    }
}

// IA generated: Componente sencillo para cada elemento de la lista
@Composable
fun PostItem(post: BlogPost, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = post.title, style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = post.summary, style = MaterialTheme.typography.bodyMedium)
        }
    }
}
