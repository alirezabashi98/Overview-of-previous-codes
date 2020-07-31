package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_test_toggle_button.*

class TestToggleButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_toggle_button)

        test_ToggleButton.setOnClickListener {
            if (test_ToggleButton.isChecked){
                lin_ToggleButton.setBackgroundResource(R.color.colorBlack)
            }else{
                lin_ToggleButton.setBackgroundResource(R.color.colorWhit)
            }
        }
    }
}