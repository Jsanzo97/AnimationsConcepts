package com.example.animationsgroup.module10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsgroup.databinding.MotionLayoutAnimationsActivityBinding

class MotionLayoutAnimationsActivity: AppCompatActivity() {

    private lateinit var binding: MotionLayoutAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = MotionLayoutAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {

        }
    }
}