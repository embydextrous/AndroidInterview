package com.github.embydextrous.androidinterview

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet

class JankButton @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) : androidx.appcompat.widget.AppCompatButton(context, attrs) {
    override fun onDraw(canvas: Canvas?) {
        Thread.sleep(400)
        super.onDraw(canvas)
    }
}