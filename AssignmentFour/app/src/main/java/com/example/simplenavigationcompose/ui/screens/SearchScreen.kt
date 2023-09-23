package com.example.simplenavigationcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplenavigationcompose.R
import com.example.simplenavigationcompose.ui.theme.SimpleNavComposeAppTheme

@Composable
fun SearchScreen(
    query: String?,
    popBackStack: () -> Unit,
    popUpToLogin: () -> Unit
) {
    Column (
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Choose food", fontSize = 40.sp)

        Spacer(modifier = Modifier.height(5.dp))
//        Text("Query: $query", fontSize = 40.sp)

        DefaultButton(
            text = "Back",
            onClick = popBackStack
        )
        Image(
            painter = painterResource(id = R.drawable.frenchfries),
            contentDescription = "stringResource(id = 6)",
            modifier = Modifier.size(150.dp).padding(16.dp)
        )
        Button(onClick = { /*TODO*/ }) {
            Text("French Fries")
        }
        Image(
            painter = painterResource(id = R.drawable.biryani),
            contentDescription = "stringResource(id = 6)",
            modifier = Modifier.size(150.dp).padding(16.dp)
        )
        Button(onClick = { /*TODO*/ }) {
            Text("Chicken Biryani")
        }
        Image(
            painter = painterResource(id = R.drawable.noodles),
            contentDescription = "stringResource(id = 6)",
            modifier = Modifier.size(150.dp).padding(16.dp)
        )
        Button(onClick = { /*TODO*/ }) {
            Text("Noodles")
        }
        DefaultButton(
            text = "Log Out",
            onClick = popUpToLogin
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
            SearchScreen(
                query = "Search",
                popBackStack = {},
                popUpToLogin = {}
            )
        }
    }
}