package com.chrigu.dreiweichen.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

@Composable
fun DreiweichenTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val scheme = if (darkTheme) darkColorScheme() else lightColorScheme()
    MaterialTheme(
        colorScheme = scheme,
        typography = Typography,
        content = content
    )
}
