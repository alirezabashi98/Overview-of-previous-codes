package com.example.myapplication.Adapter

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.*
import com.example.myapplication.DataClass.recyDataClass

class adapter_list_code(private val data :List<recyDataClass>):RecyclerView.Adapter<adapter_list_code.recyViewHolder>(){

    inner class recyViewHolder(view:View):RecyclerView.ViewHolder(view){
        val btn = view.findViewById<Button>(R.id.btn_custom_list)
        val context = view.context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): recyViewHolder {
        return recyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_list,parent,false))
    }

    override fun getItemCount(): Int = data.count()

    override fun onBindViewHolder(holder: recyViewHolder, position: Int) {
        holder.btn.text = data[position].name
        holder.btn.setOnClickListener {
            when (position){
                0 -> {holder.context.startActivity(Intent(holder.context,TestEditText::class.java))}
                1 -> {holder.context.startActivity(Intent(holder.context,testRadioButton::class.java))}
                2 -> {holder.context.startActivity(Intent(holder.context,testCheckBox::class.java))}
                3 -> {holder.context.startActivity(Intent(holder.context,TestSwitch::class.java))}
                4 -> {holder.context.startActivity(Intent(holder.context,TestToggleButton::class.java))}
                5 -> {holder.context.startActivity(Intent(holder.context,TestChronometer::class.java))}
                6 -> {holder.context.startActivity(Intent(holder.context,TestCountDownTimer::class.java))}
                else -> {Toast.makeText(holder.context,"",Toast.LENGTH_SHORT).show()}
            }
        }
    }

}