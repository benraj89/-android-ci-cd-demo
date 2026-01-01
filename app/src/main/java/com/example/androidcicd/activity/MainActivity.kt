package com.example.androidcicd.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidcicd.R
import com.example.androidcicd.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val unusedValue = "I am never used"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textTitle.text = getString(R.string.android_ci_cd_demo)
    }
}