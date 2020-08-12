package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_test_time_date_picer.*

class TestTimeDatePicer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_time_date_picer)

    }

    fun onClick_DatePicer(v:View){

        Snackbar.make(v,"${datePicker.year}/${datePicker.month}/${datePicker.dayOfMonth}",Snackbar.LENGTH_LONG).show()

    }
}