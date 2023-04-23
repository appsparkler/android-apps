package com.example.apps.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apps.R
import com.example.apps.ui.theme.AppTheme
import com.example.apps.ui.theme.Lato

@Composable
private fun InfoRow(
    modifier: Modifier = Modifier,
    @DrawableRes iconId: Int,
    @StringRes contentId: Int,
) {
    Column(modifier = modifier) {
        Divider(
            color = MaterialTheme.colorScheme.secondary,
            modifier = Modifier.height(1.dp),
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
        ) {
            Icon(
                painter = painterResource(id = iconId),
                contentDescription = null,
                modifier = Modifier
                    .height(24.dp)
                    .padding(start = 100.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            Text(
                text = stringResource(id = contentId),
                fontFamily = Lato,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(start = 12.dp)
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun InfoRowPreview(darkTheme: Boolean = false) {
    AppTheme(useDarkTheme = darkTheme) {
        Scaffold {
            Column(
                modifier = Modifier
                    .padding(it)
            ) {
                InfoRow(
                   iconId = R.drawable.phone_iphone_android_48px,
                    contentId = R.string.mobile_number
                )
                InfoRow(
                    iconId = R.drawable.share_48px,
                    contentId = R.string.social_media
                )
                InfoRow(
                    modifier = Modifier
                        .padding(it),
                    iconId = R.drawable.mail_48px,
                    contentId = R.string.email
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DarkPreview() {
    InfoRowPreview(true)
}

//@Preview(showSystemUi = true)
//@Composable
//fun LightPreview() {
//    InfoRowPreview(false)
//}