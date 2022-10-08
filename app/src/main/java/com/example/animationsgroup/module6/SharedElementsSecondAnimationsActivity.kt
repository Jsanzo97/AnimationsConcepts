package com.example.animationsgroup.module6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsgroup.databinding.SharedElementsSecondAnimationsActivityBinding

class SharedElementsSecondAnimationsActivity: AppCompatActivity() {

    private lateinit var binding: SharedElementsSecondAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SharedElementsSecondAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}