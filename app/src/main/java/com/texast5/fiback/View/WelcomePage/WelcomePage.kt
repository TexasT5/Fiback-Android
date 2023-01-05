package com.texast5.fiback.View.WelcomePage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.texast5.fiback.R
import com.texast5.fiback.ui.theme.FibackTheme
import com.texast5.fiback.ui.theme.fonts
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun WelcomePage(){
    val pagerState = rememberPagerState()
    var counter by remember { mutableStateOf(0) }
    val maxViewSize = viewsList.size
    val coroutineScope = rememberCoroutineScope()
    HorizontalPager(count = maxViewSize, state = pagerState, modifier = Modifier.fillMaxSize()) { page ->
        Column(modifier = Modifier.fillMaxSize().padding(20.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally ) {
            Image(painter = painterResource(id = viewsList[page].image), contentDescription = "")
            Spacer(modifier = Modifier.padding(10.dp))
            Text(text = stringResource(id = viewsList[page].title), style = MaterialTheme.typography.h1, fontSize = 20.sp)
            Text(text = stringResource(id = viewsList[page].description), style = MaterialTheme.typography.body2, fontSize = 14.sp)
            Button(onClick = { coroutineScope.launch { if(counter <= maxViewSize) pagerState.scrollToPage(counter++)}  } , Modifier.padding(30.dp) , shape = RoundedCornerShape(30.dp), colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xffF67D48))) {
                Icon(painterResource(id = R.drawable.ic_baseline_arrow_right_alt_24), contentDescription = "", tint = Color.White )
            }
            counter = page
        }
    }
}




@Preview(showBackground = true)
@Composable
fun WelcomePreview() {
    FibackTheme {
        WelcomePage()
    }
}