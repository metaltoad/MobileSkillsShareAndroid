package com.metaltoad.list

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.metaltoad.list.adapters.CityAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val cities = ArrayList<City>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cities.add(City("Portland, OR"))
        cities.add(City("New York, NY"))
        cities.add(City("Los Angeles, CA"))
        cities.add(City("Chicago, IL"))
        cities.add(City("Houston, TX"))
        cities.add(City("Philedelphia, PA"))
        cities.add(City("Phoenix, AZ"))
        cities.add(City("San Antonio, TX"))
        cities.add(City("San Diego, CA"))

        recyclerView.adapter = CityAdapter(cities)
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL))
    }
}
