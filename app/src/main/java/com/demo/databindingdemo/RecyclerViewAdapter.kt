package com.demo.databindingdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.demo.databindingdemo.databinding.RecyclerviewRowBinding

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {
    private var items = ArrayList<RecyclerData>()

    fun setDataList(data :  ArrayList<RecyclerData>) {
        this.items = data

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RecyclerviewRowBinding.inflate(layoutInflater)
        return MyViewHolder(binding)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items[position])
    }

    class MyViewHolder(private val binding: RecyclerviewRowBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(data: RecyclerData) {
            binding.recyclerData = data
            binding.executePendingBindings()
        }
    }

//    companion object {
//        @JvmStatic
//        @BindingAdapter("loadImage")
//        fun loadImage(thubmImage: ImageView, url: String) {
//            Glide.with(thubmImage)
//                .load(url)
//                .circleCrop()
//                .into(thubmImage)
//        }
//
//    }


}