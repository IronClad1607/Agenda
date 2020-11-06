package com.ironclad.agenda.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ironclad.agenda.data.model.Task

@Database(entities = [Task::class], version = 1)
abstract class TaskDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}