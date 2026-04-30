package com.lasalle.simple_navigation.utils

import com.lasalle.simple_navigation.models.BlogPost

// IA generated: Objeto simple que contiene una lista de posts de prueba
object BlogData {
    val posts = listOf(
        BlogPost(
            id = 1,
            title = "Mi primer viaje a la montaña",
            summary = "Una aventura increíble rodeado de naturaleza y aire puro.",
            content = "Hoy decidí subir a la montaña más cercana. Fue un camino largo y agotador, pero la vista desde la cima valió totalmente la pena. Pude ver todo el valle y sentir la paz que solo la naturaleza te da."
        ),
        BlogPost(
            id = 2,
            title = "Receta: El pastel de chocolate perfecto",
            summary = "Aprende a cocinar un postre delicioso con ingredientes básicos.",
            content = "Para este pastel necesitas: harina, azúcar, cacao, huevos y mucho amor. Mezcla todo bien, hornea por 45 minutos a 180 grados y prepárate para el mejor postre de tu vida."
        ),
        BlogPost(
            id = 3,
            title = "Consejos para aprender Kotlin",
            summary = "Pequeños trucos para dominar el lenguaje de Android rápidamente.",
            content = "Kotlin es un lenguaje moderno y divertido. Mi mejor consejo es practicar todos los días, leer la documentación oficial y no tener miedo a cometer errores. ¡La práctica hace al maestro!"
        )
    )
}
