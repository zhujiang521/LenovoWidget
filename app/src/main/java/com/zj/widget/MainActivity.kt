package com.zj.widget

import android.graphics.RenderEffect
import android.graphics.Shader
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            findViewById<ImageView>(R.id.iv).setRenderEffect(RenderEffect.createBlurEffect(15F, 15F, Shader.TileMode.DECAL))
            window.addFlags(
                WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
            window.attributes.blurBehindRadius = 50;
            window.setBackgroundBlurRadius(150);
        }
        window.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
    }
}