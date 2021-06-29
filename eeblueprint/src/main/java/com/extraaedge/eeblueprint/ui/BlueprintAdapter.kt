package com.extraaedge.eeblueprint.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class BlueprintAdapter<T : Any?>(items: ArrayList<T>, context: Context) :
        RecyclerView.Adapter<BlueprintAdapter<T>.ItemViewHolder>() {

    private var mItems: ArrayList<T> = items

    private var mContext: Context = context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(mContext).inflate(layout(), parent, false)
        return ItemViewHolder(view)
    }

    abstract fun layout(): Int

    abstract fun load(view: View, position: Int, item: T)

    override fun getItemCount(): Int = mItems.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        load(holder.itemView, position, getItem(position))
    }

    public fun getItem(position: Int) = mItems[position]


    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}
}