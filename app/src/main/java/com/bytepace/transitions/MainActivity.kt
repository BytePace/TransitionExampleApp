package com.bytepace.transitions

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.allowEnterTransitionOverlap = true
        setContentView(R.layout.activity_main)

        iv1.setOnClickListener {
            startActivity(Intent(this, ImageActivity::class.java).putExtra("photo", R.drawable.honeycomb),
                ActivityOptions.makeSceneTransitionAnimation(this, iv1, "photo").toBundle())
        }
        iv2.setOnClickListener {
            startActivity(Intent(this, ImageActivity::class.java).putExtra("photo", R.drawable.nougat),
                ActivityOptions.makeSceneTransitionAnimation(this, iv2, "photo").toBundle())
        }
        iv3.setOnClickListener {
            startActivity(Intent(this, ImageActivity::class.java).putExtra("photo", R.drawable.mime),
                ActivityOptions.makeSceneTransitionAnimation(this, iv3, "photo").toBundle())
        }
        iv4.setOnClickListener {
            startActivity(Intent(this, ImageActivity::class.java).putExtra("photo", R.drawable.jelly_bean),
                ActivityOptions.makeSceneTransitionAnimation(this, iv4, "photo").toBundle())
        }

        button.setOnClickListener {
            startActivity(Intent(this, RecyclerViewActivity::class.java))
        }
    }
}
