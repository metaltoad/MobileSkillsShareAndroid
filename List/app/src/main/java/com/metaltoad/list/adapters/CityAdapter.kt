package com.metaltoad.list.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.metaltoad.list.City
import com.metaltoad.list.R
import com.metaltoad.list.adapters.viewholders.CityViewHolder

/**
 * Created by jamessimshaw on 12/11/17.
 */
class CityAdapter(val data : List<City>) : RecyclerView.Adapter<CityViewHolder>() {
    override fun onBindViewHolder(holder: CityViewHolder?, position: Int) {
        holder?.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CityViewHolder {
        return CityViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.cities_entry, parent, false))
    }
}