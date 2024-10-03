package com.example.onlineshop.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.onlineshop.MainActivity
import com.example.onlineshop.R
import com.example.onlineshop.databinding.ActivityIntroBinding

class introActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityIntroBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.starBtn.setOnClickListener{
            startActivity(Intent(this@introActivity,MainActivity::class.java))



        }

    }
    }
