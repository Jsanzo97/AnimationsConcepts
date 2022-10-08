package com.example.animationsgroup.module2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.transition.Fade
import androidx.transition.TransitionManager
import com.example.animationsgroup.databinding.GroupAnimationsActivityBinding

class GroupAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: GroupAnimationsActivityBinding
    private val fade = Fade()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = GroupAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            fade.duration = 1000

            start.setOnClickListener {
                TransitionManager.beginDelayedTransition(rootLayout, fade)

                start.visibility = View.GONE
                group.visibility = View.VISIBLE
            }

            login.setOnClickListener {
                TransitionManager.beginDelayedTransition(rootLayout, fade)

                start.visibility = View.VISIBLE
                group.visibility = View.GONE
            }
        }
    }
}