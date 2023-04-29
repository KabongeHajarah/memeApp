package com.example.memeworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var ivnext:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


ivnext=findViewById(R.id.ivnext)
        ivnext.setOnClickListener {
            val intent=Intent(this, meme2Activity::class.java)
         startActivity(intent)
        }

    }
    }