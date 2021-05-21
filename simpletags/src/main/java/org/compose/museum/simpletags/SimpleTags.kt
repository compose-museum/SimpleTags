package org.compose.museum.simpletags

import android.content.ContentValues.TAG
import android.graphics.drawable.Icon
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SimpleTags(
    modifier: Modifier = Modifier,
    elevation: Dp = 0.dp,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    iconColor: Color = MaterialTheme.colors.onSurface,
    tagText: String,
    tagTextStyle: TextStyle = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        letterSpacing = 0.15.sp
    ),
    tagTextColor: Color = Color.Black,
    backgroundColor: Color = Color(0xFFE8E8E8),
    onClick:() -> Unit
){

    Surface(
        shape = CircleShape,
        color = backgroundColor,
        modifier = modifier,
        elevation = elevation
    ) {
        Row(
            modifier = Modifier
                .clickable(
                    onClick = onClick
                )
                .padding(start = 15.dp, end = 15.dp, top = 8.dp, bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            when(true){
                leadingIcon != null -> {
                    CompositionLocalProvider(
                        LocalContentAlpha provides ContentAlpha.high,
                        LocalContentColor provides iconColor,
                        content = leadingIcon)

                    Spacer(Modifier.padding(horizontal = 4.dp))
                    Text(
                        text = tagText,
                        style = tagTextStyle,
                        color = tagTextColor
                    )
                }
                trailingIcon != null -> {
                    Text(
                        text = tagText,
                        style = tagTextStyle,
                        color = tagTextColor,
                    )
                    Spacer(Modifier.padding(horizontal = 4.dp))
                    CompositionLocalProvider(
                        LocalContentAlpha provides ContentAlpha.high,
                        LocalContentColor provides iconColor,
                        content = trailingIcon)
                }
                else -> {
                    Text(
                        text = tagText,
                        style = tagTextStyle,
                        color = tagTextColor
                    )
                }
            }
        }
    }
}
