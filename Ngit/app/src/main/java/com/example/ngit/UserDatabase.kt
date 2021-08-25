package com.example.ngit

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.security.AccessControlContext

@Database(entities = [User::class] , version = 1 , exportSchema = false)
abstract class UserDatabase:RoomDatabase() {
    abstract fun userDao():UserDao


}
