package com.ayaan.profile.navigation.common

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ayaan.profile.R
import com.ayaan.profile.ui.theme.textPrimary
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.foundation.BorderStroke
import com.ayaan.profile.ui.theme.backgroundColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun topBar() {
    return TopAppBar(
        title = {
            Text(
                text = "Profile",
                color = textPrimary,
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal
            )
        },
        navigationIcon = {
            IconButton(onClick = { }) {
                Icon(
                    painter= painterResource(R.drawable.leftarrow),
                    contentDescription = "Back",
                    tint = textPrimary,
                    modifier = Modifier.size(16.dp)
                )
            }
        },
        actions = {
            OutlinedButton(
                onClick = { },
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor =Color.LightGray
                ),
                border = BorderStroke(1.dp, Color(0xFF333333)),
                shape = RoundedCornerShape(20.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.chat),
                    contentDescription = "Support",
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text("support", fontSize = 14.sp,color=Color.DarkGray, fontWeight = FontWeight.Light)
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = backgroundColor
        )
    )
}