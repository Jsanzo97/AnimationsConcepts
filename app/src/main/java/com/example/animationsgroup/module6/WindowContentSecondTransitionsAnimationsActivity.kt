package com.example.animationsgroup.module6

import android.os.Bundle
import android.transition.Slide
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsgroup.databinding.WindowContentSecondTransitionsAnimationsActivityBinding

class WindowContentSecondTransitionsAnimationsActivity: AppCompatActivity() {

    private lateinit var binding: WindowContentSecondTransitionsAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = WindowContentSecondTransitionsAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*
        val slide = Slide()
        window.enterTransition = slide
        window.returnTransition = slide

         */

    }

}