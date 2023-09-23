package com.example.myloginpage

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
    import androidx.compose.material3.Button
    import androidx.compose.material3.ExperimentalMaterial3Api
    import androidx.compose.material3.MaterialTheme
    import androidx.compose.material3.OutlinedTextField
    import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import android.content.pm.PackageManager
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.ui.layout.ContentScale

import com.example.myloginpage.ui.theme.MyLoginPageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MyAppContent()
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyAppContent(){
    val context = LocalContext.current
    var username by remember { mutableStateOf("") }
    var password by remember {mutableStateOf("")}
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.Yellow),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
//        Image(
//            painter = painterResource(id = R.drawable.ic_launcher_background),
//            contentDescription ="Login",
//            modifier = Modifier.size(150.dp).padding(16.dp)
//        )
        Image(
            painter = painterResource(id = R.drawable.imagebackground),
            contentDescription = "Background Image",
//            contentScale = ContentScale.Crop,
            modifier = Modifier.size(150.dp).padding(16.dp)
        )
        Text(text = "Anubroto's Login Page", style = MaterialTheme.typography.headlineMedium.copy(color = Color(0xFF476810)))
        Spacer(modifier = Modifier.height(36.dp))
        OutlinedTextField(
            label = { Text("Enter Email") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Done),
            value = username,
            onValueChange = { newUsername -> username = newUsername },
            leadingIcon = {
                Image(
                    painter = painterResource(id = android.R.drawable.star_big_on),
                    contentDescription = "Star Icon"
                )
            },
        )
        OutlinedTextField(
            label = { Text("Enter Password") },
            value = password,
            onValueChange = { newPassword -> password = newPassword},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done),
            leadingIcon = {
                Image(
                    painter = painterResource(id = android.R.drawable.star_big_on),
                    contentDescription = "Star Icon"
                )
            },
        )

        Button(
            onClick = {
                var intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.amazon.com"))
                context.startActivity(intent)},
            modifier = Modifier.padding(all = 10.dp)
        )
        {
            Text(text = "Amazon Link", style = MaterialTheme.typography.bodyMedium.copy(color = Color.Yellow))
        }
        Button(
            onClick = {
                var intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))
                context.startActivity(intent)},
            modifier = Modifier.padding(all = 10.dp)
        )
        {
            Text(text = "Google Link", style = MaterialTheme.typography.bodyMedium.copy(color = Color.Yellow))
        }
        Button(
            onClick = {
                var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flipkart.com/"))
                context.startActivity(intent)},
            modifier = Modifier.padding(all = 10.dp)
        )
        {
            Text(text = "Flipkart Link", style = MaterialTheme.typography.bodyMedium.copy(color = Color.Yellow))
        }
    }
}




@Preview(showBackground = true)
@Composable
fun MainPreview() {
    MyAppContent()
}
