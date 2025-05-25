package com.ayaan.profile.presentation.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RewardOption(
    title: String, subtitle: String = "", value: String = ""
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title, color = Color.White, fontSize = 16.sp
            )
            if (subtitle.isNotEmpty()) {
                Text(
                    text = subtitle, color = Color(0xFF888888), fontSize = 14.sp
                )
            }
            if (value.isNotEmpty()) {
                Text(
                    text = value, color = Color(0xFF888888), fontSize = 14.sp
                )
            }
        }

        Icon(
            Icons.Default.ChevronRight,
            contentDescription = "Arrow",
            tint = Color(0xFF888888),
            modifier = Modifier.size(24.dp)
        )
    }
}