package com.mkrdeveloper.servicesexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mkrdeveloper.servicesexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnStart.setOnClickListener {
                startService(Intent(this@MainActivity, ExampleService::class.java))
            }
            btnStop.setOnClickListener {
                stopService(Intent(this@MainActivity, ExampleService::class.java))
            }
        }

    }
}