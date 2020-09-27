package com.example.lessonsliderlistviewrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.example.lessonsliderlistviewrecyclerview.R
import com.example.lessonsliderlistviewrecyclerview.model.User

class ViewPagerAdapter(var context: Context, var userList: MutableList<User>) : PagerAdapter() {


    override fun getCount(): Int {
        return userList.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context).inflate(R.layout.cl_slider_list_item,container,false)
        val tvName:TextView  = view.findViewById(R.id.tvName)

        val user:User = userList[position]
        tvName.text = user.name

        container.addView(view)
        return  view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view  = `object` as View
        container.removeView(view)
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

}