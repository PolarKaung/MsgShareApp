package com.henry.msgshareapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.henry.msgshareapp.adapters.HobbiesAdapter
import com.henry.msgshareapp.R
import com.henry.msgshareapp.models.Supplier
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        rvHobbies.layoutManager = layoutManager

        val adapter = HobbiesAdapter(this,
            Supplier.hobbies
        )
        rvHobbies.adapter = adapter
    }


}