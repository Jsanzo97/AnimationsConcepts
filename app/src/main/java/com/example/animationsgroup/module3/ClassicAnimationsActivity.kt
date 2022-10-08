package com.example.animationsgroup.module3

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.RotateAnimation
import android.view.animation.ScaleAnimation
import android.view.animation.TranslateAnimation
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsgroup.databinding.ClassicAnimationsActivityBinding

class ClassicAnimationsActivity : AppCompatActivity() {



    private lateinit var binding: ClassicAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ClassicAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rotateAnimation = RotateAnimation(
            0f,
            360f,
            Animation.RELATIVE_TO_SELF,
            0.5f,
            Animation.RELATIVE_TO_SELF,
            0.5f)
        val scaleAnimation = ScaleAnimation(
            1f,
            3f,
            1f,
            3f)

        val translateAnimation =  TranslateAnimation(
            0f,
            200f,
            0f,
            200f
        )

        val animationSet = AnimationSet(this, null)
        animationSet.addAnimation(rotateAnimation)
        animationSet.addAnimation(scaleAnimation)
        animationSet.addAnimation(translateAnimation)
        animationSet.duration = 3000

        with(binding) {
            button.setOnClickListener {
                it.startAnimation(animationSet)
            }
        }
    }
}