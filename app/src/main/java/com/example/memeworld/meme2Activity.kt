package com.example.memeworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class meme2Activity : AppCompatActivity() {
    lateinit var ivprevious2:ImageView
    lateinit var  ivnext2:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        ivprevious2=findViewById(R.id.ivprevious2)
        ivprevious2.setOnClickListener {
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        ivnext2=findViewById(R.id.ivnext2)
        ivnext2.setOnClickListener {
            val intent=Intent(this, meme3Activity::class.java)
            startActivity(intent)
        }

    }
}