package org.compose.museum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.compose.museum.simpletags.SimpleTags
import org.compose.museum.ui.theme.SimpleTagsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleTagsTheme {
                Column{
                    SimpleTags(
                        trailingIcon = {
                           Icon(painterResource(id = R.drawable.github), null)
                        },
                        tagText = "Github",
                        modifier = Modifier
                            .padding(top = 26.dp),
                        onClick = {

                        }
                    )

                    SimpleTags(
                        trailingIcon = {
                            Icon(painterResource(id = R.drawable.wechat), null)
                        },
                        iconColor = Color.White,
                        tagText = "Github",
                        modifier = Modifier
                            .padding(top = 26.dp),
                        backgroundColor = Color(0xFF07C160),
                        onClick = {

                        }
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
