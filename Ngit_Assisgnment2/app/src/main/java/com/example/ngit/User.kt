package com.example.ngit

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User (
    @PrimaryKey (autoGenerate = true)
    val id:Int,
    @ColumnInfo(name = "FirstName") val FirstName:String?,
    @ColumnInfo(name = "LastName") val LastName:String?,
    @ColumnInfo(name = "Rollno") val rollNo:String?,
    @ColumnInfo(name = "password") val password:String?,
    @ColumnInfo(name = "email") val email:String?



)