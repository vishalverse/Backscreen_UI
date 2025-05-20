package com.example.assignment.ui.theme

import android.R.attr.fontFamily
import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import com.example.assignment.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CredProfileScreen() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colorStops = arrayOf(
                        0.0f to Color.Black.copy(0.9f),
                        0.55f to Color.Black.copy(0.9f),
                        0.5f to Color.Black,
                        1.0f to Color.Black
                    )
                )
            )
    )
    {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(4.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "Profile",
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                    style = MaterialTheme.typography.titleLarge,
                )

                Spacer(modifier = Modifier
                    .padding(start = 150.dp)
                    .height(10.dp))
                Spacer(modifier = Modifier.height(25.dp))


                support()
            }


            Spacer(modifier = Modifier.height(15.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.person),
                    contentScale = ContentScale.Crop,
                    contentDescription = "Profile",
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Column {
                    Text(
                        "Vishal Sharma",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        style = TextStyle(fontFamily = FontFamily.Serif)
                    )
                    Spacer(modifier = Modifier.height(3.dp))
                    Text(
                        "member since Dec, 2020",
                        color = Color.White.copy(0.6f), fontWeight = FontWeight.Normal,
                        style = TextStyle(fontFamily = FontFamily.SansSerif),
                        fontSize = 12.sp

                    )
                }
                Spacer(modifier = Modifier.padding(start = 130.dp))
                Icon(
                    imageVector = Icons.Outlined.Edit,
                    contentDescription = "Edit",
                    tint = Color.White.copy(0.5f),

                    )
            }

            Spacer(modifier = Modifier.height(20.dp))

            CredGarageCard()
            checklistitem()
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                "YOUR REWARDS & BENEFITS",
                color = Color(0xFFAAAAAA),
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(start = 10.dp),
                style = TextStyle(fontFamily = FontFamily.SansSerif, fontSize = 13.sp)
            )
            Spacer(modifier = Modifier.padding(0.4.dp))

            bottomlistitem()
            Spacer(modifier = Modifier.padding(6.dp))
            Text(
                "TRANSACTIONS & SUPPORT",
                fontSize = 15.sp,
                // fontWeight = FontWeight.Medium,
                fontWeight = FontWeight.SemiBold,
                style = TextStyle(fontFamily = FontFamily.Monospace, fontSize = 13.sp),
                color = Color(0xFFAAAAAA)
            )
            Spacer(modifier = Modifier.padding(6.dp))
            Row {
                Text(
                    "all transactions",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Thin,
                    style = TextStyle(fontFamily = FontFamily.Serif, fontSize = 13.sp),
                    color = Color.White,
                    modifier = Modifier.padding(start = 12.dp)
                )
                Image(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "right click",
                    colorFilter = ColorFilter.tint(Color.White),
                    modifier = Modifier.padding(start = 210.dp)

                )
            }

        }
    }
}

@Composable
fun CredGarageCard() {
    Card(
        elevation = CardDefaults.cardElevation(1.dp),
        shape = RectangleShape,
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(1f)
            .border(1.dp, color = Color.Gray),
        colors = CardDefaults.cardColors(
            containerColor = Color.Black
        )
    ) {
        Row(
            modifier = Modifier
                .padding(18.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.car),
                contentDescription = "Car",
                colorFilter = ColorFilter.tint(Color.White),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(30.dp)
                    .border(1.dp, color = Color.White, CircleShape)
            )


            Spacer(modifier = Modifier.width(18.dp))
            Column {
                Text(
                    "get to know your vehicles, inside out",
                    color = Color.White.copy(0.6f),
                    fontSize = 12.sp, style = TextStyle(
                        fontFamily = FontFamily.Serif, fontWeight = FontWeight.Medium
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {


                    Text(
                        "CRED garage ", color = Color.White, fontSize = 16.sp, style = TextStyle(
                            fontFamily = FontFamily.Serif
                        ), fontWeight = FontWeight.Medium
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Image(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "ARROW",
                        colorFilter = ColorFilter.tint(Color.Gray)
                    )
                }
            }
        }
    }
}

@Composable
fun checklistitem() {


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 30.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(R.drawable.creditscore),
                colorFilter = ColorFilter.tint(Color.White),
                contentDescription = "creditscore",

                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.padding(5.dp))

            Text(
                "credit score",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                style = TextStyle(
                    fontFamily = FontFamily.Serif, fontSize = 13.sp
                )
            )
            Text(
                " · Refresh Available",
                color = Color.Green,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                style = TextStyle(
                    fontFamily = FontFamily.Serif, fontSize = 13.sp
                )
            )

            Text(
                "757",
                color = Color.White,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(start = 70.dp),
                style = TextStyle(
                    fontFamily = FontFamily.Serif, fontSize = 13.sp
                )
            )
            Spacer(modifier = Modifier.padding(8.dp))
            Image(
                imageVector = Icons.Default.ArrowForward,
                colorFilter = ColorFilter.tint(color = Color.White),
                contentDescription = "arrow"
            )


        }
        Box(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
                .height(0.5.dp)
                .background(Color.Gray) // or any color you prefer
        )
        Spacer(modifier = Modifier.padding(top = 10.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(R.drawable.cashback),
                colorFilter = ColorFilter.tint(Color.White),
                contentDescription = "cashback",
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.padding(4.dp))

            Text(
                "lifetime cashback",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                style = TextStyle(
                    fontFamily = FontFamily.Serif, fontSize = 13.sp
                )
            )

            Text(
                " ₹ 3",
                color = Color.White,
                modifier = Modifier.padding(start = 165.dp),
                fontWeight = FontWeight.Medium,
                style = TextStyle(
                    fontFamily = FontFamily.Serif, fontSize = 13.sp
                )
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Image(
                imageVector = Icons.Default.ArrowForward,
                colorFilter = ColorFilter.tint(color = Color.White),
                contentDescription = "arrow"
            )


        }
        Box(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
                .height(0.5.dp)
                .background(Color.Gray) // or any color you prefer
        )
        Spacer(modifier = Modifier.padding(top = 10.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(R.drawable.moneybag),
                colorFilter = ColorFilter.tint(Color.White),
                contentDescription = "check",
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.padding(5.dp))

            Text(
                "bank balance", color = Color.White, fontSize = 14.sp, style = TextStyle(
                    fontFamily = FontFamily.Serif, fontSize = 13.sp
                )
            )

            Text(
                "check",
                color = Color.White,
                modifier = Modifier.padding(start = 175.dp),
                style = TextStyle(
                    fontFamily = FontFamily.Serif, fontSize = 12.sp
                )
            )
            Spacer(modifier = Modifier.padding(9.dp))
            Image(
                imageVector = Icons.Default.ArrowForward,
                colorFilter = ColorFilter.tint(color = Color.White),
                contentDescription = "arrow"
            )


        }

    }
}

@Composable
fun bottomlistitem() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 30.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {


            Spacer(modifier = Modifier.padding(5.dp))

            Text(
                "Cashback balance",
                color = Color.White,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                style = TextStyle(fontFamily = FontFamily.SansSerif, fontSize = 13.sp)
            )


            Spacer(modifier = Modifier.padding(10.dp))
            Image(
                imageVector = Icons.Default.KeyboardArrowRight,
                colorFilter = ColorFilter.tint(color = Color.White),
                contentDescription = "arrow",
                modifier = Modifier.padding(start = 180.dp)
            )


        }
        Text(
            "₹0",
            color = Color.Gray,
            modifier = Modifier.padding(start = 10.dp),
            style = TextStyle(fontFamily = FontFamily.SansSerif, fontSize = 13.sp),
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium
        )
        Box(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
                .height(0.5.dp)
                .background(Color.Gray) // or any color you prefer
        )
        Spacer(modifier = Modifier.padding(top = 8.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {


            Spacer(modifier = Modifier.padding(5.dp))

            Text("coins", color = Color.White, fontSize = 12.sp)

            Spacer(modifier = Modifier.padding(3.dp))
            Image(
                imageVector = Icons.Default.KeyboardArrowRight,
                colorFilter = ColorFilter.tint(color = Color.White),
                contentDescription = "arrow",
                modifier = Modifier.padding(start = 265.dp)
            )


        }
        Text(
            "267,543", fontWeight = FontWeight.Medium,
            color = Color.Gray,
            modifier = Modifier.padding(start = 10.dp),
            style = TextStyle(fontFamily = FontFamily.SansSerif, fontSize = 13.sp),
            fontSize = 12.sp
        )

        Box(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
                .height(0.5.dp)
                .background(Color.Gray) // or any color you prefer
        )
        Spacer(modifier = Modifier.padding(top = 10.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Spacer(modifier = Modifier.padding(5.dp))

            Text(
                "win upto RS.1000",
                color = Color.White,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium
            )
            Spacer(modifier = Modifier.padding(12.dp))
            Image(
                imageVector = Icons.Default.KeyboardArrowRight,
                colorFilter = ColorFilter.tint(color = Color.White),
                contentDescription = "arrow",
                modifier = Modifier.padding(start = 180.dp)
            )


        }
        Text(
            "refer and earn",
            fontWeight = FontWeight.Medium,
            color = Color.Gray,
            modifier = Modifier.padding(start = 10.dp),
            style = TextStyle(fontFamily = FontFamily.SansSerif, fontSize = 13.sp),
            fontSize = 12.sp
        )

    }

}

@Composable
fun support() {

    Card(
        elevation = CardDefaults.cardElevation(1.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent),
        modifier = Modifier
            .border(1.dp, Color.Gray, CircleShape)
            .padding(5.dp),
        shape = CircleShape
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.chat),
                contentDescription = "support",
                modifier = Modifier.size(20.dp),
                colorFilter = ColorFilter.tint(Color.White)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "support",
                color = Color.White,
                fontSize = 13.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = FontFamily.SansSerif
            )
        }
    }
}