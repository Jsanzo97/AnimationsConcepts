package com.example.animationsgroup.module4

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsgroup.databinding.ViewAnimatorAnimationsActivityBinding

class ViewAnimatorAnimationsActivity : AppCompatActivity() {

    private lateinit var binding: ViewAnimatorAnimationsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ViewAnimatorAnimationsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            button.setOnClickListener {
                it.animate()
                    .translationY(200f)
                    .scaleX(2f)
                    .alpha(0.5f)
                    .rotation(360f)
                    .setDuration(1000)
                    .withEndAction {
                        Toast.makeText(this@ViewAnimatorAnimationsActivity, "Animation end", Toast.LENGTH_LONG).show()
                    }
            }
        }
    }
}