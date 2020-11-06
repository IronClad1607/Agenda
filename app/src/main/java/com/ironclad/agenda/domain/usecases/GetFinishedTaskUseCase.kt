package com.ironclad.agenda.domain.usecases

import com.ironclad.agenda.domain.TaskRepository

class GetFinishedTaskUseCase(private val taskRepository: TaskRepository) {
    suspend fun execute() = taskRepository.getFinishedTask()
}