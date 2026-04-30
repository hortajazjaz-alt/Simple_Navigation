package com.lasalle.simple_navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.lasalle.simple_navigation.activities.DetailScreen
import com.lasalle.simple_navigation.activities.HomeScreen
import com.lasalle.simple_navigation.ui.theme.Simple_NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Simple_NavigationTheme {
                // IA generated: Llamamos a nuestra función principal de navegación
                BlogApp()
            }
        }
    }
}

// IA generated: Componente principal que gestiona el flujo de la aplicación
@Composable
fun BlogApp() {
    // IA generated: navController es el objeto que realiza los cambios de pantalla
    val navController = rememberNavController()

    // IA generated: NavHost define las rutas (direcciones) de nuestra app
    NavHost(
        navController = navController,
        startDestination = "home" // Empezamos en la pantalla de inicio
    ) {
        // IA generated: Definición de la ruta para la lista de blogs
        composable("home") {
            HomeScreen(onPostClick = { postId ->
                // Navegamos a 'detail' pasando el ID del post
                navController.navigate("detail/$postId")
            })
        }

        // IA generated: Definición de la ruta para el detalle, aceptando un argumento 'postId'
        composable(
            route = "detail/{postId}",
            arguments = listOf(navArgument("postId") { type = NavType.IntType })
        ) { backStackEntry ->
            // Obtenemos el ID de los argumentos de la ruta
            val postId = backStackEntry.arguments?.getInt("postId") ?: 0
            DetailScreen(
                postId = postId,
                onBackClick = {
                    // Volvemos a la pantalla anterior
                    navController.popBackStack()
                }
            )
        }
    }
}
