package com.example.animationsgroup.module3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsgroup.databinding.CombinedTwoAnimationsActivityBinding

class CombinedTwoAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: CombinedTwoAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = CombinedTwoAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}