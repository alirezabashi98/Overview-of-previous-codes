package com.example.myapplication

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Adapter.adapter_list_code
import com.example.myapplication.DataClass.recyDataClass
import kotlinx.android.synthetic.main.activity_list_code.*
import java.util.Collections.list

class List_code : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_code)
        val list = listOf(
            recyDataClass("EditText"),
            recyDataClass("RadioButton"),
            recyDataClass("CheckBox"),
            recyDataClass("switch"),
            recyDataClass("toggleButton")
        )
        recyclerView_list_code.layoutManager = LinearLayoutManager(this)
        recyclerView_list_code.adapter = adapter_list_code(list)

    }

    override fun onBackPressed() {
        super.onBackPressed()
      val dialog = Dialog(this)

    }
}