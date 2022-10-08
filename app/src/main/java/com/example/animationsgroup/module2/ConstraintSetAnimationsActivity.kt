package com.example.animationsgroup.module2

import android.os.Bundle
import android.view.animation.OvershootInterpolator
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.ChangeBounds
import androidx.transition.TransitionManager
import com.example.animationsgroup.R
import com.example.animationsgroup.databinding.ConstraintSetAnimationsActivityBinding

class ConstraintSetAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: ConstraintSetAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ConstraintSetAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val transition = ChangeBounds()
        transition.apply {
            interpolator = OvershootInterpolator()
            duration = 2000
        }

        with(binding) {
            start.setOnClickListener {
                val set = ConstraintSet()
                set.clone(this@ConstraintSetAnimationsActivity,
                    R.layout.constraint_set_second_keyframe
                )
                set.applyTo(rootLayout)

                TransitionManager.beginDelayedTransition(rootLayout, transition)
            }

            login.setOnClickListener {
                val set = ConstraintSet()
                set.clone(this@ConstraintSetAnimationsActivity,
                    R.layout.constraint_set_animations_activity
                )
                set.applyTo(rootLayout)

                TransitionManager.beginDelayedTransition(rootLayout, transition)
            }
        }
    }
}