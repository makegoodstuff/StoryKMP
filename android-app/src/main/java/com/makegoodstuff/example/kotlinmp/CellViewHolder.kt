package com.makegoodstuff.example.kotlinmp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.makegoodstuff.example.kotlinmp.R

internal class CellViewHolder(root: View) : RecyclerView.ViewHolder(root) {
    val primaryTv: TextView = root.findViewById(R.id.textView)
}
