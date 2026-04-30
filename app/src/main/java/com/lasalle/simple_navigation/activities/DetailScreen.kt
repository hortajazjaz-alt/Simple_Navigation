package com.lasalle.simple_navigation.activities

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.lasalle.simple_navigation.utils.BlogData

// IA generated: Función para mostrar el contenido completo de una entrada seleccionada
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(postId: Int, onBackClick: () -> Unit) {
    // IA generated: Buscamos el post por su ID en nuestra lista de datos
    val post = BlogData.posts.find { it.id == postId }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = post?.title ?: "Detalle del Post") },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        // IA generated: Usamos el icono de flecha hacia atrás (versión auto-mirrored para accesibilidad)
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack, 
                            contentDescription = "Volver a la lista"
                        )
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            if (post != null) {
                // IA generated: Mostramos el título y el contenido completo
                Text(
                    text = post.title, 
                    style = MaterialTheme.typography.headlineMedium
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = post.content, 
                    style = MaterialTheme.typography.bodyLarge
                )
            } else {
                // IA generated: Mensaje simple de error si el ID no existe
                Text(text = "Error: El post no fue encontrado.")
            }
        }
    }
}
