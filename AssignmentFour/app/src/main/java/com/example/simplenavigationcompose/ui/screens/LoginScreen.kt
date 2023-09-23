package com.example.simplenavigationcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplenavigationcompose.R

import com.example.simplenavigationcompose.ui.theme.SimpleNavComposeAppTheme

@Composable
fun LoginScreen(
    navigateToHome: () -> Unit
) {
    Column (
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.foodlogin),
            contentDescription = "stringResource(id = 6)",

        )
        Text("Ghose's Kitchen", fontSize = 40.sp)

        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        TextField(
            value = "Username",
            onValueChange = { newUsername ->
                username = newUsername
            }
        )
        Spacer(modifier = Modifier.height(5.dp))
        TextField(
            value = "Password",
            onValueChange = { newPassword ->
                password = newPassword
            }
        )

        DefaultButton(
            text = "Log In",
            onClick = navigateToHome
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    SimpleNavComposeAppTheme(useSystemUiController = false) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            LoginScreen(
                navigateToHome = {}
            )
        }
    }
}
