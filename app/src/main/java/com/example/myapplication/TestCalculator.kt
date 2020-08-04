package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TestCalculator : AppCompatActivity() {

    var oValue : Int? = null
    var tValue : Int? = null
    lateinit var opera : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_calculator)

    }

    fun onClick_Calculator(v:View){
        when(v.id){

            R.id.btn_calculator_exit -> {}
            R.id.btn_value_0 -> {exit()}
            R.id.btn_value_1 -> {}
            R.id.btn_value_2 -> {}
            R.id.btn_value_3 -> {}
            R.id.btn_value_4 -> {}
            R.id.btn_value_5 -> {}
            R.id.btn_value_6 -> {}
            R.id.btn_value_7 -> {}
            R.id.btn_value_8 -> {}
            R.id.btn_value_9 -> {}
            R.id.btn_operator_division -> {}
            R.id.btn_operator_beat -> {}
            R.id.btn_operator_minus -> {}
            R.id.btn_operator_total -> {}
            R.id.btn_operator_equal -> {}

        }
    }

    private fun exit(){
        finish()
    }
}