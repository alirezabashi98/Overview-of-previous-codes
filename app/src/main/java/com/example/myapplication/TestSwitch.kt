package com.example.myapplication

import android.icu.number.NumberRangeFormatter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_test_switch.*

class TestSwitch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_switch)

//        when clicked
        test_switch.setOnClickListener {
            if (test_switch.isChecked){
//                bright theme
                lin_switch.setBackgroundResource(R.color.colorBlack)
                test_switch.setTextColor(ContextCompat.getColor(applicationContext, R.color.colorWhit))
            }else{
//                dark theme
                lin_switch.setBackgroundResource(R.color.colorWhit)
                test_switch.setTextColor(ContextCompat.getColor(applicationContext,R.color.colorBlack))
            }
        }
    }
}