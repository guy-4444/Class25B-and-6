package com.guyi.class25b_and_6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//private val onItemClick: (String) -> Unit
class GenericAdapter(
    private val items: List<String>,
) : RecyclerView.Adapter<GenericAdapter.GenericViewHolder>() {

    inner class GenericViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val tvItem: TextView = itemView.findViewById(R.id.tvItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenericViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_property, parent, false)
        return GenericViewHolder(view)
    }

    override fun onBindViewHolder(holder: GenericViewHolder, position: Int) {
        val item = items[position]
        //holder.tvItem.text = item
//        holder.itemView.setOnClickListener { onItemClick(item) }
    }

    override fun getItemCount(): Int = items.size
}
