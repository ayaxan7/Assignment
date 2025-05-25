package com.ayaan.profile.presentation.common


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ayaan.profile.R
import com.ayaan.profile.ui.theme.borderColor
import com.ayaan.profile.ui.theme.textSecondary

@Composable
fun ProfileOption(
    icon: ImageVector,
    title: String,
    subtitle: String = "",
    value: String,
    subtitleColor: Color= textSecondary
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,

    ) {
        Icon(
            imageVector=icon,
            contentDescription = title,
            tint = subtitleColor,
            modifier = Modifier.size(24.dp)
        )
        
        Spacer(modifier = Modifier.width(16.dp))
        
        Row(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal
            )
            Spacer(modifier= Modifier.padding(2.dp))
            if (subtitle.isNotEmpty()) {
                Text(
                    text = "• $subtitle",
                    color = subtitleColor,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
        
        Text(
            text = value,
            color = Color.White,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal
        )
        
        Spacer(modifier = Modifier.width(8.dp))
        
        Icon(
            painter= painterResource(R.drawable.rightarrow),
            contentDescription = "Arrow",
            tint = textSecondary,
            modifier = Modifier.size(20.dp)
        )
    }
}
