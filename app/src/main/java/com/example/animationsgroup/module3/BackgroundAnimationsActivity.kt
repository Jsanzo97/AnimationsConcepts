package com.example.animationsgroup.module3

import android.animation.Animator
import android.animation.Animator.AnimatorListener
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsgroup.R
import com.example.animationsgroup.databinding.BackgroundAnimationsActivityBinding
import com.example.animationsgroup.utils.getLastVisibleFrame
import com.example.animationsgroup.utils.setFrame

class BackgroundAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: BackgroundAnimationsActivityBinding

    private var animationRunning = false

    private var directionX = 0
    private var directionY = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = BackgroundAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


        with(binding) {
            val animationDrawable = animationView.background as AnimationDrawable
            var lastFrame = 0

            buttonStart.setOnClickListener {
                if (animationRunning) {
                    animationDrawable.stop()
                    lastFrame = animationDrawable.getLastVisibleFrame()
                    buttonStart.text = getString(R.string.stop)
                } else {
                    if (lastFrame > 0) {
                        animationDrawable.setFrame(lastFrame)
                    }
                    animationDrawable.start()
                    //moveBarbarian()
                    buttonStart.text = getString(R.string.start)
                }
                animationRunning = !animationRunning
            }

            setupDirectionButtons()
        }
    }

    private fun setupDirectionButtons() =
        with(binding) {
            buttonUp.setOnClickListener {
                directionX = 0
                directionY = -20
            }

            buttonDown.setOnClickListener {
                directionX = 0
                directionY = 20
            }

            buttonLeft.setOnClickListener {
                directionX = -20
                directionY = 0
            }

            buttonRight.setOnClickListener {
                directionX = 20
                directionY = 0
            }
        }


    private fun moveBarbarian() {
        with(binding) {
            animationView.animate()
                .translationX(animationView.x + directionX)
                .translationY(animationView.y + directionY)
                .setListener(object : AnimatorListener {
                    override fun onAnimationStart(p0: Animator?) {}

                    override fun onAnimationEnd(p0: Animator?) {
                        if (animationRunning) {
                            moveBarbarian()
                        }
                    }

                    override fun onAnimationCancel(p0: Animator?) {}

                    override fun onAnimationRepeat(p0: Animator?) {}

                })
                .setDuration(200)
                .start()
        }
    }
}

