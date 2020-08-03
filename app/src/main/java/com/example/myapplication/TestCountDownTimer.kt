package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_test_count_down_timer.*
import kotlin.concurrent.timer

class TestCountDownTimer : AppCompatActivity() {

    val MAIN_VALUE = 66_000L
    var Time_s = MAIN_VALUE
    lateinit var countDownTimer: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_count_down_timer)

        setText(Time_s)
        toggle_countDownTimer.setOnClickListener {
            if (toggle_countDownTimer.isChecked) {
                runTimer()
            } else {
                countDownTimer.cancel()
            }
        }
    }

    fun runTimer() {
        countDownTimer = object : CountDownTimer(Time_s, 1_000) {
            override fun onFinish() {
                setText(Time_s)
                Time_s = MAIN_VALUE
                toggle_countDownTimer.isChecked = false
                Toast.makeText(this@TestCountDownTimer, "restart", Toast.LENGTH_SHORT).show()
                setText(Time_s)
            }

            override fun onTick(timeOut: Long) {
                Time_s = timeOut
                setText(Time_s)
            }

        }.start()
    }

    fun setText(s: Long) {
        tv_countDownTimer.text = String.format("%02d:%02d", (s / 1000) / 60, (s / 1000) % 60)
    }
}