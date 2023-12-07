package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val item : ArrayList<Item>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.adapter_main,
            parent,false)
        return MyViewHolder(itemView)

    }

    override fun getItemCount(): Int {


        return item.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentitem = item[position]
        holder.title_image.setImageResource(currentitem.title_image)
        holder.tvheading.text = currentitem.heading

    }
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){


        val title_image : ShapeableImageView = itemView.findViewById(R.id.title_image)
        val tvheading : TextView = itemView.findViewById(R.id.tvheading)
    }
}