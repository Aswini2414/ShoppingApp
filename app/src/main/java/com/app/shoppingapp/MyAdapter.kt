package com.app.shoppingapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.shoppingapp.databinding.ActivityMainBinding
import com.google.android.material.imageview.ShapeableImageView
import com.squareup.picasso.Picasso

class MyAdapter(val context:Context,
    val productList:List<Product>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.apply{
            val ivProduct = findViewById<ShapeableImageView>(R.id.ivProduct)
            val tvProductName = findViewById<TextView>(R.id.tvProductName)

            Picasso.get().load(productList[position].thumbnail).into(ivProduct)
            tvProductName.setText(productList[position].title)
        }
    }


}