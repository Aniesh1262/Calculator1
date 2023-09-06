package com.example.calculator

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            // Use the portrait layout
            setContentView(R.layout.activity_main)
            Log.d("MyApp", "Portrait layout selected");
        } else if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Use the landscape layout

            setContentView(R.layout.activity_main_land)
            Log.d("MyApp", "Landscape layout selected");
        }
    }
}

//        val inputTextView: TextView = findViewById(R.id.textid)
//        val buttons = arrayOf(
//            findViewById<Button>(R.id.C), findViewById(R.id.mod), findViewById(R.id.percent),
//            findViewById(R.id.divide), findViewById(R.id.seven), findViewById(R.id.eight),
//            findViewById(R.id.nine), findViewById(R.id.mutliply), findViewById(R.id.four),
//            findViewById(R.id.five), findViewById(R.id.six), findViewById(R.id.subtract),
//            findViewById(R.id.one), findViewById(R.id.two), findViewById(R.id.three),
//            findViewById(R.id.add), findViewById(R.id.zero), findViewById(R.id.dot),
//            findViewById(R.id.equals)
//        )
//
//        var currentInput = ""
//
//        for (button in buttons) {
//            button.setOnClickListener {
//                val buttonText = button.text.toString()
//
//                when {
//                    buttonText == "C" -> {
//                        currentInput = ""
//                    }
//                    buttonText == "=" -> {
//                        try {
//
//                        } catch (e: Exception) {
//                            currentInput = "Error"
//                        }
//                    }
//                    else -> {
//                        currentInput += buttonText
//                    }
//                }
//
//                inputTextView.text = currentInput
//            }
//        }
//    } }
