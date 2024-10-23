package com.example.p4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PlayActivity(
    modifier: Modifier = Modifier) {
    Column (
        modifier = modifier.fillMaxSize()
    ) {
        SectionHeader()
        Spacer(modifier = Modifier.padding(20.dp))
        Text(text = "Kepada Yth:", Modifier.padding(start = 15.dp))
        Text(text = "KAPRODI", Modifier.padding(start = 15.dp)
        )
        MainSection(
            judulParam = "Nama", isiParam = "Hari"
        )
        MainSection(
            judulParam = "Kelas", isiParam = "PAM"
        )
        MainSection(
            judulParam = "NIM", isiParam = "20210140031"
        )
        MainSection(
            judulParam = "Keterangan", isiParam = "Praktikum"
        )
    }
}

@Composable
fun SectionHeader() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.DarkGray)) {
        Row (Modifier.padding(all = 10.dp)
        ){
            Box(contentAlignment = Alignment.BottomEnd) {
                Image(
                    painter = painterResource(
                        id = R.drawable.umy
                    ),
                    contentDescription = "", Modifier
                        .size(100.dp).clip(shape = CircleShape)
                )
                Icon(Icons.Filled.Check,
                    contentDescription = "",
                    Modifier.padding(end = 10.dp).size(25.dp),
                    tint = Color.Red,
                )
            }
            Column (Modifier.padding(15.dp)){
                Text(text ="Teknologi Informasi",
                    color = Color.White
                )
                Spacer(Modifier.padding(3.dp))
                Text(
                    text = "Universitas Muhammadiyah Yogyakarta",
                    color = Color.White)
            }
        }
    }
}

@Composable
fun MainSection(judulParam:String, isiParam:String) {
    Column(

        horizontalAlignment = Alignment.Start,
        modifier = Modifier.padding(20.dp)
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(3.dp),
            horizontalArrangement = Arrangement.SpaceBetween
            ){
            Text(text = judulParam, modifier = Modifier.weight(0.8f))
            Text(text = ":", modifier = Modifier.weight(0.2f))
            Text(text = "$isiParam",
                modifier = Modifier.weight(2f)
            )
        }

}
}

