package com.example.memeworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class meme3Activity : AppCompatActivity() {
    lateinit var ivprevious3: ImageView
    lateinit var  ivnext3: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        ivprevious3=findViewById(R.id.ivprevious3)
        ivprevious3.setOnClickListener {
            val intent= Intent(this, meme2Activity::class.java)
            startActivity(intent)
        }

        ivnext3=findViewById(R.id.ivnext3)
        ivnext3.setOnClickListener {
            val intent= Intent(this, meme4Activity::class.java)
            startActivity(intent)
        }
    }
}