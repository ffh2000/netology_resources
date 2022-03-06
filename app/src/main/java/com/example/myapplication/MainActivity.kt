package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupListeners()
    }

    private fun setupListeners() {
        setupSimpleAnimatorListener()
    }

    private fun setupSimpleAnimatorListener() {
        binding.simpleAnimButton.setOnClickListener {
            AnimationUtils.loadAnimation(this, R.anim.anim_demo).apply {
                it.startAnimation(this)
            }
        }
    }
}
