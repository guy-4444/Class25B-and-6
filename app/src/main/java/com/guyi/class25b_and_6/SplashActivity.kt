package com.guyi.class25b_and_6

import android.animation.Animator
import android.animation.TimeInterpolator
import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.interpolator.view.animation.FastOutLinearInInterpolator
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator
import com.guyi.class25b_and_6.databinding.ActivitySplashBinding


class SplashActivity : AppCompatActivity() {

    private val ANIMATION_DURATION = 5000L

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        startAnimation(binding.imgLogo)
    }

    private fun startAnimation(view: View) {
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        view.setScaleX(0.0f)
        view.setScaleY(0.0f)
        view.setY(displayMetrics.heightPixels.toFloat() / -2.0f)
        view.setAlpha(0.0f)
        view.animate()
            .alpha(1.0f)
            .scaleY(1.0f)
            .scaleX(1.0f)
            .translationY(0F)
            .setDuration(ANIMATION_DURATION)
            .setInterpolator(FastOutLinearInInterpolator())
            .setListener(listener)
    }

    var listener: Animator.AnimatorListener = object : Animator.AnimatorListener {
        override fun onAnimationStart(animation: Animator) {
        }

        override fun onAnimationEnd(animation: Animator) {
            startApp()
        }

        override fun onAnimationCancel(animation: Animator) {
        }

        override fun onAnimationRepeat(animation: Animator) {
        }


    }

    private fun startApp() {
        startActivity(Intent(this, MainActivity::class.java))
    }
}