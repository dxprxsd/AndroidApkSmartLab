package com.example.shmelevmv

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dadadadasd.R




@Preview
@Composable
fun Start(){
    Box(modifier = Modifier
        .fillMaxSize(1f)
        .background(
            Brush.linearGradient(
                colors = listOf(
                    Color(161, 202, 255),
                    Color(77, 156, 255),
                    Color(161, 202, 255)
                ),
                start = Offset(0f, Float.POSITIVE_INFINITY),
                end = Offset(Float.POSITIVE_INFINITY, 0f)
            )
        )
        .background(
            Brush.verticalGradient(
                colors = listOf(
                    Color(116, 200, 228),
                    Color(115, 213, 188),
                    Color(116, 200, 228)
                )
            )
        )
        .background(
            Brush.verticalGradient(
                colors = listOf(
                    Color(98, 105, 240).copy(alpha = 0.05f),
                    Color(55, 64, 245).copy(alpha = 0.65f),
                    Color(34, 84, 245).copy(alpha = 1f),
                    Color(55, 64, 245,).copy(alpha = 0.65f),
                    Color(98, 105, 240,).copy(alpha = 0.05f)
                )
            )
        )
    ){
        Canvas(modifier = Modifier
            .fillMaxSize()
            .blur(radius = 100.dp))
        {
            drawCircle(color = Color(0xFF4460C1), radius = 500f, center = Offset(80f,100f))
            drawCircle(color =  Color(0xFF4460C1), radius = 500f, center = Offset(1000f,2350f))
        }
        Column(modifier = Modifier.fillMaxSize(2f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)
        {
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = "", contentScale = ContentScale.FillWidth, modifier = Modifier.width(263.dp))
        }

    }
}


//первая страница
@Composable
@Preview(showBackground = true)
fun OnBoard1(/*navController: NavHostController*/) {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = "Пропустить", fontSize = 20.sp, color = Color(0xFF57A9FF),
                modifier = Modifier.padding(top = 30.dp, bottom = 50.dp, start = 25.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.subtract),
                contentDescription = "",
                modifier = Modifier
                    .padding(top = 30.dp)
                    .width(167.04.dp)
                    .height(163.11.dp),
                tint = Color(0xFF57A9FF)
            )
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Анализы", fontSize = 20.sp, color = Color(0xFF00B712)
            )
            Text(
                text = "Экспресс сбор и получение проб", fontSize = 14.sp, color = Color(0xFF939396),
                modifier = Modifier.padding(top = 33.dp)
            )
            Canvas(
                modifier = Modifier.fillMaxWidth()
            ) {
                drawCircle(color =  Color(0xFF57A9FF), radius = 25f, center = Offset(450f,200f))
                drawCircle(style = Stroke(3f),  color = Color(0xFF57A9FF), radius = 25f, center = Offset(550f,200f))
                drawCircle(style = Stroke(3f), color =  Color(0xFF57A9FF), radius = 25f, center = Offset(650f,200f))
            }
        }

        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Icon(
                painter = painterResource(id = R.drawable.firstillustration),
                contentDescription = "",
                modifier = Modifier
                    .padding(bottom = 50.dp)
                    .width(204.dp)
                    .height(200.47.dp),
                tint = Color.Unspecified
            )
        }
    }
}


//вторая страница
@Composable
@Preview(showBackground = true)
fun OnBoard2(/*navController: NavHostController*/) {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = "Пропустить", fontSize = 20.sp, color = Color(0xFF57A9FF),
                modifier = Modifier.padding(top = 30.dp, bottom = 50.dp, start = 25.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.subtract),
                contentDescription = "",
                modifier = Modifier
                    .padding(top = 30.dp)
                    .width(167.04.dp)
                    .height(163.11.dp),
                tint = Color(0xFF57A9FF)
            )
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Уведомления", fontSize = 20.sp, color = Color(0xFF00B712)
            )
            Text(
                text = "Вы быстро узнаете о результатах", fontSize = 14.sp, color = Color(0xFF939396),
                modifier = Modifier.padding(top = 33.dp)
            )
            Canvas(
                modifier = Modifier.fillMaxWidth()
            ) {
                drawCircle(style = Stroke(3f),  color = Color(0xFF57A9FF), radius = 25f, center = Offset(450f,200f))
                drawCircle(color =  Color(0xFF57A9FF), radius = 25f, center = Offset(550f,200f))
                drawCircle(style = Stroke(3f), color =  Color(0xFF57A9FF), radius = 25f, center = Offset(650f,200f))
            }
        }

        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Icon(
                painter = painterResource(id = R.drawable.secondillustation),
                contentDescription = "",
                modifier = Modifier
                    .padding(bottom = 50.dp)
                    .width(366.dp)
                    .height(217.47.dp),
                tint = Color.Unspecified
            )
        }
    }
}




//третья страница
@Composable
@Preview(showBackground = true)
fun OnBoard3(/*navController: NavHostController*/) {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = "Пропустить", fontSize = 20.sp, color = Color(0xFF57A9FF),
                modifier = Modifier.padding(top = 30.dp, bottom = 50.dp, start = 25.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.subtract),
                contentDescription = "",
                modifier = Modifier
                    .padding(top = 30.dp)
                    .width(167.04.dp)
                    .height(163.11.dp),
                tint = Color(0xFF57A9FF)
            )
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Мониторинг", fontSize = 20.sp, color = Color(0xFF00B712)
            )
            Text(
                text = "     Наши врачи всегда наблюдают \n" +
                        "за вашими показателями здоровья", fontSize = 14.sp, color = Color(0xFF939396),
                modifier = Modifier.padding(top = 33.dp)
            )
            Canvas(
                modifier = Modifier.fillMaxWidth()
            ) {
                drawCircle(style = Stroke(3f),  color = Color(0xFF57A9FF), radius = 25f, center = Offset(550f,200f))
                drawCircle(style = Stroke(3f), color =  Color(0xFF57A9FF), radius = 25f, center = Offset(450f,200f))
                drawCircle(color =  Color(0xFF57A9FF), radius = 25f, center = Offset(650f,200f))
            }
        }

        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Icon(
                painter = painterResource(id = R.drawable.thirdillustrationpng),
                contentDescription = "",
                modifier = Modifier
                    .padding(bottom = 50.dp)
                    .width(359.dp)
                    .height(269.47.dp),
                tint = Color.Unspecified
            )
        }
    }
}




@Preview
@ExperimentalMaterial3Api
@Composable
fun FirstScreen() {
    val email = remember { mutableStateOf("")}
    Column(modifier = Modifier
        .background(Color.White)
        .padding(horizontal = 20.dp)
        .fillMaxHeight()
    ) {
        Text(
            "🖐 Добро пожаловать!",
            fontSize = 29.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 100.dp)
        )
        Text(
            "Войдите, чтобы пользоваться функциями приложения",
            fontSize = 16.sp,
            modifier = Modifier
                .padding(top = 20.dp)
        )
        Text(
            "Вход по E-mail",
            fontSize = 14.sp,
            modifier = Modifier
                .padding(top = 75.dp),
            color = Color(0xFF939396)
        )
        TextField(
            value = email.value,
            onValueChange = { newText -> email.value = newText },
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth(1f),
            maxLines = 1,
            singleLine = true,
            shape = RoundedCornerShape(13.dp),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xFFF5F5F9),
                focusedIndicatorColor = Color(0xFFF5F5F9),
                unfocusedIndicatorColor = Color(0xFFF5F5F9),
                cursorColor = Color.Black,
                unfocusedPlaceholderColor = Color(0xFF939396)
            ),
            placeholder = { Text("example@mail.ru") }
        )

        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(top = 40.dp)
                .height(60.dp),
            enabled = email.value.isNotEmpty(),
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A6FEE),
                disabledContentColor = Color(0xFFC9D4FB)),
        ) {
            Text(
                text = "Далее",
                fontSize = 20.sp,
                color = Color.White
            )

        }
        Text(
            text = "Или войдите с помощью",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 240.dp, bottom = 20.dp),
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            color = Color(0xFF939396)
        )
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight()
                .padding(bottom = 55.dp),

            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFFFFF),
                disabledContentColor = Color(0xFFC9D4FB)),
            border = BorderStroke(3.dp, Color.LightGray)
        ){
            Text(
                text = "Войти с Яндекс",
                fontSize = 18.sp,
                color = Color.Black
            )
        }
    }
}




@Preview
@ExperimentalMaterial3Api
@Composable
fun SecondFScreen() {
    val email = remember { mutableStateOf("")}
    Column(modifier = Modifier
        .background(Color.White)
        .padding(horizontal = 20.dp)
        .fillMaxHeight()
    ) {
        Text(
            "🖐 Добро пожаловать!",
            fontSize = 29.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 100.dp)
        )
        Text(
            "Войдите, чтобы пользоваться функциями приложения",
            fontSize = 16.sp,
            modifier = Modifier
                .padding(top = 20.dp)
        )
        Text(
            "Вход по E-mail",
            fontSize = 14.sp,
            modifier = Modifier
                .padding(top = 75.dp),
            color = Color(0xFF939396)
        )
        TextField(
            value = email.value,
            onValueChange = { newText -> email.value = newText },
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth(1f),
            maxLines = 1,
            singleLine = true,
            shape = RoundedCornerShape(13.dp),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xFFF5F5F9),
                focusedIndicatorColor = Color(0xFFF5F5F9),
                unfocusedIndicatorColor = Color(0xFFF5F5F9),
                cursorColor = Color.Black,
                unfocusedPlaceholderColor = Color(0xFF939396)
            ),
            placeholder = { Text("example@mail.ru") }
        )

        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(top = 40.dp)
                .height(60.dp),
            enabled = email.value.isNotEmpty(),
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(26, 111, 238, 1),
                disabledContentColor = Color(26, 111, 238, 1)),
        ) {
            Text(
                text = "Далее",
                fontSize = 20.sp,
                color = Color.White
            )

        }
        Text(
            text = "Или войдите с помощью",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 240.dp, bottom = 20.dp),
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            color = Color(0xFF939396)
        )
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight()
                .padding(bottom = 55.dp),

            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFFFFF),
                disabledContentColor = Color(0xFFC9D4FB)),
            border = BorderStroke(3.dp, Color.LightGray)
        ){
            Text(
                text = "Войти с Яндекс",
                fontSize = 18.sp,
                color = Color.Black
            )
        }
    }
}



@Preview(showBackground = true)
//@ExperimentalMaterial3Api
@Composable
fun SecondScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            //Text(
                //text = "Пропустить", fontSize = 20.sp, color = Color(0xFF57A9FF),
                //modifier = Modifier.padding(top = 30.dp, bottom = 50.dp, start = 25.dp)
            //)
            //Icon(
            //    painter = painterResource(id = R.drawable.subtract),
            //   contentDescription = "",
            //    modifier = Modifier
            //        .padding(top = 30.dp)
            //        .width(167.04.dp)
            //        .height(163.11.dp),
            //    tint = Color(0xFF57A9FF)
            //)
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Введите код из Email", fontSize = 20.sp, color = Color(0xFF00B712)
            )
            Text(
                text = "     Наши врачи всегда наблюдают \n" +
                        "за вашими показателями здоровья",
                fontSize = 14.sp,
                color = Color(0xFF939396),
                modifier = Modifier.padding(top = 33.dp)
            )
            Canvas(
                modifier = Modifier.fillMaxWidth()
            ) {
                drawCircle(
                    style = Stroke(3f),
                    color = Color(0xFF57A9FF),
                    radius = 25f,
                    center = Offset(550f, 200f)
                )
                drawCircle(
                    style = Stroke(3f),
                    color = Color(0xFF57A9FF),
                    radius = 25f,
                    center = Offset(450f, 200f)
                )
                drawCircle(color = Color(0xFF57A9FF), radius = 25f, center = Offset(650f, 200f))
            }
        }
    }
}



//@Preview(showBackground = true)
//@Composable
//fun Wel_Preview(){
//    //Welcom()
//    FirstScreen()
//}



