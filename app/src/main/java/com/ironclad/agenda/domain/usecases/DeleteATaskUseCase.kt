package com.ironclad.agenda.domain.usecases

import com.ironclad.agenda.domain.TaskRepository

class DeleteATaskUseCase(private val taskRepository: TaskRepository) {
    suspend fun execute(taskId: Long) = taskRepository.deleteATask(taskId)
}