package com.example.animationsgroup.module9

import android.animation.Animator
import android.animation.Animator.AnimatorListener
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsgroup.databinding.ProgressLottieAnimationsActivityBinding

class ProgressLottieAnimationsActivity: AppCompatActivity() {

    private lateinit var binding: ProgressLottieAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ProgressLottieAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            button.setOnClickListener {
                lottieAnimationView.visibility = View.VISIBLE
                lottieAnimationView.addAnimatorListener(object : AnimatorListener{
                    override fun onAnimationCancel(p0: Animator?) {}
                    override fun onAnimationEnd(p0: Animator?) {
                        lottieAnimationView.visibility = View.GONE
                    }
                    override fun onAnimationRepeat(p0: Animator?) {}
                    override fun onAnimationStart(p0: Animator?) {}
                })
                lottieAnimationView.playAnimation()
            }
        }

    }

}