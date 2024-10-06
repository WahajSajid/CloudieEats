package org.cloudieeats.app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import cloudieeats.composeapp.generated.resources.Res
import cloudieeats.composeapp.generated.resources.ellipse_1
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun LoginScreen(){
    Box(){
        Image(painter = painterResource(Res.drawable.ellipse_1),null)
    }
}