package com.example.myapplication.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.DataClass.recyDataClass
import com.example.myapplication.R

class adapter_list_code(private val data :List<recyDataClass>):RecyclerView.Adapter<adapter_list_code.recyViewHolder>(){

    inner class recyViewHolder(view:View):RecyclerView.ViewHolder(view){
        val btn = view.findViewById<Button>(R.id.btn_custom_list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): recyViewHolder {
        return recyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_list,parent,false))
    }

    override fun getItemCount(): Int = data.count()

    override fun onBindViewHolder(holder: recyViewHolder, position: Int) {
        holder.btn.text = data[position].name
        holder.btn.setOnClickListener {
            when (position){
                0 -> {}
                1 -> {}
                2 -> {}
                3 -> {}
                4 -> {}
            }
        }
    }

}