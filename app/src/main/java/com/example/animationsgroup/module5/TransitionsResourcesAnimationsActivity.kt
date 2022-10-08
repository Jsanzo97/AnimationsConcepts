package com.example.animationsgroup.module5

import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.transition.*
import androidx.transition.Transition.TransitionListener
import com.example.animationsgroup.R
import com.example.animationsgroup.databinding.SimpleTransitionsAnimationsActivityBinding
import com.example.animationsgroup.databinding.TransitionsResourcesAnimationsActivityBinding

class TransitionsResourcesAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: TransitionsResourcesAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = TransitionsResourcesAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            val mainScene = Scene.getSceneForLayout(
                root,
                R.layout.transitions_resources_animations_activity,
                this@TransitionsResourcesAnimationsActivity
            )

            val secondScene = Scene.getSceneForLayout(
                root,
                R.layout.transitions_second_resources_animations_activity,
                this@TransitionsResourcesAnimationsActivity
            )

            val thirdScene = Scene.getSceneForLayout(
                root,
                R.layout.transitions_third_resources_animations_activity,
                this@TransitionsResourcesAnimationsActivity
            )

            val transitionManager = TransitionInflater.from(this@TransitionsResourcesAnimationsActivity)
                .inflateTransitionManager(R.transition.transition_manager, root) as TransitionManager

            button.setOnClickListener {
                transitionManager.transitionTo(secondScene)
            }

            button2.setOnClickListener {
                transitionManager.transitionTo(thirdScene)
            }
        }
    }
}