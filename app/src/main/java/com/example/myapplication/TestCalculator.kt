package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_test_calculator.*

class TestCalculator : AppCompatActivity() {

    var oValue = ""
    var tValue = ""
    var opera  = ""
    var clear = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_calculator)

    }

    fun onClick_Calculator(v:View){
        when(v.id){

            R.id.btn_calculator_exit -> {exit()}
            R.id.btn_value_0 -> {addNumber("0")}
            R.id.btn_value_1 -> {addNumber("1")}
            R.id.btn_value_2 -> {addNumber("2")}
            R.id.btn_value_3 -> {addNumber("3")}
            R.id.btn_value_4 -> {addNumber("4")}
            R.id.btn_value_5 -> {addNumber("5")}
            R.id.btn_value_6 -> {addNumber("6")}
            R.id.btn_value_7 -> {addNumber("7")}
            R.id.btn_value_8 -> {addNumber("8")}
            R.id.btn_value_9 -> {addNumber("9")}
            R.id.btn_operator_clear -> {addOperator("c")}
            R.id.btn_operator_division -> {addOperator("/")}
            R.id.btn_operator_beat -> {addOperator("*")}
            R.id.btn_operator_minus -> {addOperator("-")}
            R.id.btn_operator_total -> {addOperator("+")}
            R.id.btn_operator_equal -> {setAnswer()}

        }
    }

    private fun exit(){
        finish()
    }

    private fun addNumber(x:String){
        if (clear) {
            clear = false
            tv_calculator_values.text = " "
        }
        if (opera.isEmpty()){
                oValue += x
                setText(oValue)
        }else{
            tValue += x
            setText(tValue)
        }
    }

    private fun setText(txt:String){
        tv_calculator_values.text = txt
    }

    private fun addOperator(ope:String){
        if (ope == "c") {
            calculatorClear()
            return
        }

        if (tValue.isEmpty()) {
            xadd(ope)
        }
        else{
            setAnswer()
            xadd(ope)
        }
    }

private fun xadd(x:String){
    when(x){
        "/" -> {
            if (oValue.isNotEmpty()){
                opera = "/"
                tv_calculator_op.text = "/"
                if(opera.isEmpty()){setText("")}
                tv_calculator_the_total_quantites.text = "$oValue /"
                tv_calculator_values.text = ""
            }
        }
        "*" -> {
            if (oValue.isNotEmpty()){
                opera = "*"
                tv_calculator_op.text = "*"
                if(opera.isEmpty()){setText("")}
                tv_calculator_the_total_quantites.text = "$oValue *"
                tv_calculator_values.text = ""
            }
        }
        "-" -> {
            if (oValue.isNotEmpty()){
                opera = "-"
                tv_calculator_op.text = "-"
                if(opera.isEmpty()){setText("")}
                tv_calculator_the_total_quantites.text = "$oValue -"
                tv_calculator_values.text = ""
            }

        }
        "+" -> {
            if (oValue.isNotEmpty()){
                opera = "+"
                tv_calculator_op.text = "+"
                if(opera.isEmpty()){setText("")}
                tv_calculator_the_total_quantites.text = "$oValue +"
                tv_calculator_values.text = ""
            }

        }
        "c" -> {
            calculatorClear()
        }
    }
}

    private fun calculatorClear(){
        oValue = ""
        tValue = ""
        opera  = ""
        clear = false

        tv_calculator_the_total_quantites.text = " "
        tv_calculator_values.text = " "
        tv_calculator_op.text = " "
    }

    private fun setAnswer(){

            if (tValue.isNotEmpty() && oValue.isNotEmpty() && opera.isNotEmpty()){
                when(opera){
                    "/" -> {
                        if (oValue.toInt() == 0 || tValue.toInt() == 0){
                            calculatorClear()
                            Toast.makeText(this,"Undefined operation",Toast.LENGTH_SHORT).show()
                            return
                        }
                        oValue = (oValue.toInt() / tValue.toInt()).toString()
                        tv_calculator_the_total_quantites.text = "$oValue"
                        clear = true
                        tv_calculator_values.text = " "
                        tValue = ""
                    }
                    "*" -> {
                        if (oValue.toInt() == 0 || tValue.toInt() == 0){
                            calculatorClear()
                            Toast.makeText(this,"Undefined operation",Toast.LENGTH_SHORT).show()
                            return
                        }
                        oValue = (oValue.toInt() * tValue.toInt()).toString()
                        tv_calculator_the_total_quantites.text = "$oValue"
                        clear = true
                        tv_calculator_values.text = " "
                        tValue = ""
                    }
                    "-" -> {
                        oValue = (oValue.toInt() - tValue.toInt()).toString()
                        tv_calculator_the_total_quantites.text = "$oValue"
                        clear = true
                        tv_calculator_values.text = " "
                        tValue = ""
                    }
                    "+" -> {
                        oValue = (oValue.toInt() + tValue.toInt()).toString()
                        tv_calculator_the_total_quantites.text = "$oValue"
                        clear = true
                        tv_calculator_values.text = " "
                        tValue = ""
                    }
                }
        }
    }
}