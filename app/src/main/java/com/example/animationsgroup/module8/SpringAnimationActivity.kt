package com.example.animationsgroup.module8

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.GestureDetector
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsgroup.databinding.SpringAnimationActivityBinding
import com.example.animationsgroup.utils.CustomSpringGestureListener

class SpringAnimationActivity: AppCompatActivity() {

    private lateinit var binding: SpringAnimationActivityBinding


    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SpringAnimationActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            val gestureDetector = GestureDetector(
                this@SpringAnimationActivity,
                CustomSpringGestureListener(
                    img
                )
            )

            img.setOnTouchListener { _, motionEvent ->
                gestureDetector.onTouchEvent(motionEvent)
            }

        }
    }
}