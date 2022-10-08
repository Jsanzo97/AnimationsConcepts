package com.example.animationsgroup.module4

import android.animation.AnimatorSet
import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsgroup.databinding.ObjectAnimatorAnimationsActivityBinding

class ObjectAnimatorAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: ObjectAnimatorAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ObjectAnimatorAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val translateAnimation = ObjectAnimator.ofFloat(binding.button, "translationY", 300f)
        translateAnimation.apply {
            //repeatCount = ObjectAnimator.INFINITE
            repeatMode = ObjectAnimator.REVERSE
        }

        val scaleXAnimation = ObjectAnimator.ofFloat(binding.button, "scaleX", 3f)
        scaleXAnimation.apply {
            repeatCount = ObjectAnimator.INFINITE
            repeatMode = ObjectAnimator.REVERSE
        }

        val colorAnimation = ObjectAnimator.ofObject(binding.button, "textColor", ArgbEvaluator(),
            Color.RED, Color.GREEN)
        colorAnimation.apply {
            repeatCount = ObjectAnimator.INFINITE
            repeatMode = ObjectAnimator.REVERSE
        }

        val animatorSet = AnimatorSet()
        animatorSet.playTogether(translateAnimation, scaleXAnimation, colorAnimation)
        animatorSet.duration = 1000

        with(binding) {
            button.setOnClickListener {
                if (animatorSet.isRunning && !animatorSet.isPaused) {
                    animatorSet.pause()
                } else if (animatorSet.isRunning && animatorSet.isPaused) {
                    animatorSet.resume()
                } else {
                    animatorSet.start()

                }
            }
        }
    }
}