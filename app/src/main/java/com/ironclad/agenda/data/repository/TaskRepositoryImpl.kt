package com.ironclad.agenda.data.repository

import com.ironclad.agenda.data.model.Task
import com.ironclad.agenda.domain.TaskRepository

class TaskRepositoryImpl(private val taskDataSource: TaskDataSource) : TaskRepository {
    override suspend fun insertTask(task: Task): Long {
        return taskDataSource.insertTask(task)
    }

    override suspend fun getUnfinishedTasks(): List<Task> {
        return taskDataSource.getUnfinishedTasks()
    }

    override suspend fun finishATask(taskId: Long) {
        taskDataSource.finishATask(taskId)
    }

    override suspend fun deleteATask(taskId: Long) {
        taskDataSource.deleteATask(taskId)
    }

    override suspend fun getFinishedTask(): List<Task> {
        return taskDataSource.getFinishedTask()
    }

    override suspend fun unFinishTask(taskId: Long) {
        return taskDataSource.unFinishedTask(taskId)
    }
}