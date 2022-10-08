package com.example.animationsgroup.module4

import android.animation.Animator
import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsgroup.R
import com.example.animationsgroup.databinding.ResourcesAnimatorAnimationsActivityBinding

class ResourcesAnimatorAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: ResourcesAnimatorAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ResourcesAnimatorAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animatorSet = AnimatorInflater.loadAnimator(
            this@ResourcesAnimatorAnimationsActivity,
            R.animator.animator
        ) as AnimatorSet

        animatorSet.apply {
            duration = 2000
            setTarget(binding.img)
        }

        animatorSet.addListener(object: Animator.AnimatorListener{
            override fun onAnimationCancel(p0: Animator?) {}
            override fun onAnimationEnd(p0: Animator?) {
                Toast.makeText(
                    this@ResourcesAnimatorAnimationsActivity,
                    "Animation end",
                    Toast.LENGTH_LONG
                ).show()
            }

            override fun onAnimationStart(p0: Animator?) {}
            override fun onAnimationRepeat(p0: Animator?) {}
        })

        with(binding) {
            img.setOnClickListener {
                animatorSet.start()
            }
        }
    }
}