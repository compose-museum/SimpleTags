package org.compose.museum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.compose.museum.simpletags.SimpleTags
import org.compose.museum.ui.theme.SimpleTagsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleTagsTheme {
                Column{
                    Row{
                        SimpleTags(
                            trailingIcon = {
                                Icon(painterResource(id = R.drawable.github), null)
                            },
                            tagText = "Github",
                            modifier = Modifier
                                .padding(top = 26.dp),
                            onClick = {

                            },
                            elevation = 10.dp,
                            tagTextStyle = TextStyle(
                                fontSize = 26.sp
                            )
                        )
                        SimpleTags(
                            trailingIcon = {
                                Icon(painterResource(id = R.drawable.microsoftedge), null)
                            },
                            tagText = "Edge",
                            modifier = Modifier
                                .padding(top = 26.dp),
                            onClick = {

                            },
                            backgroundColor = Color(0xFF0078D7),
                            iconColor = Color.White,
                            tagTextColor = Color.White
                        )
                        SimpleTags(
                            leadingIcon = {
                                Icon(painterResource(id = R.drawable.microsoft), null, modifier = Modifier.size(20.dp))
                            },
                            tagText = "Microsoft",
                            modifier = Modifier
                                .padding(top = 26.dp),
                            onClick = {

                            },
                            backgroundColor = Color(0xFF5E5E5E),
                            iconColor = Color.White,
                            tagTextColor = Color.White
                        )
                    }

                    SimpleTags(
                        trailingIcon = {
                            Icon(painterResource(id = R.drawable.wechat), null)
                        },
                        iconColor = Color.White,
                        tagText = "WeChat",
                        modifier = Modifier
                            .padding(top = 26.dp),
                        backgroundColor = Color(0xFF07C160),
                        onClick = {

                        },
                        elevation = 10.dp
                    )

                    SimpleTags(
                        leadingIcon = {
                            Icon(painterResource(id = R.drawable.twitter), null)
                        },
                        iconColor = Color.White,
                        tagText = "twitter",
                        modifier = Modifier
                            .padding(top = 26.dp),
                        backgroundColor = Color(0xFF1DA1F2),
                        tagTextColor = Color.White,
                        onClick = {

                        }
                    )
                }
            }
        }
    }
}
