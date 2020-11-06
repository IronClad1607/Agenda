package com.ironclad.agenda.domain.usecases

import com.ironclad.agenda.data.model.Task
import com.ironclad.agenda.domain.TaskRepository

class GetUnfinishedTaskUseCase(private val taskRepository: TaskRepository) {
    suspend fun execute(): List<Task> = taskRepository.getUnfinishedTasks()
}