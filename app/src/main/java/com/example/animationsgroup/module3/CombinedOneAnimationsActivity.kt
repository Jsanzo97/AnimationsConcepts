package com.example.animationsgroup.module3

import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsgroup.R
import com.example.animationsgroup.databinding.CombinedOneAnimationsActivityBinding

class CombinedOneAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: CombinedOneAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = CombinedOneAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            button.setOnClickListener {
                val animation = AnimationUtils.loadAnimation(this@CombinedOneAnimationsActivity,
                    R.anim.animate_view
                )

                animation.setAnimationListener(object : AnimationListener {
                    override fun onAnimationStart(p0: Animation?) {}

                    override fun onAnimationEnd(p0: Animation?) {
                        startActivity(
                            Intent(
                                this@CombinedOneAnimationsActivity,
                                CombinedTwoAnimationsActivity::class.java
                            )
                        )
                        overridePendingTransition(R.anim.combined_enter, R.anim.combined_exit)
                    }

                    override fun onAnimationRepeat(p0: Animation?) {}
                })

                it.startAnimation(animation)
            }
        }


    }
}