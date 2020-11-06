package com.ironclad.agenda.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Task(
    var title: String,
    var description: String,
    var category: String,
    var date: String,
    var time: String,
    var isFinished: String,
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
)