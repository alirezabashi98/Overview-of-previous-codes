package com.example.myapplication.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.myapplication.DataClass.DataClass_ListView
import com.example.myapplication.R
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.activity_test_custom_list_view.view.*
import java.text.FieldPosition

class adapter_listview(val data: List<DataClass_ListView>) : BaseAdapter() {
    override fun getView(position : Int, convertView: View?, parent : ViewGroup?): View {
        val view : View
        val holder : CustomViewHolder

        if (convertView == null){

            view = LayoutInflater.from(parent!!.context).inflate(R.layout.custom_listview,null)
            holder = CustomViewHolder()
            holder.img = view.findViewById(R.id.custom_profile_image)
            holder.name = view.findViewById(R.id.tv_custom_textview_titile)
            holder.message = view.findViewById(R.id.tv_custom_textview_message)
            view.tag = holder
        }else{

            holder = convertView.tag as CustomViewHolder
            view = convertView

        }

        holder.img.setImageResource(getItem(position).img)
        holder.name.text = getItem(position).name
        holder.message.text = getItem(position).message

        return view
    }

    override fun getItem(p0: Int): DataClass_ListView = data[p0]

    override fun getItemId(p0: Int): Long = 0

    override fun getCount(): Int = data.count()

    class CustomViewHolder {

        lateinit var img: CircleImageView
        lateinit var name: TextView
        lateinit var message: TextView

    }
}