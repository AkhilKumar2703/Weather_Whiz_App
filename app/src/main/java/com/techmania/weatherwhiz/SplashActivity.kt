package com.techmania.weatherwhiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.techmania.weatherwhiz.databinding.ActivityMainBinding
import com.techmania.weatherwhiz.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private val binding: ActivitySplashBinding by lazy {
        ActivitySplashBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            binding.lottieAnimationViewSP.setAnimation(R.raw.splash1ani)
            binding.lottieAnimationViewSP.playAnimation()
            binding.lottieAnimationView2SP.setAnimation(R.raw.splash2ani)
            binding.lottieAnimationView2SP.playAnimation()
            finish()

        },4000)
    }
}