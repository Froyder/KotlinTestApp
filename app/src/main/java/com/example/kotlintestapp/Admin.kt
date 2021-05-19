package com.example.kotlintestapp

object Admin {

    private val userList: MutableList<User> = arrayListOf()

    fun addUser(user: User) {
        userList.add(user)
    }

    fun getUserList(): MutableList<User> {
        return userList
    }
}