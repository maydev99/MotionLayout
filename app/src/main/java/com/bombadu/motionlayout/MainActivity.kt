package com.bombadu.motionlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test1Button.setOnClickListener {
            startActivity(Intent(this, Test1::class.java))
        }

        test2Button.setOnClickListener {
            startActivity(Intent(this, Test2::class.java))
        }

        test3Button.setOnClickListener {
            startActivity(Intent(this, Test3::class.java))
        }

        test4Button.setOnClickListener {
            startActivity(Intent(this, Test4::class.java))
        }

        test5Button.setOnClickListener {
            startActivity(Intent(this, Test5::class.java))
        }

        test6Button.setOnClickListener {
            startActivity(Intent(this, Test6::class.java))
        }

        test7Button.setOnClickListener {
            startActivity(Intent(this, Test7::class.java))
        }

        test8Button.setOnClickListener {
            startActivity(Intent(this, Test8::class.java))
        }
    }

}