package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.MultiAutoCompleteTextView
import kotlinx.android.synthetic.main.activity_test_multi_auto_complete_text_view.*

class TestMultiAutoCompleteTextView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_multi_auto_complete_text_view)
        val list = listOf(
            "ali",
            "reza",
            "mmd",
            "sina"
        )

        test_MultiAutoCompleteTextView.setAdapter(ArrayAdapter(this,android.R.layout.simple_list_item_1,list))

        test_MultiAutoCompleteTextView.threshold = 1

        test_MultiAutoCompleteTextView.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())
    }
}