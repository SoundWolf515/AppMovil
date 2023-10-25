package com.group.t1_app.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.group.t1_app.entities.User

@Dao
interface UserDao {
    @Insert
    fun insertUser(user: User)

    @Query("SELECT * FROM User WHERE userId = :userId")
    fun getUserById(userId: Long): User
}