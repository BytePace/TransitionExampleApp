package com.bytepace.transitions

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.util.Pair
import android.widget.EdgeEffect
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //window.allowEnterTransitionOverlap = true
        setContentView(R.layout.activity_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerView.edgeEffectFactory = object : RecyclerView.EdgeEffectFactory() {
            override fun createEdgeEffect(view: RecyclerView, direction: Int): EdgeEffect {
                return EdgeEffect(view.context).apply { color = getColor(R.color.colorPrimary) }
            }
        }
        recyclerView.adapter = RVAdapter { textView, imageView, text, imageRes ->
            startActivity (
                Intent(baseContext, ImageTextActivity::class.java)
                .putExtra("res", imageRes)
                .putExtra("text", text),
                ActivityOptions.makeSceneTransitionAnimation (
                    this,
                    Pair(textView, "text_rv"),
                    Pair(imageView, "photo_rv")
                ).toBundle()
            )
        }
    }
}