package com.example.animationsgroup.module5

import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.transition.*
import androidx.transition.Transition.TransitionListener
import com.example.animationsgroup.R
import com.example.animationsgroup.databinding.SimpleTransitionsAnimationsActivityBinding

class SimpleTransitionsAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: SimpleTransitionsAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SimpleTransitionsAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            button.setOnClickListener {
                val fade = Fade()
                val changeBounds = ChangeBounds()
                val set = TransitionSet()

                set
                    .addTransition(fade)
                    .addTransition(changeBounds)
                    .addListener(object: TransitionListener{
                        override fun onTransitionStart(transition: Transition) {}
                        override fun onTransitionEnd(transition: Transition) {}
                        override fun onTransitionCancel(transition: Transition) {}
                        override fun onTransitionPause(transition: Transition) {}
                        override fun onTransitionResume(transition: Transition) {}

                    })
                    .duration = 1000

                val root = findViewById<ViewGroup>(android.R.id.content)
                val scene2 = Scene.getSceneForLayout(root,
                    R.layout.simple_second_transitions_animations_activity, this@SimpleTransitionsAnimationsActivity)
                TransitionManager.go(scene2, set)
            }
        }
    }
}