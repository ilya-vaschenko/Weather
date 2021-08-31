package com.example.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val weatherAdapter : WeatherAdapter by lazy {
        WeatherAdapter()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main()

        Test.print()

        supportActionBar?.title = getFullName(packageName,"Погода")

        button.setOnClickListener {
            weatherAdapter.setWeather(Repository.weatherList )
            weatherAdapter.let {
                var layoutManager = LinearLayoutManager(this)
                Weather_t.layoutManager =
                    layoutManager
                Weather_t.adapter = it
                Weather_t.addItemDecoration(
                    DividerItemDecoration(
                        this,
                        DividerItemDecoration.VERTICAL
                    )
                )
                it.notifyDataSetChanged()
            }

        }

    }
}