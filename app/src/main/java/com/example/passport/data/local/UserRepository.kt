package com.example.passport.data.local

import android.app.Application
import com.example.passport.model.User

class UserRepository(private val app: Application) {
    private val userDao = AppDatabase.myDB(app).getUserDao()

    fun saveUser(user: User)=userDao.saveUser(user)

    fun getUserById(id:Int)= userDao.getUserById(id)

    fun getAllUsers()=userDao.getAllUsers()

}