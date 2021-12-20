package com.example.homeworkfour

import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.example.homeworkfour.DisplayText
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.homeworkfour.R
import com.example.homeworkfour.MainActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var textView: TextView? = null
    var buttonOne: Button? = null
    var buttonTwo: Button? = null
    var buttonThree: Button? = null
    var buttonFour: Button? = null
    var buttonFive: Button? = null
    var buttonSix: Button? = null
    var buttonSeven: Button? = null
    var buttonEight: Button? = null
    var buttonNine: Button? = null
    var buttonZero: Button? = null
    var buttonPlus: Button? = null
    var buttonSubtract: Button? = null
    var buttonMultiply: Button? = null
    var buttonDivision: Button? = null
    var buttonComma: Button? = null
    var buttonDot: Button? = null
    var buttonEquals: Button? = null
    var displayText: DisplayText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initListener()
        displayText = DisplayText()
    }

    public override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(TAG, displayText)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        displayText = savedInstanceState.getParcelable(TAG)
        textView!!.text = displayText!!.text
    }

    private fun initListener() {
        buttonOne!!.setOnClickListener(this)
        buttonTwo!!.setOnClickListener(this)
        buttonThree!!.setOnClickListener(this)
        buttonFour!!.setOnClickListener(this)
        buttonFive!!.setOnClickListener(this)
        buttonSix!!.setOnClickListener(this)
        buttonSeven!!.setOnClickListener(this)
        buttonEight!!.setOnClickListener(this)
        buttonNine!!.setOnClickListener(this)
        buttonZero!!.setOnClickListener(this)
        buttonPlus!!.setOnClickListener(this)
        buttonSubtract!!.setOnClickListener(this)
        buttonMultiply!!.setOnClickListener(this)
        buttonDivision!!.setOnClickListener(this)
        buttonComma!!.setOnClickListener(this)
        buttonDot!!.setOnClickListener(this)
        buttonEquals!!.setOnClickListener(this)
    }

    private fun initView() {
        textView = findViewById(R.id.text_view)
        buttonOne = findViewById(R.id.button_one)
        buttonTwo = findViewById(R.id.button_two)
        buttonThree = findViewById(R.id.button_three)
        buttonFour = findViewById(R.id.button_four)
        buttonFive = findViewById(R.id.button_five)
        buttonSix = findViewById(R.id.button_six)
        buttonSeven = findViewById(R.id.button_seven)
        buttonEight = findViewById(R.id.button_eight)
        buttonNine = findViewById(R.id.button_nine)
        buttonZero = findViewById(R.id.button_zero)
        buttonPlus = findViewById(R.id.button_plus)
        buttonSubtract = findViewById(R.id.button_subtract)
        buttonMultiply = findViewById(R.id.button_multiply)
        buttonDivision = findViewById(R.id.button_division)
        buttonComma = findViewById(R.id.button_comma)
        buttonDot = findViewById(R.id.button_dot)
        buttonEquals = findViewById(R.id.button_equals)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.button_one -> {
                displayText!!.text = "1"
                textView!!.text = displayText!!.text
            }
            R.id.button_two -> {
                displayText!!.text = "2"
                textView!!.text = displayText!!.text
            }
            R.id.button_three -> {
                displayText!!.text = "3"
                textView!!.text = displayText!!.text
            }
            R.id.button_four -> {
                displayText!!.text = "4"
                textView!!.text = displayText!!.text
            }
            R.id.button_five -> {
                displayText!!.text = "5"
                textView!!.text = displayText!!.text
            }
            R.id.button_six -> {
                displayText!!.text = "6"
                textView!!.text = displayText!!.text
            }
            R.id.button_seven -> {
                displayText!!.text = "7"
                textView!!.text = displayText!!.text
            }
            R.id.button_eight -> {
                displayText!!.text = "8"
                textView!!.text = displayText!!.text
            }
            R.id.button_nine -> {
                displayText!!.text = "9"
                textView!!.text = displayText!!.text
            }
            R.id.button_zero -> {
                displayText!!.text = "0"
                textView!!.text = displayText!!.text
            }
            R.id.button_plus -> {
                displayText!!.text = "+"
                textView!!.text = displayText!!.text
            }
            R.id.button_subtract -> {
                displayText!!.text = "-"
                textView!!.text = displayText!!.text
            }
            R.id.button_multiply -> {
                displayText!!.text = "*"
                textView!!.text = displayText!!.text
            }
            R.id.button_division -> {
                displayText!!.text = "/"
                textView!!.text = displayText!!.text
            }
            R.id.button_comma -> {
                displayText!!.text = ","
                textView!!.text = displayText!!.text
            }
            R.id.button_dot -> {
                displayText!!.text = "."
                textView!!.text = displayText!!.text
            }
            R.id.button_equals -> {
                displayText!!.text = "="
                textView!!.text = displayText!!.text
            }
            else -> {}
        }
    }

    companion object {
        var TAG = "displayText"
    }
}