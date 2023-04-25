package com.example.apps

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.apps.componentLib.PreviewLayout
import com.example.apps.components.AndroidLogoWithLabel
import com.example.apps.components.InfoColumn
import com.example.apps.data.devInfo
import com.example.apps.ui.theme.Lato

@Composable fun App(
    modifier: Modifier = Modifier
) {
    Column {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .weight(2f)
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            AndroidLogoWithLabel(label = "android")
            Text(
                modifier = Modifier.padding(
                    top = 4.dp
                ),
                text = devInfo.data.name,
                style = MaterialTheme.typography.titleLarge,
            )
            Text(
                text = devInfo.data.punchline,
                fontFamily = Lato,
                color = MaterialTheme.colorScheme.primary,
            )
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f),
            verticalArrangement = Arrangement.Bottom
        ) {
            InfoColumn(
                developerInfo = devInfo.data
            )
        }
    }
}


@Preview(showSystemUi = true)
@Composable fun AppPreview() {
    PreviewLayout(false) {
        App()
    }
}