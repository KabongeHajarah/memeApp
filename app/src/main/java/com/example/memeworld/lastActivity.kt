package com.example.memeworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class lastActivity : AppCompatActivity() {
    lateinit var ivpreviousLast: ImageView
    lateinit var  ivnext4: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)

        ivpreviousLast=findViewById(R.id.ivpreviousLast)
        ivpreviousLast.setOnClickListener {
            val intent= Intent(this, meme4Activity::class.java)
            startActivity(intent)
        }

    }
}