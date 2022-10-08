package com.example.animationsgroup.module3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsgroup.R
import com.example.animationsgroup.databinding.ActivityTwoAnimationsActivityBinding

class ActivityTwoAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTwoAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTwoAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_left_in, R.anim.slide_right_out)
    }
}