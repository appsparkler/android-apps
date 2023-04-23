package com.example.apps.components

import android.graphics.drawable.ClipDrawable
import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apps.R
import com.example.apps.data.devInfo
import com.example.apps.ui.theme.AppTheme
import com.example.apps.ui.theme.Lato

@Composable
fun AndroidLogoWithLabel(
    label: String
) {
    Icon(
        painter = painterResource(id = R.drawable.android_48px),
        modifier = Modifier
            .size(114.dp),
        contentDescription = null,
        tint = MaterialTheme.colorScheme.primary
    )
    Text(
        modifier = Modifier
            .padding(top = 82.dp, start = 5.dp),
        text = label,
        fontFamily = Lato,
        fontSize = 28.sp
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable fun PreviewLayout(
    useDarkTheme:Boolean = false,
    content: @Composable (PaddingValues) -> Unit = {}
) {
    AppTheme(useDarkTheme = useDarkTheme) {
        Scaffold(
            content = content
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun AndroidLogoWIthLabelPreview(useDarkTheme:Boolean = false) {
    PreviewLayout() {
        AndroidLogoWithLabel(
            label = devInfo.data.label
        )
    }
}