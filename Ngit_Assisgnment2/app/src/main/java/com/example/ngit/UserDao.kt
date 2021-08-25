package com.example.ngit

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UserDao {
    @Insert
    suspend fun insertUser(user: User)

    @Query("SELECT * FROM user_table")
    fun realAllData(): LiveData<List<User>>

    @Query("SELECT * FROM user_table WHERE rollno LIKE :rollno")
    suspend fun getPassword(rollno:String): List<User>

    @Delete
    suspend fun deleteUser(user: User)

    @Update
    suspend fun updateUser(user: User)
}