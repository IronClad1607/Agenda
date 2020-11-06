package com.ironclad.agenda.domain

import com.ironclad.agenda.data.model.Task

interface TaskRepository {
    suspend fun insertTask(task: Task): Long
    suspend fun getUnfinishedTasks(): List<Task>
    suspend fun finishATask(taskId: Long)
    suspend fun deleteATask(taskId: Long)
    suspend fun getFinishedTask(): List<Task>
    suspend fun unFinishTask(taskId: Long)
}