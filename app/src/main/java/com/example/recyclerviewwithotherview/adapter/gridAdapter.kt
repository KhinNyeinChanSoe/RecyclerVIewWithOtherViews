package com.example.recyclerviewwithotherview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithotherview.R
import com.example.recyclerviewwithotherview.model.detail_grid
import kotlinx.android.synthetic.main.detailgrid.view.*

class gridAdapter (var gridArr:ArrayList<detail_grid>):RecyclerView.Adapter<gridAdapter.gridViewHolder>(){

    class gridViewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
        fun bind(detailGrid:detail_grid){
            itemView.grid_icon_image.setImageResource(detailGrid.image)
            itemView.grid_name.text = detailGrid.name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): gridViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.detailgrid,parent,false)
        return gridViewHolder(view)
    }

    override fun onBindViewHolder(holder: gridViewHolder, position: Int) {
        holder.bind(gridArr[position])
    }

    override fun getItemCount(): Int = gridArr.size
}