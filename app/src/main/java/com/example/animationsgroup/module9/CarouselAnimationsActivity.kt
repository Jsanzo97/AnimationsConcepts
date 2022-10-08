package com.example.animationsgroup.module9

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.PagerSnapHelper
import com.example.animationsgroup.adapter.CarouselAdapter
import com.example.animationsgroup.databinding.CarouselAnimationsActivityBinding
import com.jackandphantom.carouselrecyclerview.CarouselLayoutManager

class CarouselAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: CarouselAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = CarouselAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            recyclerView.adapter = CarouselAdapter()
            recyclerView.apply {
                set3DItem(false)
                setAlpha(true)
                setInfinite(true)
            }
        }
    }

}