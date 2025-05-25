package com.ayaan.profile.presentation.utils

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ayaan.profile.ui.theme.borderColor

@Composable
fun Seperator(){
    Column(modifier=Modifier.padding(horizontal=16.dp)) {
        HorizontalDivider(modifier = Modifier.padding(1.dp), color = borderColor)
    }
}