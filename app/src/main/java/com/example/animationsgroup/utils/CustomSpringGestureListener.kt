package com.example.animationsgroup.utils

import android.view.GestureDetector.SimpleOnGestureListener
import android.view.MotionEvent
import android.view.View
import androidx.dynamicanimation.animation.DynamicAnimation
import androidx.dynamicanimation.animation.SpringAnimation
import androidx.dynamicanimation.animation.SpringForce
import com.google.android.material.snackbar.Snackbar

class CustomSpringGestureListener(
    private val view: View
): SimpleOnGestureListener() {

    override fun onDown(e: MotionEvent?): Boolean {
        return true
    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent?,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        val springForce = SpringForce()
        springForce.dampingRatio = SpringForce.DAMPING_RATIO_HIGH_BOUNCY
        springForce.stiffness = SpringForce.STIFFNESS_VERY_LOW

        val springAnimation = SpringAnimation(view, DynamicAnimation.Y)
        if (velocityY > 0) {
            springAnimation.animateToFinalPosition(700f)
        } else {
            springAnimation.animateToFinalPosition(0f)
        }
        springAnimation.addEndListener { animation, canceled, value, velocity ->
            Snackbar.make(view, "Welcome", Snackbar.LENGTH_LONG).show()
        }
        return super.onFling(e1, e2, velocityX, velocityY)
    }

}