package com.example.lessonsliderlistviewrecyclerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.lessonsliderlistviewrecyclerview.R
import com.example.lessonsliderlistviewrecyclerview.adapter.ListViewAdapter
import com.example.lessonsliderlistviewrecyclerview.model.User
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : BaseActivity(), ListViewAdapter.IClick {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val userList: MutableList<User> = User.getUserList()
        val adapter = ListViewAdapter(this, userList)
        lvUsers.adapter = adapter
        adapter.clickListener = this

    }

    override fun onClick(user: User) {
        val alertDialog:AlertDialog.Builder = AlertDialog.Builder(this)
        alertDialog.setTitle(user.name)
        alertDialog.show()
    }
}