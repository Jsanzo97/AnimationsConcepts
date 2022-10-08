package com.example.animationsgroup.module6

import android.os.Bundle
import android.view.Gravity
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.transition.Explode
import androidx.transition.Slide
import androidx.transition.TransitionManager
import com.example.animationsgroup.databinding.SlideExplodeAnimationsActivityBinding

class SlideExplodeAnimationsActivity: AppCompatActivity() {

    private lateinit var binding: SlideExplodeAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SlideExplodeAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            explode.setOnClickListener {
                TransitionManager.beginDelayedTransition(root, Explode())
                img.visibility = if (img.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
            }

            slide.setOnClickListener {
                val slide = Slide()
                slide.slideEdge = Gravity.TOP
                TransitionManager.beginDelayedTransition(root, slide)
                img.visibility = if (img.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
            }
        }
    }
}