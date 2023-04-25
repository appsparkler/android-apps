package com.example.apps.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apps.R
import com.example.apps.componentLib.PreviewLayout
import com.example.apps.data.devInfo
import com.example.apps.ui.theme.Lato

@Composable
fun AndroidLogoWithLabel(
    label: String
) {
    Box {
        Icon(
            painter = painterResource(id = R.drawable.android_48px),
            modifier = Modifier
                .size(114.dp),
            contentDescription = null,
            tint = MaterialTheme.colorScheme.primary
        )
        Text(
            modifier = Modifier
                .offset(y = 81.dp, x = 6.dp),
            text = label,
            fontFamily = Lato,
            fontSize = 28.sp,
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun AndroidLogoWIthLabelPreviewV2(useDarkTheme: Boolean = false) {
    PreviewLayout() {
        AndroidLogoWithLabel(
            label = devInfo.data.label
        )
    }
}