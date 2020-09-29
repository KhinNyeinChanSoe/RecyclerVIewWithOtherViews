package com.example.recyclerviewwithotherview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recyclerviewwithotherview.adapter.gridAdapter
import com.example.recyclerviewwithotherview.model.detail_grid
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var grid_arr = ArrayList<detail_grid>()

        grid_arr.add(detail_grid("My Wishlist",R.drawable.ic_wishlist))
        grid_arr.add(detail_grid("My Follwoed Sellers",R.drawable.ic_best_seller))
        grid_arr.add(detail_grid("My Purchased Item",R.drawable.ic_voucher))
        grid_arr.add(detail_grid("My Coupons",R.drawable.ic_voucher))
        grid_arr.add(detail_grid("My Card Wallets",R.drawable.ic_wallet))
        grid_arr.add(detail_grid("Exp Points",R.drawable.ic_point))
        grid_arr.add(detail_grid("My Given Feedbacks",R.drawable.ic_feedback))
        grid_arr.add(detail_grid("Searched History",R.drawable.ic_history))
        grid_arr.add(detail_grid("Events and Calender",R.drawable.ic_calendar))


        var grid_adapter = gridAdapter(grid_arr)
        recyclerView_grid.layoutManager= GridLayoutManager(this,3)
        recyclerView_grid.adapter = grid_adapter

    }
}