package com.example.animationsgroup.module6

import android.graphics.Rect
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.transition.ChangeBounds
import androidx.transition.ChangeClipBounds
import androidx.transition.ChangeImageTransform
import androidx.transition.ChangeTransform
import androidx.transition.TransitionManager
import androidx.transition.TransitionSet
import com.example.animationsgroup.databinding.TransformAnimationsActivityBinding

class TransformAnimationsActivity: AppCompatActivity() {

    private lateinit var binding: TransformAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TransformAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val transitionSet = TransitionSet()
        transitionSet.addTransition(ChangeTransform())
        transitionSet.addTransition(ChangeImageTransform())
        transitionSet.addTransition(ChangeClipBounds())


        with(binding) {
            button.setOnClickListener {
                TransitionManager.beginDelayedTransition(root, transitionSet)
                img.scaleX = 2f
                img.scaleY = 2f
                img.rotation = 90f
                img.scaleType = ImageView.ScaleType.CENTER
                img.clipBounds = Rect(10, 20, 500, 400)


            }
        }
    }
}