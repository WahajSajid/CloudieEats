package org.cloudieeats.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val statusBarColor = Color(0x6D006455)
        setContent {
            WindowCompat.setDecorFitsSystemWindows(window, false)
            val windowInsetsController = WindowInsetsControllerCompat(window, window.decorView)
            window.statusBarColor = statusBarColor.toArgb() // Change status bar color here
            windowInsetsController.isAppearanceLightStatusBars
            App()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun AppPreview(){
    LoginScreen()
}