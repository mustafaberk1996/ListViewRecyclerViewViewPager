package com.example.lessonsliderlistviewrecyclerview.ui

import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lessonsliderlistviewrecyclerview.R
import com.example.lessonsliderlistviewrecyclerview.adapter.RecyclerViewAdapter
import com.example.lessonsliderlistviewrecyclerview.model.User
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : BaseActivity(), RecyclerViewAdapter.IClick {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val userList: MutableList<User> = User.getUserList()
        val adapter: RecyclerViewAdapter = RecyclerViewAdapter(this, userList)
        val layoutManager: LinearLayoutManager =
            LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
        rvUsers.layoutManager = layoutManager
        rvUsers.adapter = adapter
        adapter.clickListener = this
    }

    override fun onItemClick(user: User) {
        Toast.makeText(this, "${user.name}", Toast.LENGTH_LONG).show()
    }
}