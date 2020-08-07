package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_test_spinner.*

class TestSpinner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_spinner)

        val list = listOf(
            "Fa",
            "En"
        )

        spinner.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,list)
    }
}