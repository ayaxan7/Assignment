package com.ayaan.profile.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalance
import androidx.compose.material.icons.filled.AccountBalanceWallet
import androidx.compose.material.icons.filled.CreditScore
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ayaan.profile.navigation.common.topBar
import com.ayaan.profile.presentation.common.GarageCard
import com.ayaan.profile.presentation.common.ProfileOption
import com.ayaan.profile.presentation.common.RewardOption
import com.ayaan.profile.presentation.utils.Seperator
import com.ayaan.profile.ui.theme.accentGreen
import com.ayaan.profile.ui.theme.backgroundColor
import com.ayaan.profile.ui.theme.textSecondary

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = { topBar() },
        containerColor = backgroundColor,
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .verticalScroll(rememberScrollState(0))
                .background(backgroundColor)
        ) {
            // First section with backgroundColor
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .background(backgroundColor)
            ) {
                Spacer(modifier = Modifier.padding(8.dp))
                UserInfo()
                GarageCard()
                Spacer(modifier = Modifier.padding(32.dp))
                ProfileOption(
                    icon = Icons.Default.CreditScore,
                    title = "credit score",
                    subtitle = "REFRESH AVAILABLE",
                    value = "757",
                    subtitleColor = accentGreen
                )
                Seperator()
                ProfileOption(
                    icon = Icons.Default.AccountBalance, title = "lifetime cashback", value = "₹3"
                )
                Seperator()
                ProfileOption(
                    icon = Icons.Default.AccountBalanceWallet,
                    title = "bank balance",
                    value = "check"
                )
                Spacer(modifier = Modifier.height(28.dp))
            }

            // Second section with Color.Black background
            Column(
                modifier = Modifier
                    .background(Color.Black)
                    .padding(horizontal = 8.dp)
                    .padding(top = 12.dp)
            ) {
                Text(
                    text = "YOUR REWARDS & BENEFITS",
                    color = textSecondary,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(modifier = Modifier.height(14.dp))
                RewardOption(
                    title = "cashback balance", value = "₹0"
                )
                Seperator()
                RewardOption(
                    title = "coins", value = "26,46,583"
                )
                Seperator()
                RewardOption(
                    title = "win upto Rs 1000", subtitle = "refer and earn"
                )
                Spacer(modifier = Modifier.height(32.dp))

                // Transactions Section
                Text(
                    text = "TRANSACTIONS & SUPPORT",
                    color = textSecondary,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                RewardOption(
                    title = "all transactions"
                )
                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }
}