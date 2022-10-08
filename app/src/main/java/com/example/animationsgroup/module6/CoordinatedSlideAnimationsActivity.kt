package com.example.animationsgroup.module6

import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.children
import androidx.transition.Explode
import androidx.transition.Slide
import androidx.transition.TransitionManager
import com.example.animationsgroup.R
import com.example.animationsgroup.databinding.CoordinatedSlideAnimationsActivityBinding
import com.example.animationsgroup.databinding.SlideExplodeAnimationsActivityBinding

class CoordinatedSlideAnimationsActivity: AppCompatActivity() {

    private lateinit var binding: CoordinatedSlideAnimationsActivityBinding

    private val transitionDuration = 200L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = CoordinatedSlideAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        binding.linearLayout.children.forEachIndexed { index, view ->
            view.postDelayed({
                TransitionManager.beginDelayedTransition(binding.linearLayout, Slide(Gravity.END))
                view.visibility = if (view.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
            }, transitionDuration * index.toLong())
        }
        return super.onOptionsItemSelected(item)
    }


}