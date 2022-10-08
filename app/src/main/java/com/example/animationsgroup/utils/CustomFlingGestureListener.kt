package com.example.animationsgroup.utils

import android.view.GestureDetector.SimpleOnGestureListener
import android.view.MotionEvent
import android.view.View
import androidx.dynamicanimation.animation.DynamicAnimation
import androidx.dynamicanimation.animation.FlingAnimation
import kotlin.math.abs

class CustomFlingGestureListener(
    private val view: View,
    private val min: Float,
    private val max: Float
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
        val fling: FlingAnimation
        if (abs(velocityX) > abs(velocityY)) {
            fling = FlingAnimation(view, DynamicAnimation.X)
            fling.setStartVelocity(velocityX)
            fling.setMaxValue(max)
        } else {
            fling = FlingAnimation(view, DynamicAnimation.Y)
            fling.setStartVelocity(velocityY)
            fling.setMaxValue(max)
        }
        fling.setMinValue(min)

        fling.start()
        return super.onFling(e1, e2, velocityX, velocityY)
    }

}