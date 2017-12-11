package com.metaltoad.list.adapters.viewholders

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.metaltoad.list.City
import com.metaltoad.list.R

/**
 * Created by jamessimshaw on 12/11/17.
 */
class CityViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    private lateinit var cityTextView : TextView

    init {
        if (itemView != null) {
            cityTextView = itemView.findViewById(R.id.city_name)
        }
    }

    public fun bind(city : City) {
        cityTextView.text = city.name
    }
}