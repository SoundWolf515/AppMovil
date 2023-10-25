package com.group.t1_app.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.group.t1_app.entities.Task

@Dao
interface TaskDao {
    @Insert
    fun insertTask(task: Task)

    @Query("SELECT * FROM Task WHERE userId = :userId")
    fun getTasksByUserId(userId: Long): List<Task>
}