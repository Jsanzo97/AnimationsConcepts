package com.example.animationsgroup.module3

import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsgroup.R
import com.example.animationsgroup.databinding.ResourceAnimationsActivityBinding

class ResourceAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: ResourceAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ResourceAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animation1 = AnimationUtils.loadAnimation(this, R.anim.animate_one)
        val animation2 = AnimationUtils.loadAnimation(this, R.anim.animate_two)

        animation1.setAnimationListener(object: AnimationListener{
            override fun onAnimationStart(p0: Animation?) {

            }

            override fun onAnimationEnd(p0: Animation?) {
                binding.button.visibility = View.INVISIBLE
            }

            override fun onAnimationRepeat(p0: Animation?) {

            }

        })

        with(binding) {
            button.setOnClickListener {
                it.startAnimation(animation1)
                img.startAnimation(animation2)
            }
        }
    }
}