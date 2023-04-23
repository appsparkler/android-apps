package com.example.apps.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apps.R
import com.example.apps.data.DeveloperInfo
import com.example.apps.data.devInfo
import com.example.apps.ui.theme.AppTheme
import com.example.apps.ui.theme.Lato

@Composable
private fun InfoRow(
    modifier: Modifier = Modifier,
    @DrawableRes iconId: Int,
    infoStr: String,
) {
    Column(modifier = modifier) {
        Divider(
            color = MaterialTheme.colorScheme.secondary,
            modifier = Modifier.height(1.dp),
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp),
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
                text = infoStr,
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
                    iconId = R.drawable.phone_iphone_48px,
                    infoStr = devInfo.data.mobileNumber
                )
                InfoRow(
                    iconId = R.drawable.share_48px,
                    infoStr = devInfo.data.socialMediaHandle
                )
                InfoRow(
                    modifier = Modifier
                        .padding(it),
                    iconId = R.drawable.mail_48px,
                    infoStr = devInfo.data.email
                )
            }
        }
    }
}

@Composable
fun InfoColumn(
    modifier: Modifier = Modifier,
    developerInfo: DeveloperInfo
) {
    Column(
        modifier = modifier,
    ) {
        InfoRow(
            iconId = R.drawable.phone_iphone_48px,
            infoStr = developerInfo.mobileNumber
        )
        InfoRow(
            iconId = R.drawable.share_48px,
            infoStr = developerInfo.socialMediaHandle
        )
        InfoRow(
            iconId = R.drawable.mail_48px,
            infoStr = developerInfo.email
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun InfoColumnPreview(useDarkTheme: Boolean = false) {
    AppTheme(useDarkTheme) {
        Scaffold {
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Hello World",
                    modifier = Modifier
                        .padding(top = 200.dp)
                )
                InfoColumn(
                    modifier = Modifier.padding(it),
                    developerInfo = devInfo.data
                )
            }
        }
    }
}

@Preview
@Composable
private fun ThemedInfoColumnPreview() {
    InfoColumnPreview(false)
}


//@Preview(showSystemUi = true)
//@Composable
//fun DarkPreview() {
//    InfoRowPreview(true)
//}

//@Preview(showSystemUi = true)
//@Composable
//fun LightPreview() {
//    InfoRowPreview(false)
//}