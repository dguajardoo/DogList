package com.example.doglist

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.doglist.databinding.ItemDogBinding

class DogAdapter(private val images: List<String>): RecyclerView.Adapter<DogViewHolder>() {

    private lateinit var binding: ItemDogBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        binding = ItemDogBinding.inflate(layoutInflater, parent, false)
        return DogViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val item = images[position]
        Log.v("DOGADAPTER", item)
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return images.size
    }


}