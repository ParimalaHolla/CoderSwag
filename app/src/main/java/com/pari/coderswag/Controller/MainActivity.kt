package com.pari.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.pari.coderswag.Adapters.CategoryRecyclerAdapter
import com.pari.coderswag.Adapters.CustomAdapter
import com.pari.coderswag.Model.Category
import com.pari.coderswag.R
import com.pari.coderswag.Services.DataService
import com.pari.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter : CategoryRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryRecyclerAdapter(this,DataService.categories){category ->
            val productIntent = Intent(this,ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productIntent)
        }
        categoriesListview.adapter = adapter
        val layoutManager = LinearLayoutManager(this)
        categoriesListview.layoutManager = layoutManager
        categoriesListview.setHasFixedSize(true)
    }
}
