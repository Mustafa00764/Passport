package com.example.passport.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "foydalanuvchilar")
data class User (
    val firstName:String,
    val surname:String,
    val middleName:String,
    val viloyat:String,
    val tuman:String,
    val passport:String,
    val date:String,
    val muddat:String,
    val jinsi:String,
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,

)
