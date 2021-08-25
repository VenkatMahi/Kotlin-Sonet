package com.example.ngit

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class addS(private val pos:Array<String>): RecyclerView.Adapter<addS.ViewHolder>() {
    var arr:Array<String>
    init {
        arr = pos
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.display,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = arr[position]
    }

    override fun getItemCount(): Int = arr.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView
        var button: Button

        init {
            name = itemView.findViewById(R.id.sub)
            button = itemView.findViewById(R.id.join)
            button.setOnClickListener {

            }


        }
    }


}