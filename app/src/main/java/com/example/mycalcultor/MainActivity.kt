package com.example.mycalcultor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycalcultor.ui.theme.MyCalcultorTheme
import java.lang.ArithmeticException
import java.lang.Exception
import javax.xml.xpath.XPathExpression
import kotlin.math.exp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .background(color = Color.Black)
                    .fillMaxHeight()
                    .fillMaxWidth()
            ) {
                Column {
                    Title()
                    ResultAndOperationView()
                }
            }
        }
    }
}

@Composable
fun Title(){
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.12f)
            .padding(top = 20.dp)
    ) {
        Text(text = "Calculator",
            color = Color.Yellow,
            fontSize = 35.sp
        )
    }
}

@Composable
fun ResultAndOperationView(
){
    val expression = remember {
        mutableStateOf("")
    }
    val result = remember {
        mutableStateOf("")
    }

    Card(
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .padding(bottom = 25.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier
                .background(color = Color.DarkGray)
                .fillMaxWidth()
                .fillMaxHeight(0.19f)
                .padding(top = 20.dp, end = 30.dp)
        ) {
            Text(
                text = expression.value,
                color = Color.White,
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = result.value,
                color = Color.White,
                fontSize = 55.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ){
            Button(
                onClick = {
                    expression.value = ""
                    result.value = ""
                },
                enabled = true,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow),
            ) {
                Text(text = "C", color = Color.Gray, fontSize = 50.sp)
            }
            Button(
                onClick = {
                    expression.value += "+"
                },
                enabled = true,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow),
            ) {
                Text(text = "+", color = Color.Gray, fontSize = 50.sp)
            }
            Button(
                onClick = {
                    expression.value += "-"
                },
                enabled = true,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow),
            ) {
                Text(text = "-", color = Color.Gray, fontSize = 50.sp)
            }
            Button(
                onClick = {
                    expression.value += "x"
                },
                enabled = true,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow),
            ) {
                Text(text = "x", color = Color.Gray, fontSize = 50.sp)
            }
            Button(
                onClick = {
                    expression.value += "/"
                },
                enabled = true,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow),
            ) {
                Text(text = "/", color = Color.Gray, fontSize = 50.sp)
            }
        }

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
        ){
            Button(
                onClick = {
                    expression.value += "7"
                },
                enabled = true,
                colors = ButtonDefaults
                    .buttonColors(backgroundColor = Color(0xFF180A0A)),
            ) {
                Text(text = "7", color = Color.White, fontSize = 50.sp)
            }
            Button(
                onClick = {
                    expression.value += "8"
                },
                enabled = true,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF180A0A)),
            ) {
                Text(text = "8", color = Color.White, fontSize = 50.sp)
            }
            Button(
                onClick = {
                    expression.value += "9"
                },
                enabled = true,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF180A0A)),
            ) {
                Text(text = "9", color = Color.White, fontSize = 50.sp)
            }
        }

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
        ){
            Button(
                onClick = {
                    expression.value += "4"
                },
                enabled = true,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF180A0A)),
            ) {
                Text(text = "4", color = Color.White, fontSize = 50.sp)
            }
            Button(
                onClick = {
                    expression.value += "5"
                },
                enabled = true,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF180A0A)),
            ) {
                Text(text = "5", color = Color.White, fontSize = 50.sp)
            }
            Button(
                onClick = {
                    expression.value += "6"
                },
                enabled = true,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF180A0A)),
            ) {
                Text(text = "6", color = Color.White, fontSize = 50.sp)
            }
        }

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
        ){
            Button(
                onClick = {
                    expression.value += "1"
                },
                enabled = true,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF180A0A)),
            ) {
                Text(text = "1", color = Color.White, fontSize = 50.sp)
            }
            Button(
                onClick = {
                    expression.value += "2"
                },
                enabled = true,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF180A0A)),

            ) {
                Text(text = "2", color = Color.White, fontSize = 50.sp)
            }
            Button(
                onClick = {
                    expression.value += "3"
                },
                enabled = true,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF180A0A)),

            ) {
                Text(text = "3", color = Color.White, fontSize = 50.sp)
            }
        }


        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
        ){
            Button(
                onClick = {
                    expression.value += "."
                },
                enabled = true,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF180A0A)),
            ) {
                Text(text = ".", color = Color.White, fontSize = 50.sp)
            }
            Button(
                onClick = {
                    expression.value += "0"
                },
                enabled = true,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF180A0A)),
            ) {
                Text(text = "0", color = Color.White, fontSize = 50.sp)
            }
            Button(
                onClick = {
                    result.value = evaluate(expression.value)
                },
                enabled = true,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF180A0A)),
            ) {
                Text(text = "=", color = Color.White, fontSize = 50.sp)
            }
        }
    }
}

fun evaluate(expression: String): String
{
    try {
        val digitsOperators = digitsOperators(expression)
        if (digitsOperators.isEmpty()) return ""

        val timesDivision = timesDivisionCalculate(digitsOperators)
        if (timesDivision.isEmpty()) return ""

        val result = addSubtractCalculate(timesDivision)
        return result.toString()
    }catch (e : Exception){
        return "Expression Error"
    }
}

fun addSubtractCalculate(passedList: MutableList<Any>): Float
{
    var result = passedList[0] as Float

    for(i in passedList.indices)
    {
        if(passedList[i] is Char && i != passedList.lastIndex)
        {
            val operator = passedList[i]
            val nextDigit = passedList[i + 1] as Float
            if (operator == '+')
                result += nextDigit
            if (operator == '-')
                result -= nextDigit
        }
    }

    return result
}

fun timesDivisionCalculate(passedList: MutableList<Any>): MutableList<Any>
{
    var list = passedList
    while (list.contains('x') || list.contains('/'))
    {
        list = calcTimesDiv(list)
    }
    return list
}

fun calcTimesDiv(passedList: MutableList<Any>): MutableList<Any>
{
    val newList = mutableListOf<Any>()
    var restartIndex = passedList.size

    for(i in passedList.indices)
    {
        if(passedList[i] is Char && i != passedList.lastIndex && i < restartIndex)
        {
            val operator = passedList[i]
            val prevDigit = passedList[i - 1] as Float
            val nextDigit = passedList[i + 1] as Float
            when(operator)
            {
                'x' ->
                {
                    newList.add(prevDigit * nextDigit)
                    restartIndex = i + 1
                }
                '/' ->
                {
                    newList.add(prevDigit / nextDigit)
                    restartIndex = i + 1
                }
                else ->
                {
                    newList.add(prevDigit)
                    newList.add(operator)
                }
            }
        }

        if(i > restartIndex)
            newList.add(passedList[i])
    }

    return newList
}

fun digitsOperators(expression: String): MutableList<Any>
{
    val list = mutableListOf<Any>()
    var currentDigit = ""
    for(character in expression)
    {
        if(character.isDigit() || character == '.')
            currentDigit += character
        else
        {
            list.add(currentDigit.toFloat())
            currentDigit = ""
            list.add(character)
        }
    }

    if(currentDigit != "")
        list.add(currentDigit.toFloat())

    return list
}
