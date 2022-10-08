package com.example.animationsgroup.utils

import android.graphics.drawable.AnimationDrawable

fun AnimationDrawable.getLastVisibleFrame(): Int {
    for (index in 0 until numberOfFrames) {
        if (current == getFrame(index)) {
            return index
        }
    }
    return 0
}

fun AnimationDrawable.setFrame(frame: Int) {
    for (index in 0 until frame) {
        run()
    }
}