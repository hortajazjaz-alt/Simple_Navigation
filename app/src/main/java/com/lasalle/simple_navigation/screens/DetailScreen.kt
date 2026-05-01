package com.lasalle.simple_navigation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lasalle.simple_navigation.utils.BlogData
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll

// IA generated: Pantalla que muestra el contenido completo de una entrada, movida a la carpeta screens
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(postId: Int, onBackClick: () -> Unit) {
    val post = BlogData.posts.find { it.id == postId }
 val scrollState = rememberScrollState()
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = post?.title ?: "Detalle del Post") },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack, 
                            contentDescription = "Inicio"
                        )
                    }
                }
            )
        }
    )

    { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(35.dp)
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            if (post != null) {
                Text(
                    text = post.title, 
                    style = MaterialTheme.typography.bodyLarge,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(20.dp))
                Image(
                    painter = painterResource(id = post.imageRes),
                    contentDescription = "Imagen ilustrativa de ${post.title}",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                        .clip(RoundedCornerShape(16.dp)), // Bordes redondeados
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = post.content,
                    style = MaterialTheme.typography.bodySmall,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Justify,
                    lineHeight = 28.sp

                )
            } else {
                Text(text = "Post no encontrado")
            }
        }
    }
}
