package com.lasalle.simple_navigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.lasalle.simple_navigation.screens.DetailScreen
import com.lasalle.simple_navigation.screens.HomeScreen

// IA generated: Función que define el NavHost y las rutas de la aplicación, separada para mejor organización
@Composable
fun AppNavigation() {
    // IA generated: El navController es el encargado de gestionar el estado de la navegación
    val navController = rememberNavController()

    // IA generated: Definición de las rutas en el NavHost
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        // IA generated: Ruta para la pantalla principal de la lista
        composable("home") {
            HomeScreen(onPostClick = { postId ->
                // IA generated: Navegamos a la pantalla de detalle pasando el ID
                navController.navigate("detail/$postId")
            })
        }

        // IA generated: Ruta para la pantalla de detalle con argumento dinámico
        composable(
            route = "detail/{postId}",
            arguments = listOf(navArgument("postId") { type = NavType.IntType })
        ) { backStackEntry ->
            // IA generated: Extraemos el ID del post de los argumentos
            val postId = backStackEntry.arguments?.getInt("postId") ?: 0
            DetailScreen(
                postId = postId,
                onBackClick = {
                    // IA generated: Regresamos a la pantalla anterior en la pila
                    navController.popBackStack()
                }
            )
        }
    }
}
