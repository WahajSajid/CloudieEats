package org.cloudieeats.app


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cloudieeats.composeapp.generated.resources.Res
import cloudieeats.composeapp.generated.resources.ellipse_1
import cloudieeats.composeapp.generated.resources.ellipse_2
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun LoginScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box (modifier = Modifier.fillMaxWidth()){
            Image(
                painter = painterResource(Res.drawable.ellipse_1),
                contentDescription = "Top Left Vector Image"
            )
            Image(
                painter = painterResource(Res.drawable.ellipse_2),
                contentDescription = "Top Right Vector Image",
                modifier = Modifier
                    .align(alignment = Alignment.TopEnd)
//                    .padding(start = 200.dp)
            )
        }
    }

}