package com.ironclad.agenda.domain.usecases

import com.ironclad.agenda.domain.TaskRepository

class FinishATaskUseCase(private val taskRepository: TaskRepository) {
    suspend fun execute(taskId: Long) = taskRepository.finishATask(taskId)
}