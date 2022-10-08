package com.example.animationsgroup.module9

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsgroup.R
import com.example.animationsgroup.databinding.QuestionGameAnimationsActivityBinding

class QuestionGameAnimationsActivity: AppCompatActivity() {

    private lateinit var binding: QuestionGameAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = QuestionGameAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            yesButton.setOnClickListener {
                lottieAnimationView.setAnimation(R.raw.success)
                lottieAnimationView.playAnimation()
            }

            noButton.setOnClickListener {
                lottieAnimationView.setAnimation(R.raw.failure)
                lottieAnimationView.playAnimation()
            }
        }
    }

}