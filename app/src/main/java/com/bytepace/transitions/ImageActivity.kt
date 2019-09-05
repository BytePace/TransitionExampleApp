package com.bytepace.transitions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.view_recycler.*

class ImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //window.allowEnterTransitionOverlap = true
        setContentView(R.layout.activity_image)
        imageView.setImageResource(intent.getIntExtra("photo", -1))
        button.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finishAfterTransition()
    }
}
