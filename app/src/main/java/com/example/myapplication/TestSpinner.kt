package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.myapplication.Adapter.adapter_listview
import com.example.myapplication.DataClass.DataClass_ListView
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

//        val list = listOf(
//            DataClass_ListView(R.drawable.img_login,"ali","hi"),
//            DataClass_ListView(R.drawable.img_splsh_screen,"reza","hello"),
//            DataClass_ListView(R.drawable.img_login,"ali","hi"),
//            DataClass_ListView(R.drawable.img_login,"ali","hi"),
//            DataClass_ListView(R.drawable.img_login,"ali","hi"),
//            DataClass_ListView(R.drawable.img_login,"ali","hi"),
//            DataClass_ListView(R.drawable.img_login,"ali","hi"),
//            DataClass_ListView(R.drawable.img_login,"ali","hi")
//        )
//
//
//        spinner.adapter = adapter_listview(list)
    }
}