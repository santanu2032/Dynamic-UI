package com.Presentation.CommonUI.Event.Event_II
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex

@Composable
fun InputContainer(){

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Transparent)
        .zIndex(1f)
    ){

        Row(modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .fillMaxHeight(0.08f)
            .align(Alignment.BottomCenter)
            .background(Color.Red, shape = RoundedCornerShape(24.dp)),
            horizontalArrangement = Arrangement.spacedBy(2.dp, alignment = Alignment.End),//TODO    (change tHE COLOR UX OPERATION)
            verticalAlignment = Alignment.CenterVertically){


            Box(modifier = Modifier
                .padding(end = 5.dp, start = 3.dp, top = 3.dp, bottom = 3.dp)
                .width(285.dp)
                .fillMaxHeight()
                .clip(CircleShape)
                .background(Color.Green)//TODO    (change THE COLOR UX OPERATION)
            ){

                TextField_event_2()
            }

            Box(
                modifier = Modifier
                    .padding(end = 10.dp)
                    .width(30.dp)
                    .height(40.dp)
                    .clip(CircleShape)

                    .background(color = Color.White)
                    .clickable{
                        TODO("link the manager")
                    },
                contentAlignment = Alignment.Center) {
                Text(text = "A") }
            Box(
                modifier = Modifier
                    .padding(end = 10.dp)
                    .width(30.dp)
                    .height(40.dp)
                    .clip(CircleShape)

                    .background(color = Color.White)
                    .clickable{
                        TODO("link the manager")
                    },
                contentAlignment = Alignment.Center
            )
            {
                Text(text = "A")
            }




        }

    }

}
