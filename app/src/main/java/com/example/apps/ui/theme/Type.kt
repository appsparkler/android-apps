package com.example.apps.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.apps.R


val Lato = FontFamily(
    Font(
        resId = R.font.lato_bold,
        style = FontStyle.Normal,
        weight = FontWeight.Bold
    )
)

val Montserrat = FontFamily(
    Font(
        resId = R.font.montserrat_light,
        style = FontStyle.Normal,
        weight = FontWeight.Light
    )
)



// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    titleLarge = TextStyle(
        fontFamily = Montserrat,
        fontSize = 60.sp,
        fontWeight = FontWeight.Light
    ),
    displaySmall = TextStyle(
        fontFamily = Lato,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

@OptIn(ExperimentalMaterial3Api::class)
@Preview(
    showSystemUi = true
)
@Composable fun TypographyPreview() {
    AppTheme() {
        Scaffold {
            Column(
                modifier = Modifier.padding(it)
            ) {
                Text(
                    text = "Title Large",
                    style = Typography.titleLarge
                )
                Text(
                    text = "Display Small",
                    style = Typography.displaySmall
                )
            }
        }
    }
}