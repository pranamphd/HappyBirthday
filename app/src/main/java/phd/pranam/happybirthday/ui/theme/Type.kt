/*
 * Copyright (c) 2025. Pranam.
 * ORCID: https://orcid.org/0009-0007-9316-3616
 *
 * This code is licensed under the MIT License.
 *
 * You may obtain a copy of the License at https://opensource.org/licenses/MIT
 *
 * Attribution:
 * If you use this code, please provide appropriate credit to the original author.
 * For example: "This code is based on work by Pranam whose ORCID is https://orcid.org/0009-0007-9316-3616."
 */

package phd.pranam.happybirthday.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
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