package com.example.mvpwithadapter.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvpwithadapter.R
import com.example.mvpwithadapter.model.NumberGenerator
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.cardview.view.*

class Adapter(private val numgen:ArrayList<Int>, private val listener:OnNumberClickListener):RecyclerView.Adapter<ModelViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
        return ModelViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.cardview,parent,false))
    }

    override fun getItemCount(): Int {
        return numgen.size
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
        holder.tvNumber.text = numgen[position].toString()
        holder.bind(numgen[position],listener)
    }
}

class ModelViewHolder(view:View):RecyclerView.ViewHolder(view){
    val tvNumber = view.tv_number
    fun bind(number: Int,listener: OnNumberClickListener){
        itemView.setOnClickListener{
            listener.onNumberClick(number)
        }
    }
}

interface OnNumberClickListener{
    fun onNumberClick(number: Int)
}


