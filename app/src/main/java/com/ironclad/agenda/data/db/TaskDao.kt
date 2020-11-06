package com.ironclad.agenda.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.ironclad.agenda.data.model.Task

@Dao
interface TaskDao {

    @Insert
    suspend fun insertTask(task: Task): Long

    @Query("SELECT * FROM TASK WHERE isFinished == 0")
    suspend fun getUnfinishedTasks(): List<Task>

    @Query("UPDATE TASK SET isFinished = 1 WHERE id = :taskId")
    suspend fun finishATask(taskId: Long)

    @Query("DELETE FROM TASK WHERE id = :taskId")
    suspend fun deleteATask(taskId: Long)

    @Query("SELECT * FROM TASK WHERE isFinished == 1")
    suspend fun getFinishedTask(): List<Task>

    @Query("UPDATE TASK SET isFinished = 0 WHERE id = :taskId")
    suspend fun unFinishATask(taskId: Long)
}