package com.guyi.class25b_and_6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.guyi.class25b_and_6.databinding.ItemPropertyBinding

class PropertyAdapter(
    private val items: List<Property>
) : RecyclerView.Adapter<PropertyAdapter.PropertyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PropertyViewHolder {
        val binding = ItemPropertyBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return PropertyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PropertyViewHolder, position: Int) {
        val item = items[position]
        with(holder.binding) {
            lblName.text = "$position ${item.name}"
            lblLocation.text = item.address
            lblPrice.text = "$${item.price?.toHumanReadable()}"
            Imager.me().imageByDrawableNameCenterCrop(imgMain, item.image)
            lblNew.visibility = if (item.isNew) View.VISIBLE else View.GONE
        }
    }

    override fun getItemCount(): Int = items.size

    inner class PropertyViewHolder(
        val binding: ItemPropertyBinding
    ) : RecyclerView.ViewHolder(binding.root)
}
