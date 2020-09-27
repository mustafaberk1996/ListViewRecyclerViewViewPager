package com.example.lessonsliderlistviewrecyclerview.ui

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.example.lessonsliderlistviewrecyclerview.Constants
import com.example.lessonsliderlistviewrecyclerview.R

open class BaseActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val actionBar: ActionBar? = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setHomeButtonEnabled(true)
        actionBar?.title   = intent.getStringExtra(Constants.PAGE_TITLE)
        actionBar?.show()
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==android.R.id.home)
        {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}