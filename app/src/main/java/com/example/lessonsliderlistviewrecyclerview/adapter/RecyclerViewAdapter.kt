package com.example.lessonsliderlistviewrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lessonsliderlistviewrecyclerview.R
import com.example.lessonsliderlistviewrecyclerview.model.User
import org.w3c.dom.Text

class RecyclerViewAdapter(var context: Context, var userList: MutableList<User>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {


    interface  IClick{
        fun onItemClick(user:User)
    }

    lateinit var clickListener:IClick

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName: TextView = view.findViewById(R.id.tvName)



        fun bindItems(user: User) {
            tvName.text = user.name
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.cl_rv_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user: User = userList[position]
        holder.itemView.setOnClickListener {
            clickListener.onItemClick(user)
        }
        holder.bindItems(user)
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}