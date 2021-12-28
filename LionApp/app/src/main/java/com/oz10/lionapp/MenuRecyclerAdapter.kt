package com.oz10.lionapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class HomeMenuItem(val title: String, val activity: Class<*>, val details: String = "") {}

class MenuRecyclerAdapter(val context: Context, val items: List<HomeMenuItem>)
    : RecyclerView.Adapter<MenuRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var itemTitle: TextView
        var itemDetail: TextView
        init {
            itemTitle = itemView.findViewById(R.id.itemTitle)
            itemDetail = itemView.findViewById(R.id.itemDetail)

            itemView.setOnClickListener { v: View ->
                // 클릭 이벤트를 구현
                context.startActivity(Intent(context, items[adapterPosition].activity))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            MenuRecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_layout_menu, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = items[position].title
        holder.itemDetail.text = items[position].details
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
