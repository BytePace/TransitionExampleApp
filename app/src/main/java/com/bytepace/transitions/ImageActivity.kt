package com.bytepace.transitions

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Explode
import android.view.Window
import kotlinx.android.synthetic.main.view_image.*

class ImageActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.allowEnterTransitionOverlap = true
        setContentView(R.layout.activity_image)
        imageView.setImageResource(intent.getIntExtra("photo", -1))
    }

    override fun onBackPressed() {
        finishAfterTransition()
    }
}
