package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class testCheckBox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_check_box)
    }

    fun onClick_CheckBox(v:View){
        when(v.id){
            R.id.CheckBox_1 -> { Toast.makeText(this,"CheckBox 1", Toast.LENGTH_SHORT).show()}
            R.id.CheckBox_2 -> {Toast.makeText(this,"CheckBox 2", Toast.LENGTH_SHORT).show()}
            R.id.CheckBox_3 -> {Toast.makeText(this,"CheckBox 3", Toast.LENGTH_SHORT).show()}
            else -> {Toast.makeText(this,"CheckBox error", Toast.LENGTH_SHORT).show()}
        }
    }
}