package br.projeto.whatsappui.data

data class TabData(
    val title: String,
    val unreadCount: Int?
)

val tabs = listOf(
    TabData(title = Tabs.CHATS.value, null),
    TabData(title = Tabs.STATUS.value, null),
    TabData(title = Tabs.CALLS.value, 7)
)

enum class Tabs (val value: String) {
    CHATS("Chats"),
    STATUS("Status"),
    CALLS("Calls")
}