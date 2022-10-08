package com.example.animationsgroup.module6

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import com.example.animationsgroup.databinding.SharedElementsAnimationsActivityBinding

class SharedElementsAnimationsActivity: AppCompatActivity() {

    private lateinit var binding: SharedElementsAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SharedElementsAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            button.setOnClickListener {
                val intent = Intent(
                    this@SharedElementsAnimationsActivity,
                    SharedElementsSecondAnimationsActivity::class.java
                )

                val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                    this@SharedElementsAnimationsActivity,
                    Pair(img, "transition_img"),
                    Pair(img, "transition_img"),
                    Pair(img, "transition_img")
                )

                startActivity(intent, options.toBundle())
            }
        }


    }

}