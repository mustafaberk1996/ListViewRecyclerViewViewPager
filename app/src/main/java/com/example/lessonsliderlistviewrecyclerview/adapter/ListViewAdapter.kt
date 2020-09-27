package com.example.lessonsliderlistviewrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.lessonsliderlistviewrecyclerview.R
import com.example.lessonsliderlistviewrecyclerview.model.User

class ListViewAdapter(var context: Context, var userList: MutableList<User>) : BaseAdapter() {


    interface IClick {
        fun onClick(user: User)
    }

    lateinit var clickListener: IClick
    override fun getCount(): Int {
        return userList.size
    }

    override fun getItem(p0: Int): Any {
        return userList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return 1
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        val view = LayoutInflater.from(context).inflate(R.layout.cl_listview_item, p2, false)

        val tvName: TextView = view.findViewById(R.id.tvName)
        tvName.text = userList[p0].name

        view.setOnClickListener {

            clickListener.onClick(userList[p0])

        }

        return view
    }
}