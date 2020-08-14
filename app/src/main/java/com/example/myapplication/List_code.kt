package com.example.myapplication

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
            recyDataClass("EditText"),                                     // 0
            recyDataClass("RadioButton"),                                  // 1
            recyDataClass("CheckBox"),                                     // 2
            recyDataClass("Switch"),                                       // 3
            recyDataClass("ToggleButton"),                                 // 4
            recyDataClass("Chronometer"),                                  // 5
            recyDataClass("CountDownTimer"),                               // 6
            recyDataClass("Calculator"),                                   // 7
            recyDataClass("TextInputLayout"),                              // 8
            recyDataClass("CustomListView"),                               // 9
            recyDataClass("Spinner"),                                      // 10
            recyDataClass("AutoCompleteTextView"),                         // 11
            recyDataClass("MultiAutoCompleteTextView"),                    // 12
            recyDataClass("SnackBar"),                                     // 13
            recyDataClass("AlertDialog")   ,                               // 14
            recyDataClass("WebView"),                                      // 15
            recyDataClass("VideoView"),                                    // 16
            recyDataClass("MediaPlayer"),                                  // 17
            recyDataClass("Time DatePicer"),                               // 18
            recyDataClass("TimePicer"),                                    // 19
            recyDataClass("Menu"),                                         // 20
            recyDataClass("ToolBar")                                       // 21
        )
        recyclerView_list_code.layoutManager = LinearLayoutManager(this)
        recyclerView_list_code.adapter = adapter_list_code(list)

    }

    override fun onBackPressed() {
//        super.onBackPressed()
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialog)
        val exit = dialog.findViewById<Button>(R.id.btn_customDialog_exit)
        val min1 = dialog.findViewById<Button>(R.id.btn_customDialog_minimize1)
        val min2 = dialog.findViewById<Button>(R.id.btn_customDialog_minimize2)
        val no = dialog.findViewById<Button>(R.id.btn_customDialog_no)
        val yes = dialog.findViewById<Button>(R.id.btn_customDialog_yes)
        exit.setOnClickListener { finishAffinity() }
        min1.setOnClickListener { dialog.cancel() }
        min2.setOnClickListener { dialog.cancel() }
        no.setOnClickListener { dialog.cancel() }
        yes.setOnClickListener { finishAffinity() }
        dialog.show()


    }
}