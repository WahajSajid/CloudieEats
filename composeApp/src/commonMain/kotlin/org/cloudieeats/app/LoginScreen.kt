package org.cloudieeats.app


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cloudieeats.composeapp.generated.resources.Res
import cloudieeats.composeapp.generated.resources.ellipse_1
import cloudieeats.composeapp.generated.resources.ellipse_2
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun LoginScreen() {

    Column(modifier = Modifier.wrapContentSize()) {
        Box(
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth(),
        ) {
            Image(
                painter = painterResource(Res.drawable.ellipse_1),
                contentDescription = "Top Left Vector Image"
            )
            Image(
                painter = painterResource(Res.drawable.ellipse_2),
                contentDescription = "Top Right Vector Image",
                modifier = Modifier
                    .align(alignment = Alignment.TopEnd)
            )
            Column(
                modifier = Modifier
                    .padding(top = 100.dp, start = 17.dp)
            ) {
                Text(
                    text = "Login",
                    fontSize = 45.sp,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif,
                    color = Color.White
                )
                Text(
                    text = "to get started",
                    modifier = Modifier.padding(top = 5.dp),
                    color = Color.White,
                    fontFamily = FontFamily.Serif
                )
            }
        }


    }

}