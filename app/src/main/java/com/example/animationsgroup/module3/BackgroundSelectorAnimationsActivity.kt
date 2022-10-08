package com.example.animationsgroup.module3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.animationsgroup.adapter.TextAdapter
import com.example.animationsgroup.databinding.BackgroundSelectorAnimationsActivityBinding

class BackgroundSelectorAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: BackgroundSelectorAnimationsActivityBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = BackgroundSelectorAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            recycler.layoutManager = GridLayoutManager(this@BackgroundSelectorAnimationsActivity, 3);
            recycler.adapter = TextAdapter(this@BackgroundSelectorAnimationsActivity);
        }
    }
}