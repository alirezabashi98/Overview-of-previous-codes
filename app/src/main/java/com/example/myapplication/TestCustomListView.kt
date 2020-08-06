package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.Adapter.adapter_listview
import com.example.myapplication.DataClass.DataClass_ListView
import kotlinx.android.synthetic.main.activity_test_custom_list_view.*

class TestCustomListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_custom_list_view)

        val list = listOf(
            DataClass_ListView(R.drawable.img_login,"ali","hi"),
            DataClass_ListView(R.drawable.img_splsh_screen,"reza","hello"),
            DataClass_ListView(R.drawable.img_login,"ali","hi"),
            DataClass_ListView(R.drawable.img_login,"ali","hi"),
            DataClass_ListView(R.drawable.img_login,"ali","hi"),
            DataClass_ListView(R.drawable.img_login,"ali","hi"),
            DataClass_ListView(R.drawable.img_login,"ali","hi"),
            DataClass_ListView(R.drawable.img_login,"ali","hi")
        )

        customListView.adapter = adapter_listview(list)

    }
}