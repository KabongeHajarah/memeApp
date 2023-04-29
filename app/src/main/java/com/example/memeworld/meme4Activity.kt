package com.example.memeworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class meme4Activity : AppCompatActivity() {
    lateinit var ivprevious4: ImageView
    lateinit var  ivnext4: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)


        ivprevious4=findViewById(R.id.ivprevious4)
        ivprevious4.setOnClickListener {
            val intent= Intent(this, meme3Activity::class.java)
            startActivity(intent)
        }

        ivnext4=findViewById(R.id.ivnext4)
        ivnext4.setOnClickListener {
            val intent= Intent(this, lastActivity::class.java)
            startActivity(intent)
        }
    }
}