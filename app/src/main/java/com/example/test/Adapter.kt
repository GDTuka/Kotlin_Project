package com.example.test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(var listener : AdapterCallBack) : RecyclerView.Adapter<Adapter.AdapterItem>(){

    var items:List<Data> = listOf()
    set(value){
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterItem {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return AdapterItem(view)
    }

    override fun onBindViewHolder(holder: AdapterItem, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class AdapterItem(itemView: View) : RecyclerView.ViewHolder(itemView){
        var filmName = itemView.findViewById<TextView>(R.id.filmName)
        var idet = false
        var btn1 = itemView.findViewById<Button>(R.id.btn1)
        fun bind(data: Data){
            filmName.text = data.name
            btn1.setOnClickListener{
                listener.onClick(data)
            }
        }

    }

}