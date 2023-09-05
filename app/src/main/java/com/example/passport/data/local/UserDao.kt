package com.example.passport.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.passport.model.User

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveUser(user: User)

    @Query("SELECT * FROM foydalanuvchilar ")
    fun getAllUsers():List<User>

    @Query("SELECT * FROM foydalanuvchilar WHERE id=:id")
    fun getUserById(id:Int):User

}