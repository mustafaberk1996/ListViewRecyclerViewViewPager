package com.example.lessonsliderlistviewrecyclerview.model

class  User(var name:String){


    companion object
    {
        fun getUserList():MutableList<User>
        {
            val userList:MutableList<User> = mutableListOf()
            userList.add(User("Mustafa Berk"))
            userList.add(User("James Harris"))
            userList.add(User("Willian Botern"))
            userList.add(User("Mesut Kurt"))
            userList.add(User("Hasan Yılmaz"))
            userList.add(User("Hüseyin Sevim"))
return userList

        }
    }
}