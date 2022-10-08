package com.example.animationsgroup.module2

import android.os.Bundle
import android.view.View
import android.view.animation.BounceInterpolator
import androidx.appcompat.app.AppCompatActivity
import androidx.transition.ChangeBounds
import androidx.transition.TransitionManager
import com.example.animationsgroup.databinding.PlaceholderAnimationsActivityBinding

class PlaceHolderAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: PlaceholderAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = PlaceholderAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            img1.setOnClickListener { onViewClickListener(it) }
            img2.setOnClickListener { onViewClickListener(it) }
            img3.setOnClickListener { onViewClickListener(it) }
            text.setOnClickListener { onViewClickListener(it) }
        }
    }

    private fun onViewClickListener(v: View) {
        val transition = ChangeBounds()
        transition.apply {
            interpolator = BounceInterpolator()
            duration = 2000
        }
        TransitionManager.beginDelayedTransition(binding.rootLayout, transition)
        binding.placeholder.setContentId(v.id)
    }
}