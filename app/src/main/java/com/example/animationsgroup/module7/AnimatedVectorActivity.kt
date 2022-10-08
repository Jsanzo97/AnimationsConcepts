package com.example.animationsgroup.module7

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsgroup.databinding.AnimatedVectorActivityBinding

class AnimatedVectorActivity: AppCompatActivity() {

    private lateinit var binding: AnimatedVectorActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = AnimatedVectorActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            button.setOnClickListener {
                val avdAnimation = colorsImg.drawable as AnimatedVectorDrawable
                avdAnimation.start()
            }
        }
    }
}