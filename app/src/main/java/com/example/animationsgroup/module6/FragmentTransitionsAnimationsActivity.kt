package com.example.animationsgroup.module6

import android.os.Bundle
import android.transition.Slide
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsgroup.R
import com.example.animationsgroup.databinding.FragmentTransitionsAnimationsActivityBinding

class FragmentTransitionsAnimationsActivity: AppCompatActivity() {

    private lateinit var binding: FragmentTransitionsAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentTransitionsAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            button.setOnClickListener {
                val fragmentOne = FragmentOne()
                fragmentOne.enterTransition = Slide(Gravity.START)
                fragmentOne.returnTransition = Slide(Gravity.END)

                val transaction = supportFragmentManager.beginTransaction()
                transaction.add(R.id.fragment_container, fragmentOne)
                transaction.addToBackStack(null)
                transaction.commit()
            }

        }
    }
}