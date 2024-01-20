package com.plcoding.fcmpushnotificationshttpv1

data class ChatState(
    val isEnteringToken: Boolean = true,
    val remoteToken: String = "",
    val messageText: String = ""
)
