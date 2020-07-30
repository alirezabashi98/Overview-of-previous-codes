package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class testRadioButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_radio_button)

    }

    fun onClick(v:View){
        when(v.id){
            R.id.RadioButton_1 -> {Toast.makeText(this,"RadioButton 1",Toast.LENGTH_SHORT).show()}
            R.id.RadioButton_2 -> {Toast.makeText(this,"RadioButton 2",Toast.LENGTH_SHORT).show()}
            R.id.RadioButton_3 -> {Toast.makeText(this,"RadioButton 3",Toast.LENGTH_SHORT).show()}
            else -> {Toast.makeText(this,"RadioButton error",Toast.LENGTH_SHORT).show()}
        }
    }
}