package com.example.animationsgroup.module8

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.dynamicanimation.animation.DynamicAnimation
import androidx.dynamicanimation.animation.FlingAnimation
import com.example.animationsgroup.databinding.GravityAnimationActivityBinding

class GravityAnimationActivity: AppCompatActivity() {

    private lateinit var binding: GravityAnimationActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = GravityAnimationActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            playground.setOnClickListener {
                riseAnimation()
            }
        }
    }

    private fun riseAnimation() {
        val flingAnimation = FlingAnimation(binding.img1, DynamicAnimation.Y)
        flingAnimation.setMinValue(0f)
        flingAnimation.friction = 3f
        flingAnimation.setMaxValue(binding.playground.height.toFloat() - binding.img1.height.toFloat())
        flingAnimation.setStartVelocity(-4000f)
        flingAnimation.addEndListener { animation, canceled, value, velocity ->
            fallAnimation()
        }
        flingAnimation.start()
    }

    private fun fallAnimation() {
        val flingAnimation = FlingAnimation(binding.img1, DynamicAnimation.Y)
        flingAnimation.setMinValue(0f)
        flingAnimation.friction = 3f
        flingAnimation.setMaxValue(binding.playground.height.toFloat() - binding.img1.height.toFloat())
        flingAnimation.setStartVelocity(4000f)
        flingAnimation.start()
    }

}