package com.example.kotlintestapp

data class User (val name: String, val status: String = "user", val age: Int = 0)

    val testUser = User("Nerd", "newby", 22)
    val admin = User ("Me", "admin", 35)
