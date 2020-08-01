package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_test_chronometer.*

class TestChronometer : AppCompatActivity() {

    private var pauseTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_chronometer)

        toggleBtn_Chronometer.setOnClickListener {
            if (toggleBtn_Chronometer.isChecked){

                test_Chronometer.base = SystemClock.elapsedRealtime() - pauseTime
                test_Chronometer.start()

            }else{

                pauseTime = SystemClock.elapsedRealtime() - test_Chronometer.base
                test_Chronometer.stop()

            }
        }
    }
}