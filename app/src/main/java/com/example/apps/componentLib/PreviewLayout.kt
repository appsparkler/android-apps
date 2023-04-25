package com.example.apps.componentLib

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.apps.ui.theme.AppTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable fun PreviewLayout(
    useDarkTheme:Boolean = false,
    content: @Composable (PaddingValues) -> Unit
) {
    AppTheme(
        useDarkTheme = useDarkTheme
    ) {
        Scaffold(
            content = content
        )
    }
}