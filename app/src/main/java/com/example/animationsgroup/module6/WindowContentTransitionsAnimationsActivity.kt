package com.example.animationsgroup.module6

import android.content.Intent
import android.os.Bundle
import android.transition.Explode
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import com.example.animationsgroup.databinding.WindowContentTransitionsAnimationsActivityBinding

class WindowContentTransitionsAnimationsActivity: AppCompatActivity() {

    private lateinit var binding: WindowContentTransitionsAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = WindowContentTransitionsAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {

            /*
            val explode = Explode()
            window.exitTransition = explode
            window.reenterTransition = explode

             */


            button.setOnClickListener {
                val intent = Intent(
                    this@WindowContentTransitionsAnimationsActivity,
                    WindowContentSecondTransitionsAnimationsActivity::class.java
                )

                val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                    this@WindowContentTransitionsAnimationsActivity
                )


                startActivity(intent, options.toBundle())
            }
        }
    }
}