package com.example.rediexpressxxx1.Presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rediexpressxxx1.R

@Composable
fun OnBoarding1(pad : PaddingValues) {
    Column(
        modifier = Modifier.fillMaxSize().padding(paddingValues = pad),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(R.drawable.pana1),
            contentDescription = "Onboarding1",
            modifier = Modifier.padding(top = 111.dp).size(346.dp)
        )
        Column(
            modifier = Modifier.padding(top = 48.dp)
            .width(342.dp).height(240.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
                    .width(297.dp).height(108.dp)
            ) {
                Text(text = "Quick Delivery At Your doorstep",
                    color = colorResource(R.color.primary_color),
                    fontSize = 24.sp, fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center)
                Text(text = "Enjoy quick pick-up and delivery to your destination",
                    color = colorResource(R.color.text_4),
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )
            }
            Spacer(Modifier.height(10.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                OutlinedButton(onClick = {},
                    modifier = Modifier.width(100.dp)
                        .height(50.dp),
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Text(text = "Skip",
                        color = colorResource(R.color.primary_color),
                        fontSize = 14.sp, fontWeight = FontWeight.Bold )
                }
                Button(onClick = {},
                    modifier = Modifier.width(100.dp)
                        .height(50.dp),
                    shape = RoundedCornerShape(4.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(R.color.primary_color)
                    )) {
                    Text(text = "Next",
                        color = colorResource(R.color.white),
                        fontSize = 14.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}