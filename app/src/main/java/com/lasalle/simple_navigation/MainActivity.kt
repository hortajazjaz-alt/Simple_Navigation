package com.lasalle.simple_navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.lasalle.simple_navigation.navigation.AppNavigation
import com.lasalle.simple_navigation.ui.theme.Simple_NavigationTheme

// IA generated: Actividad principal simplificada que delega la navegación a AppNavigation
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Simple_NavigationTheme {
                // IA generated: Iniciamos la navegación desde su nuevo hogar
                AppNavigation()
            }
        }
    }
}
