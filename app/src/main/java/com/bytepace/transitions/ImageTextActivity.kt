package com.bytepace.transitions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_image_text.*

class ImageTextActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //window.allowEnterTransitionOverlap = true
        setContentView(R.layout.activity_image_text)
        button.setOnClickListener {
            onBackPressed()
        }
        imageView.setImageResource(intent.getIntExtra("res", -1))
        textView.text = intent.getStringExtra("text")
    }

    override fun onBackPressed() {
        finishAfterTransition()
    }
}