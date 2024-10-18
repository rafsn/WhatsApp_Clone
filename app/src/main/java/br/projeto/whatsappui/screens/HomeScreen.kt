package br.projeto.whatsappui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.projeto.whatsappui.components.AppbarComponent
import br.projeto.whatsappui.components.TabsComponent

@Composable
fun HomeScreen() {
    Column {
        AppbarComponent()
        TabsComponent()
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPrev() {
    AppbarComponent()
}