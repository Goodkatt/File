package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.kvkk.*

class TelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kvkk)

        button.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@TelActivity, ViewPager::class.java))
        })
    }
}