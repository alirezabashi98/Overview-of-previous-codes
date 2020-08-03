package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_test_count_down_timer.*
import kotlin.concurrent.timer

class TestCountDownTimer : AppCompatActivity() {

    var mainTime = 1_000L
    var countDownTimer: CountDownTimer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_count_down_timer)

        toggle_countDownTimer.setOnClickListener {
            if(toggle_countDownTimer.isChecked){
                runTimer()
            }else{
                countDownTimer?.cancel()
            }
        }
    }

    fun runTimer() {
        countDownTimer = object : CountDownTimer(mainTime, 1000) {
            override fun onFinish() {

            }

            override fun onTick(timeOut: Long) {
                mainTime = timeOut
                setText(mainTime)
            }

        }
    }

    fun setText(s: Long) {
        tv_countDownTimer.text = String.format("%02d:%02d", (s / 1000) / 60, (s / 1000) % 60)
    }
}