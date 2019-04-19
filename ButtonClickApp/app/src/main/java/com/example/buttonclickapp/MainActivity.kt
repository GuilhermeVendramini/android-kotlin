package com.example.buttonclickapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private const val TEXT_CONTENTS = "TextContent"

class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput : EditText = findViewById<EditText>(R.id.editText)
        val button : Button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)
        textView?.movementMethod = ScrollingMovementMethod()

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                textView?.append(userInput.text)
                textView?.append("\n")
                userInput.text.clear()
                // userInput.setText("")
            }
        })
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        // Get textView value. Necessary to don't lose the textView value when the cellphone rotate
        textView?.text = savedInstanceState?.getString(TEXT_CONTENTS, "")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        // Set textView value in TEXT_CONTENTS
        outState?.putString(TEXT_CONTENTS, textView?.text.toString())
    }

}
