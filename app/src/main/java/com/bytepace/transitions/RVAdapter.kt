package com.bytepace.transitions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_recycler.view.*

class RVAdapter(private val onItemClickCallback: (textView: View, imageView: View, text: String, imageRes: Int) -> Unit): RecyclerView.Adapter<RVAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder =
        Holder(LayoutInflater.from(parent.context).inflate(R.layout.view_recycler, parent, false))

    override fun getItemCount(): Int = 8

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(position)
        holder.itemView.setOnClickListener {
            holder.apply {
                onItemClickCallback(getTextView(), getImageView(), getText(), getImageID())
            }
        }
    }


    inner class Holder(view: View): RecyclerView.ViewHolder(view) {

        private var p: Int = -1

        fun bind(position: Int) {
            p = position
            itemView.imageView.setImageResource(getImageID())
            itemView.textView.text = getText()
        }

        fun getImageView(): View = itemView.imageView

        fun getTextView(): View = itemView.textView

        fun getText(): String {
            return when (p) {
                0 -> "Honeycomb"
                1 -> "Nougat"
                2 -> "Jelly Bean"
                3 -> "And I don't know (-: ..."
                4 -> "Honeycomb"
                5 -> "Nougat"
                6 -> "Jelly Bean"
                7 -> "And I don't know (-: ..."
                else -> "Something wrong!"
            }
        }

        fun getImageID(): Int {
            return when (p) {
                0 -> R.drawable.honeycomb
                1 -> R.drawable.nougat
                2 -> R.drawable.jelly_bean
                3 -> R.drawable.mime
                4 -> R.drawable.honeycomb
                5 -> R.drawable.nougat
                6 -> R.drawable.jelly_bean
                7 -> R.drawable.mime
                else -> -1
            }
        }
    }
}