package com.ironclad.agenda.data.repository

import com.ironclad.agenda.data.model.Task
import com.ironclad.agenda.domain.TaskRepository

class TaskRepositoryImpl:TaskRepository {
    override suspend fun insertTask(task: Task): Long {
        TODO("Not yet implemented")
    }

    override suspend fun getUnfinishedTasks(): List<Task> {
        TODO("Not yet implemented")
    }

    override suspend fun finishATask(taskId: Long) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteATask(taskId: Long) {
        TODO("Not yet implemented")
    }

    override suspend fun getFinishedTask(): List<Task> {
        TODO("Not yet implemented")
    }

    override suspend fun unFinishTask(taskId: Long) {
        TODO("Not yet implemented")
    }
}