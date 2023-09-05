package com.example.passport.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.passport.model.User

@Database(entities = [User::class],version = 1)
abstract class AppDatabase:RoomDatabase(){
    abstract fun getUserDao():UserDao



    companion object{
        private var DB_INSTANCE:AppDatabase? = null

        fun myDB(context: Context):AppDatabase{
            if (DB_INSTANCE == null){
                DB_INSTANCE = Room.databaseBuilder(context.applicationContext,AppDatabase::class.java,"user_db").allowMainThreadQueries().build()
            }
            return DB_INSTANCE!!
        }

    }
}