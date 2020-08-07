package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_test_auto_complete_text_view.*

class TestAutoCompleteTextView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_auto_complete_text_view)

        val list = listOf(
            "ali",
            "reza",
            "mmd",
            "sina"
        )

        test_AutoCompleteTextView.setAdapter(ArrayAdapter(this,android.R.layout.simple_list_item_1,list))
        test_AutoCompleteTextView.threshold = 1

    }
}