package com.example.lessonsliderlistviewrecyclerview.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lessonsliderlistviewrecyclerview.R
import com.example.lessonsliderlistviewrecyclerview.adapter.ViewPagerAdapter
import com.example.lessonsliderlistviewrecyclerview.model.User
import kotlinx.android.synthetic.main.activity_slider.*

class SliderActivity:BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slider)

        val userList:MutableList<User> = User.getUserList()

        val adapter:ViewPagerAdapter = ViewPagerAdapter(this,userList)

        vpUsers.adapter = adapter
    }
}