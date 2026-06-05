import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.Presentation.CommonUI.Event.EventStatus
import com.Presentation.CommonUI.Event.Event_II.Event_2
import com.Presentation.CommonUI.values.CustomColorKT
import com.Presentation.CommonUI.values.SantanuCC
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    // 1. Initialize the Compose test rule
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testAssistantInterface() {
        // 2. Wrap your Composable inside setContent
        composeTestRule.setContent {
            Test()
        }

    }
}


@Preview
@Composable
fun Test(){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {

        Box(modifier = Modifier
            .fillMaxWidth(0.105f)
            .fillMaxHeight(0.08f)
            .background(color = Color.White,shape = CircleShape)
            .align(BiasAlignment(horizontalBias = 0.95f, verticalBias = 0.96f))
            .clickable{

            }
            , contentAlignment = Alignment.Center
        ){

            Text("Audio")
        }

        Box(modifier = Modifier
            .fillMaxWidth(0.105f)
            .fillMaxHeight(0.08f)
            .background(color = Color.White,shape = CircleShape)
            .align(BiasAlignment(horizontalBias = 0.65f, verticalBias = 0.96f))
            .clickable{

            }
            , contentAlignment = Alignment.Center
        ){

            Text("send")
        }


        TextField(
            modifier = Modifier
                .fillMaxWidth(0.65f)
                .fillMaxHeight(0.085f)
                .align(BiasAlignment(horizontalBias = -0.83f, verticalBias = 0.96f)),
            state = rememberTextFieldState(""),
            placeholder = { Text("Type something...") },
            textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.Center),
            shape = CircleShape,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Gray,
                unfocusedContainerColor = Color.Black,
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.White,
                focusedIndicatorColor = SantanuCC().navyBlue,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                errorIndicatorColor = Color.Red,
                cursorColor = SantanuCC().navyBlue,
                selectionColors = androidx.compose.foundation.text.selection.TextSelectionColors(
                    handleColor = SantanuCC().navyBlue,
                    backgroundColor = SantanuCC().navyBlue.copy(alpha = 0.4f)
                )
            )
        )

    }
}
