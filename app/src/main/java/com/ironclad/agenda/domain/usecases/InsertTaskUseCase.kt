package com.ironclad.agenda.domain.usecases

import com.ironclad.agenda.data.model.Task
import com.ironclad.agenda.domain.TaskRepository

class InsertTaskUseCase(private val taskRepository: TaskRepository) {
    suspend fun execute(task: Task): Long = taskRepository.insertTask(task)
}