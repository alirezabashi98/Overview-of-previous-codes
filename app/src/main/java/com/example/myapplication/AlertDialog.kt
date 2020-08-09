package com.example.myapplication

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class AlertDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)
    }

    fun onClick_ShowAlrtDialog(v:View){

        AlertDialog.Builder(this)
            .setCancelable(false)
            .setTitle("AlertDialog")
            .setMessage("Message")
            .setPositiveButton("Yes"){_,_->
                Toast.makeText(this,"Yes",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No"){_,_->
                Toast.makeText(this,"No",Toast.LENGTH_SHORT).show()
            }
            .show()

//        AlertDialog.Builder(this)
//            .setItems(R.array.ary_AlertDialog, DialogInterface.OnClickListener { dialogInterface, i ->
//                when(i){
//                    0 -> {Toast.makeText(this,"Alert 1",Toast.LENGTH_SHORT).show()}
//                    1 -> {Toast.makeText(this,"Alert 2",Toast.LENGTH_SHORT).show()}
//                    2 -> {Toast.makeText(this,"Alert 3",Toast.LENGTH_SHORT).show()}
//                }
//            })
//            .show()
    }
}