package com.example.animationsgroup.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.animationsgroup.databinding.CarouselItemBinding
import com.example.animationsgroup.utils.CarouselData
import com.example.animationsgroup.utils.Value

class CarouselAdapter: RecyclerView.Adapter<CarouselAdapter.ViewHolder>() {

    private lateinit var binding: CarouselItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = CarouselItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(CarouselData.data[position])
    }

    override fun getItemCount(): Int {
        return CarouselData.data.size
    }

    class ViewHolder(private val binding: CarouselItemBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Value) = with(binding) {
            title.text = data.title
            image.setImageResource(data.image)
        }
    }

}