package com.texast5.fiback.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.texast5.fiback.R


/** Add custom fonts **/
val fonts = FontFamily(
    Font(R.font.montserratblack),
    Font(R.font.montserratbold,FontWeight.Bold),
    Font(R.font.montserratextrabold, FontWeight.ExtraBold ),
    Font(R.font.montserratextralight ,FontWeight.ExtraLight),
    Font(R.font.montserratlight, FontWeight.Light),
    Font(R.font.montserratmedium , FontWeight.Medium),
    Font(R.font.montserratregular, FontWeight.SemiBold),
    Font(R.font.montserratsemibold, FontWeight.SemiBold),
    Font(R.font.montserratthin, FontWeight.Thin),
)





// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Light,
        fontSize = 16.sp
    ),
    h2 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    h3 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),

    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)

