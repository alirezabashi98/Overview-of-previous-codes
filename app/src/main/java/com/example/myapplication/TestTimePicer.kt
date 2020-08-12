package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_test_time_picer.*

class TestTimePicer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_time_picer)

        timePicker.setIs24HourView(true)

    }

    fun onClick_TimePicer(v:View){

        Snackbar.make(v,"${timePicker.currentHour}:${timePicker.currentMinute}",Snackbar.LENGTH_LONG).show()

    }
}