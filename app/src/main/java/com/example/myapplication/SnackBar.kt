package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar

class SnackBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar)
    }

    fun onClick_ShowSnackBar(v:View){

        val snack = Snackbar.make(v,"",Snackbar.LENGTH_INDEFINITE)
            .setAction("Hidden"){
                Toast.makeText(this,"Hide snackBar",Toast.LENGTH_SHORT).show()
            }

//        change the background color
//        snack.view.setBackgroundColor(ContextCompat.getColor(this,R.color.colorAmber))

//        change the color of the text
//        val txt = snack.view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text).setTextColor(ContextCompat.getColor(this,R.color.colorBlack))
    }
}