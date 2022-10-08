package com.example.animationsgroup.module3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsgroup.R
import com.example.animationsgroup.databinding.ActivityOneAnimationsActivityBinding

class ActivityOneAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOneAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOneAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            button.setOnClickListener {
                startActivity(
                    Intent(
                        this@ActivityOneAnimationsActivity,
                        ActivityTwoAnimationsActivity::class.java)
                )

                overridePendingTransition(R.anim.slide_right_in, R.anim.slide_left_out)

            }
        }

    }
}