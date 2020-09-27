package com.example.lessonsliderlistviewrecyclerview.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lessonsliderlistviewrecyclerview.Constants
import com.example.lessonsliderlistviewrecyclerview.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun goListView(view: View) {
        val intent: Intent = Intent(this, ListViewActivity::class.java)
        intent.putExtra(Constants.PAGE_TITLE,"User List via ListView")
        startActivity(intent)
    }

    fun goSlider(view: View) {
        val intent: Intent = Intent(this, SliderActivity::class.java)
        intent.putExtra(Constants.PAGE_TITLE,"User List via ViewPager")
        startActivity(intent)
    }

    fun goRecyclerView(view: View) {
        val intent: Intent = Intent(this, RecyclerViewActivity::class.java)
        intent.putExtra(Constants.PAGE_TITLE,"User List via RecyclerView")
        startActivity(intent)
    }

}