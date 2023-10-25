package com.group.t1_app

import androidx.room.Database
import androidx.room.RoomDatabase
import com.group.t1_app.dao.TaskDao
import com.group.t1_app.dao.UserDao
import com.group.t1_app.entities.Task
import com.group.t1_app.entities.User

@Database(entities = [User::class, Task::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun taskDao(): TaskDao
}