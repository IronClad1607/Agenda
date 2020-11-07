package com.ironclad.agenda.data.repository

import com.ironclad.agenda.data.db.TaskDao
import com.ironclad.agenda.data.model.Task
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class TaskDataSource(private val taskDao: TaskDao) {

    suspend fun insertTask(task: Task): Long {
        var id: Long = -1
        CoroutineScope(Dispatchers.IO).launch {
            val idAsync = async { taskDao.insertTask(task) }
            id = idAsync.await()
        }
        return id
    }

    suspend fun getUnfinishedTasks(): List<Task> {
        return taskDao.getUnfinishedTasks()
    }

    suspend fun finishATask(taskId: Long) {
        CoroutineScope(Dispatchers.IO).launch {
            taskDao.finishATask(taskId)
        }
    }

    suspend fun deleteATask(taskId: Long) {
        CoroutineScope(Dispatchers.IO).launch {
            taskDao.deleteATask(taskId)
        }
    }

    suspend fun getFinishedTask(): List<Task> {
        return taskDao.getFinishedTask()
    }

    suspend fun unFinishedTask(taskId: Long) {
        CoroutineScope(Dispatchers.IO).launch {
            taskDao.unFinishATask(taskId)
        }
    }
}