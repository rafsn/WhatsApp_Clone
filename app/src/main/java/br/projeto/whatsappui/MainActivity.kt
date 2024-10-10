package br.projeto.whatsappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.projeto.whatsappui.screens.HomeScreen
import br.projeto.whatsappui.ui.theme.WhatsAppUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsAppUITheme {
                HomeScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun WhatsAppPrev() {
    HomeScreen()
}