package com.example.animationsgroup.module8

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.GestureDetector
import androidx.appcompat.app.AppCompatActivity
import com.example.animationsgroup.databinding.FlingAnimationActivityBinding
import com.example.animationsgroup.utils.CustomFlingGestureListener

class FlingAnimationActivity: AppCompatActivity() {

    private var velocity = 500f

    private lateinit var binding: FlingAnimationActivityBinding

    private lateinit var gestureDetector1: GestureDetector
    private lateinit var gestureDetector2: GestureDetector
    private lateinit var gestureDetector3: GestureDetector


    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FlingAnimationActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            playground.viewTreeObserver.addOnGlobalLayoutListener {
                if (playground.height > 0) {
                    val max = playground.height.toFloat() - img1.height.toFloat()
                    gestureDetector1 = GestureDetector(
                        this@FlingAnimationActivity,
                        CustomFlingGestureListener(
                            img1,
                            0f,
                            max
                        )
                    )

                    gestureDetector2 = GestureDetector(
                        this@FlingAnimationActivity,
                        CustomFlingGestureListener(
                            img2,
                            0f,
                            max
                        )
                    )

                    gestureDetector3 = GestureDetector(
                        this@FlingAnimationActivity,
                        CustomFlingGestureListener(
                            img3,
                            0f,
                            max
                        )
                    )
                    playground.viewTreeObserver.removeOnGlobalLayoutListener{}
                }
            }

            img1.setOnTouchListener { _, motionEvent ->
                gestureDetector1.onTouchEvent(motionEvent)
            }

            img2.setOnTouchListener { _, motionEvent ->
                gestureDetector2.onTouchEvent(motionEvent)
            }

            img3.setOnTouchListener { _, motionEvent ->
                gestureDetector3.onTouchEvent(motionEvent)
            }
        }
    }

}