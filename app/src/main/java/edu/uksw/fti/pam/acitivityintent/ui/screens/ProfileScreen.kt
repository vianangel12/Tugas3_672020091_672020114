package edu.uksw.fti.pam.acitivityintent.ui.screens

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.acitivityintent.R
import edu.uksw.fti.pam.acitivityintent.contracts.SignUpContract

@Composable
fun ProfileScreen() {
    var firstnameInput by remember { mutableStateOf("") }
    var lastnameInput by remember { mutableStateOf("") }

    val getfirstnameFromSignedUpForm = rememberLauncherForActivityResult(
        contract = SignUpContract(),
        onResult = { firstnameInput = it!! })

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0XFFF6EDFF))
    ) {
        Text(
            text = "Profile ",
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 150.dp, top = 50.dp)
        )
    }
    Row(
        modifier = Modifier
            .padding(top = 100.dp)
            .width(400.dp)
            .height(80.dp)
            .background(Color(0XFFCCC2DC))
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_image3),
            contentDescription = null,
            modifier = Modifier
                .size(65.dp)
                .padding(top = 10.dp, start = 10.dp),
            alignment = Alignment.TopStart
        )
        Column {
            Text(text = "Nama",
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 15.dp)
            )
            TextField(
                value = firstnameInput,
                onValueChange = { firstnameInput = it },
                label = { Text(text = stringResource(R.string.label_firstname))},
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
    Text(text = "PHONE NUMBER",
        color = Color.Black,
        modifier = Modifier
            .padding(top = 220.dp, start = 20.dp ))
    Row (
        modifier = Modifier
            .padding(top = 250.dp)
            .width(400.dp)
            .height(40.dp)
            .background(Color(0XFFCCC2DC))
    ) {
        Text(text = "+62 823 8790 8797",
            color = Color.Black,
            fontSize = 18.sp,
            modifier = Modifier
                .padding(start = 15.dp, top = 4.dp )
        )
    }
    Text(text = "ABOUT",
        color = Color.Black,
        modifier = Modifier
            .padding(top = 330.dp, start = 20.dp )
    )
    Row (
        modifier = Modifier
            .padding(top = 360.dp)
            .width(400.dp)
            .height(40.dp)
            .background(Color(0XFFCCC2DC))
    ) {
        Text(text = "Amoh",
            color = Color.Black,
            fontSize = 18.sp,
            modifier = Modifier
                .padding(start = 15.dp, top = 4.dp )
        )
    }
}


