package com.example.doglist

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.doglist.databinding.ItemDogBinding
import com.squareup.picasso.Picasso

class DogViewHolder(val binding: ItemDogBinding) : RecyclerView.ViewHolder(binding.root) {

    //private val binding = ItemDogBinding.bind(view)

    fun bind(image: String) {


        Picasso.get().load(image).into(binding.ivDog)
        binding.tvURL.text = image
        binding.tvURL.visibility = View.GONE
        //Picasso.get().load("https://i.imgur.com/DvpvklR.png").into(binding.ivDog)
    }
}